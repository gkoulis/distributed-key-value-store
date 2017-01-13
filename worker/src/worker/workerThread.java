package worker;

// Imports
import java.util.logging.Level;
import java.util.logging.Logger;


class workerThread extends Thread{
    
    
    public String get(String key) {
        
        try {
            return Worker.keyValue.get(key).toString();
        }
        catch(NullPointerException e) {
            return "*";
        }
        
    } // End get
    
    
    public void put(String key, String value) {
        
        Worker.keyValue.put(key, value);
        
    } // End put
    
    
} // End worketThread
