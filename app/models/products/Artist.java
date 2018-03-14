package models.products;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Artist extends  Model{
    @Id
    private long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String genre;
    @Constraints.Required
    private String city;
    @Constraints.Required
    private String country;

    public Artist() {
    }

    public Artist(String name, String genre, String city, String country) {
        this.name = name;
        this.genre = genre;
        this.city = city;
        this.country = country;
    }

    public long getId() { 
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

    public void setId(long id) {
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
    public static Finder<String, Artist> find = new Finder<String, Artist>(Artist.class);
    
        public static List<Artist> findAll() {
            return Artist.find.all();
        }
    
    
}