/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodMood.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author cmgoe
 */
public class UserList {
    private ArrayList<User> theUsers;
    
    public UserList () {
        theUsers = readUsers();
        if(theUsers == null){
            theUsers = new ArrayList<User>();
        }
    }
    
    public ArrayList<User> readUsers(){
        System.out.println("Reading in users from database");
        ArrayList<User> dummyUsers = new ArrayList<User>(Arrays.asList(new User("user1", "pass1","rob"), new User("user2", "pass2","joe"), new User("user3", "pass3","bob")));
        
        return dummyUsers;
    }
    
    public boolean authenticate(){
        
        return true;
    }
}
