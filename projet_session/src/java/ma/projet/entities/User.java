package ma.projet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id ;
    protected String email;
    protected String password;
   // private int loggedornot ;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        //this.loggedornot = loggedornot;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", password=" + password + '}';
    }

    /**
     * @return the loggedornot
     */
//    public int getLoggedornot() {
//        return loggedornot;
//    }
//
//    /**
//     * @param loggedornot the loggedornot to set
//     */
//    public void setLoggedornot(int loggedornot) {
//        this.loggedornot = loggedornot;
//    }
    
    
    
    
    
}
