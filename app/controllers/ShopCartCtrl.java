package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;


import models.users.*;
import models.products.*;
import models.shopping.*;
import controllers.security.*;


@Security.Authenticated(Secured.class)
@With(IfCustomer.class)
public class ShopCartCtrl extends Controller {

    private FormFactory formFactory;
    private Environment env;


    @Inject
    public ShopCartCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    @Transactional
    public Result addToBasket(Long id) {
        Product p = Product.find.byId(id);
        Customer customer = (Customer)Member.getLoggedIn(session().get("email"));
      
      
        if (customer.getBasket() == null) {
        
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        customer.update();
       
        customer.getBasket().addProduct(p);
        customer.update();
    
        
        return ok(basket.render(customer));
    }

    @Transactional
    public Result showBasket() {
        return ok(basket.render(getCurrentUser()));
    }
    
    

    @Transactional
    public Result addOne(Long itemId, Long pid) {

    OrderItem item = OrderItem.find.byId(itemId);  
    Product p = Product.find.byId(pid);
        
    if(p.decrementStock()){
                
    item.increaseQty();
     
    item.update();
    p.update();
    } else{
    flash("success", "Sorry, no more of these products left");
    }
        return redirect(routes.ShopCartCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long itemId) {
        OrderItem item = OrderItem.find.byId(itemId);
 
        Customer c = getCurrentUser();
  
        c.getBasket().removeItem(item);
        c.getBasket().update();

        return ok(basket.render(c));
    }


    @Transactional
    public Result emptyBasket() {
        
        Customer c = getCurrentUser();
        c.getBasket().removeAllItems();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }


    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render(getCurrentUser(), order));
    }

    private Customer getCurrentUser() {
		return (Customer)Member.getLoggedIn(session().get("email"));
    }

    
    
    @Transactional
    public Result placeOrder() {
        Customer c = getCurrentUser();
        ShopOrder order = new ShopOrder();
    
        order.setCustomer(c);
        order.setItems(c.getBasket().getBasketItems());
        order.save();
        for (OrderItem i: order.getItems()) {
            i.setOrder(order);
            i.setBasket(null);
            i.update();
        }
        order.update();
        c.getBasket().setBasketItems(null);
        c.getBasket().update();
        return ok(orderConfirmed.render(c, order));
    }

}