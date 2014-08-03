/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package item;

/**
 *
 * @author TruongLX
 */
public class NumeralItem implements Item {

	private final int value;

	public NumeralItem(int value){
		this.value=value;
	}


       
	public Item clone(){
		return null ;
	}

      
	public String toString(){
		return ""+value;
	}

	public boolean equals(MyList mylist) {
		return false;
	}

}