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
public class Test{
    public static void main(String args[]){
	MyList l = new MyList();
        MyList l2 = new MyList();
	l.append(new NumeralItem(1));
	l.append(new NumeralItem(2));
	l2.append(new StringItem("Oop"));
	l2.append(new StringItem("he"));
        l2.append(new StringItem("2014"));
	l.print();
	l2.print();
	l.appendList(l2);
	l.print();
	}

}

