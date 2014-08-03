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

public class StringItem implements Item{

	private String value;

	public StringItem(String value){
		this.value=value;
	}


	public Item clone(){
		return null;
	}

	public String toString(){
		return value;
	}


	public boolean equals(MyList mylist) {
		// TODO Auto-generated method stub
		return false;
	}


}