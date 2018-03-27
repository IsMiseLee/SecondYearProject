package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Product extends  Model{
    @Id
    private long id ;

    @Constraints.Required
    private String album_name;

    @Constraints.Required
    private String year;

    @Constraints.Required
    private String type;

    @Constraints.Required
    private double price;
    
    @Constraints.Required
    private int stock;

    public Product() {
    }

    public Product(long id, String album_name, String year, String type, double price, int stock) {
        this.id = id;
        this.album_name = album_name;
        this.year = year;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
  
    public static Finder<Long, Product> find = new Finder<Long, Product>(Product.class);
    
    private List<Long> catSelect = new ArrayList<Long>();

        public static List<Product> findAll() {
            return Product.find.all();
        }
        
        public boolean decrementStock(){
            boolean allowed =true;
            if ((stock-1) < 0){
                allowed = false;
            }else{
                stock = stock-1;
            }
            return allowed;
        }

        public void incrementStock(int q){          
            stock = stock +q;
        }

        public List<Long> getCatSelect(){
            return catSelect;
        }
        public void setCatSelect(List<Long> catSelect){
            this.catSelect = catSelect;
        }

        public static List<Product> findAll(String filter) {
            return Product.find.query().where()
                            // name like filter value (surrounded by wildcards)
                            .ilike("album_name", "%" + filter + "%")
                            .orderBy("album_name asc")
                            .findList();
        }
        
        // Find all Products for a category
        // Filter product name 
        public static List<Product> findFilter(Long catID, String filter) {
            return Product.find.query().where()
                            // Only include products from the matching cat ID
                            // In this case search the ManyToMany relation
                            .eq("categories.id", catID)
                            // name like filter value (surrounded by wildcards)
                            .ilike("name", "%" + filter + "%")
                            .orderBy("name asc")
                            .findList();
        }
    
    
}