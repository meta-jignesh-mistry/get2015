
package socialnetwork;


public class Graph implements IConnection{

    @Override
    public void addConnection(Entity e1, Entity e2) {
    	if(e1.email.equals(e2.email)){
    	
    	System.out.println("\nSorry You can't add yourself as Friend");
        		
    	}
    	else{
        e1.friends.put(e2.email,e2.email);
        e2.friends.put(e1.email,e1.email);
        
        System.out.println("Friend/Member Added Successfully");
    	}
    }

    @Override
    public void removeConnection(Entity e1, Entity e2) {
    e1.friends.remove(e2.email);
    e2.friends.remove(e1.email);
    System.out.println("Friend/Member Removed Successfully");
    }

  
    
    
}
