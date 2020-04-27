/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Internal extends Trip implements Methods
{
    public int noofavab;

    public int getNoofavab() {
        return noofavab;
    }

    public void setNoofavab(int noofavab) {
        this.noofavab = noofavab;
    }
    @Override
    public double discount(double s ){
        s=0.5*s;
        return s;
       }

    

    Customer c=new Customer();
  
 Vehicles l=new Limousine(noofavab);
 Vehicles b=new Bus(noofavab);
 Vehicles m=new Minibus(noofavab);

    public Internal(double price, String traveldate, String returndate, String destination, String currentloc, String drivername,int noofStops, String methodoftrans,String nooftrip) {
        super(price, traveldate, returndate, destination, currentloc, drivername, noofStops, methodoftrans, nooftrip);
    }

    public Internal() {
        super();
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

    boolean contains(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
//  public void booking(Internal s)
//  {
//      Customer c=new Customer();
//      
//  }
    public ArrayList<Internal> intern=new ArrayList<>();
  public int deleteinttrip(String choice,String text){
      int flag=0;
  
   if("Delete Internal Trip".equals(choice))
        { 
            Files f =new Files();
           
    try {
            intern=f.Readintern();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IntScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
          for(int i=0;i<intern.size();i++)
        {
            Internal t;
            t=intern.get(i);
            if(t.getNooftrip().equalsIgnoreCase(text))
            {
             flag=1;  
             intern.remove(t);
                try {
                    f.Appendintern(intern);
                } catch (IOException ex) {
                    Logger.getLogger(DeleteTrips.class.getName()).log(Level.SEVERE, null, ex);
                }   
                JOptionPane.showMessageDialog(null,"Trip deleted successfully!");
        }
        } 
     }
  
  return flag;     
  }
}
