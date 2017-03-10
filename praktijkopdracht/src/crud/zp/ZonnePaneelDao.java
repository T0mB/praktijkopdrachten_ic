package crud.zp;


import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.math.BigInteger;
import java.util.ArrayList; 
import java.util.List;  

public class ZonnePaneelDao { 
   public List<Zpreq> getAllZonnepaneel(){ 
      
      List<Zpreq> zpList = null; 
      try { 
         File file = new File("Zonnepanelen.dat"); 
         if (!file.exists()) { 
            Zpreq Zpreq = new Zpreq();
            Zpreq.setCode(BigInteger.valueOf(10));
            Zpreq.setPostcode("2340KL");
            zpList = new ArrayList<Zpreq>(); 
            zpList.add(Zpreq); 
            saveZpList(zpList); 
         } 
         else{ 
            FileInputStream fis = new FileInputStream(file); 
            ObjectInputStream ois = new ObjectInputStream(fis); 
            zpList = (List<Zpreq>) ois.readObject(); 
            ois.close(); 
         } 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } catch (ClassNotFoundException e) { 
         e.printStackTrace(); 
      }   
      return zpList; 
   } 
   private void saveZpList(List<Zpreq> zpList){ 
      try { 
         File file = new File("Zonnepanelen.dat"); 
         FileOutputStream fos;  
         fos = new FileOutputStream(file); 
         ObjectOutputStream oos = new ObjectOutputStream(fos); 
         oos.writeObject(zpList); 
         oos.close(); 
      } catch (FileNotFoundException e) { 
         e.printStackTrace(); 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } 
   }    
}