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
    private String art_name;

    @Constraints.Required
    private double price;
    
    @Constraints.Required
    private int stock;


   
    @ManyToMany(cascade = CascadeType.ALL,mappedBy="products")
    public List<Artist> artists;

    public Product() {
    }

    public Product(long id, String album_name, String year, String art_name, double price, int stock) {
        this.id = id;
        this.album_name = album_name;
        this.year = year;
        this.art_name = art_name;
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

    public String getArt_name() {
        return art_name;
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

    public void setArt_name(String art_name) {
        this.art_name = art_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
  
    public static Finder<Long, Product> find = new Finder<Long, Product>(Product.class);
    
    private List<Long> artSelect = new ArrayList<Long>();

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

       
        public List<Long> getArtSelect(){
            return artSelect;
        }
        public void setArtSelect(List<Long> artSelect){
            this.artSelect = artSelect;
        }

        public static List<Product> findAll(String filter) {
            return Product.find.query().where()
                            .ilike("album_name", "%" + filter + "%")
                            .orderBy("album_name asc")
                            .findList();
        }
        
      
        public static List<Product> findFilter(Long artID, String filter) {
            return Product.find.query().where()
                            .eq("artists.id", artID)
                            .ilike("genre", "%" + filter + "%")
                            .orderBy("genre asc")
                            .findList();
        }

    
}