/*
 * Copyright 2015 SiyuTAO
 */
package user;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SiyuTao
 */
public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    
    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set a = new HashSet();
        a.add(1212);
        User Kathryn = new User("blondiebytes", "hello world", 10, a);
        
    }
    
}
