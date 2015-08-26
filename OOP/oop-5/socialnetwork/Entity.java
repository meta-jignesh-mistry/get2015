
package socialnetwork;

import java.util.HashMap;

//super class of person and organization class
public class Entity {
    String email;
    String name;
    HashMap<String,String> friends=new HashMap<String,String>();
    public Entity(String email, String name) {
        this.email = email;
        this.name = name;
    }
    

    
    }
