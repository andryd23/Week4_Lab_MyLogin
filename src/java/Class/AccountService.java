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
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public User login (String username, String password) {
      
      if((username.equals("adam") || username.equals("betty")) && password.equals("password")) {
          return new User(username, null);
      }
      return null;
  }

    private static class User {

        public User() {
        }

        private User(String username, Object object) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
