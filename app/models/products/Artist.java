package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Artist extends  Model{
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String genre;
    @Constraints.Required
    private String city;
    @Constraints.Required
    private String country;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products;


    public Artist() {
    }

    public Artist(String name, String genre, String city, String country) {
        this.name = name;
        this.genre = genre;
        this.city = city;
        this.country = country;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Long getId() { 
        return id;
    } 

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public static Finder<Long, Artist> find = new Finder<Long, Artist>(Artist.class);
    
    public static List<Artist> findAll() {
        return Artist.find.query().where().orderBy("name asc").findList();
    }
        

    public static Map<String, String> options() {
        LinkedHashMap<String, String> options = new LinkedHashMap();

        for (Artist a: Artist.findAll()) {
            options.put(a.getId().toString(), a.getGenre());
        }
        
        return options;
    }
               
                public static boolean inArtist(Long artist, Long product) {
                    return find.query().where()
                        .eq("products.id", product)
                        .eq("id", artist)
                        .findCount() > 0;
                }
    
    
    
}