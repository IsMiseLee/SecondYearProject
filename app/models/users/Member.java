package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import models.shopping.*;



@Entity
@Table(name = "member")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role")
@DiscriminatorValue("member")
public class Member extends Model {
    @Id
    private String email;

    @Constraints.Required
    private String role;    

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

  
    // @OneToMany(mappedBy="member", cascade = CascadeType.ALL)
    // private Basket basket;

  
    // @OneToMany(mappedBy="member", cascade = CascadeType.ALL)
    // private List<ShopOrder> orders;

    public static Finder<String, Member> find = new Finder<String, Member>(Member.class);
    
        public static List<Member> findAll() {
            return Member.find.all();
        }
    
        public static Member authenticate(String email, String password) {
            return find.query().where().eq("email", email).eq("password", password).findUnique();
        }

    public Member() {
    }
       
        public  Member(String email, String role, String name, String password) {
            this.email = email;
            this.role = role;
            this.name = name;
            this.password = password;
        }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
    }

   

    public static Member getLoggedIn(String id) {
        if (id == null) {
            return null;
        }
        else {
            return find.byId(id);
        }
    }

    public static Member getMemberById(String id){ 
         if(id ==null)
         return null;
         else 
         return find.byId(id);
    }

    

}