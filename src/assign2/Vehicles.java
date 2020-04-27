/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

public abstract class Vehicles {
    
         protected int model;

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
	 protected int maxSeats;

	public Vehicles(int maxSeats) {
		
		this.maxSeats = maxSeats;
	}

	public int getMaxSeats() {
		return maxSeats;
	}

	public void setMaxSeats(int maxSeats) {
		this.maxSeats = maxSeats;
	}
	
    
}
