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
class Node {
    Item data;
	Node next;
	Node (Item data) {
	this.data = (Item) data.clone();  
        }

	Node(Item data,Node node){
		this.data=data;
		next=node;
        }
}
