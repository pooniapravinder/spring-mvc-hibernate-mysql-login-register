package hibernate.mapping;
// Generated Jan 13, 2021 09:08:40 AM by Hibernate Tools 4.3.1



/**
 * Accounts generated by hbm2java
 */
public class Accounts  implements java.io.Serializable {


     private long id;
     private String userName;
     private String email;
     private String password;

    public Accounts() {
    }

    public Accounts(String userName, String email, String password) {
       this.userName = userName;
       this.email = email;
       this.password = password;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

