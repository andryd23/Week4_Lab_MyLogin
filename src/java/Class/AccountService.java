/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 832465
 */
public class AccountService implements Serializable {


    
  
    public User login (String username, String password) {
      
      if((username.equals("adam") || username.equals("betty")) && password.equals("password")) {
          User user = new User(username, password);
          return user;
      }
      return null;
  }

    
}
