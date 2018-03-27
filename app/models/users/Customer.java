package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;

@Entity
@DiscriminatorValue("customer")
public class Customer extends Member{
	
	private String street1;
	private String street2;
    private String city;
    private String creditCard;

   
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
	
	public Customer(String email, String role, String name, String password, String street1, String street2, String city, String creditCard)
	{
		super(email, role, name, password);
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
		this.creditCard = creditCard;
	}

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }
    

}