/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class External extends Trip implements Methods {
    	private ArrayList<String> ExternalTrips = new ArrayList<>();
            public int noofavab;

    public int getNoofavab() {
        return noofavab;
    }
    
     @Override
 public boolean enoughseats()
 {
	 boolean flag; //boolean is initi with FALSE
	 if(noofavab>c.noofBooked)
		 flag=true;
	 else flag=false;
	  return flag;
 } 
    public void setNoofavab(int noofavab) {
        this.noofavab = noofavab;
    }

    public External(int noofavab, double price, String traveldate, String returndate, String destination, String currentloc, String drivername, int noofStops, String methodoftrans,String nooftrip) {
        super(price, traveldate, returndate, destination, currentloc, drivername, noofStops, methodoftrans, nooftrip);
        this.noofavab = noofavab;
    }

            @Override
            public double discount(double s ){
        s=0.5*s;
        return s;
       }
    
    
    public External() {
        super();
    }
    Customer c=new Customer();
   
  


  public ArrayList<External> extern;
           public int deleteextrip(String choice,String text)
           {int flag=0;
if("Delete External Trip".equals(choice))
        {
            Files f =new Files();
          
    try {
            extern=f.Readextern();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IntScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
          for(int i=0;i<extern.size();i++)
        {
           
            External t;
            t=extern.get(i);
            if(t.getNooftrip().equalsIgnoreCase(text))
            {
               flag=1;
                    extern.remove(t);
             try {
                    f.Appendextern(extern);
                } catch (IOException ex) {
                    Logger.getLogger(DeleteTrips.class.getName()).log(Level.SEVERE, null, ex);
                }                JOptionPane.showMessageDialog(null,"Trip deleted successfully!");

            } 
        }} 

return flag;
           }
    	
}
