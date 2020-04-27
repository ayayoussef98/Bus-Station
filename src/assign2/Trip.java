/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trip{

        private double price;
	private String traveldate;
	private String returndate;
	private String destination;
	private String currentloc;
        private String drivername;
        private int noofStops;
        private String methodoftrans;
        private String nooftrip;
         public ArrayList <External> drivertripex (String s){
        ArrayList<External> drivers2= new ArrayList<External>();
        ArrayList<External> extern= new ArrayList<External>();
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
            if(t.getDrivername().equalsIgnoreCase(s))
            {
               drivers2.add(t);
            }}
        return drivers2;
    }   
                public ArrayList <Internal> drivertripin (String s){
        ArrayList<Internal> drivers2= new ArrayList<Internal>();
        ArrayList<Internal> intern= new ArrayList<Internal>();
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
            if(t.getDrivername().equalsIgnoreCase(s))
            {
               drivers2.add(t);
            }}
        return drivers2;
    }                                        



    public String getNooftrip() {
        return nooftrip;
    }

    public void setNooftrip(String nooftrip) {
        this.nooftrip = nooftrip;
    }

    public String getMethodoftrans() {
        return methodoftrans;
    }

    public void setMethodoftrans(String methodoftrans) {
        this.methodoftrans = methodoftrans;
    }
  
     
    public int getNoofStops() {
        return noofStops;
    }

    public void setNoofStops(int noofStops) {
        this.noofStops = noofStops;
    }

    public Trip(double price, String traveldate, String returndate, String destination, 
        String currentloc, String drivername, int noofStops, String methodoftrans,String nooftrip) {
        this.price = price;
        this.traveldate = traveldate;
        this.returndate = returndate;
        this.destination = destination;
        this.currentloc = currentloc;
        this.drivername = drivername;
        this.noofStops =noofStops;
        this.methodoftrans= methodoftrans;
        this.nooftrip= nooftrip;
    }

    public Trip() {
    }


    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    
   

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCurrentloc() {
		return currentloc;
	}

	public void setCurrentloc(String currentloc) {
		this.currentloc = currentloc;
	}
     public void booking()
     {
         
     }
  
}
