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
    
  
    public static Finder<String, Product> find = new Finder<String, Product>(Product.class);
    
        public static List<Product> findAll() {
            return Product.find.all();
        }
    
    
    
}