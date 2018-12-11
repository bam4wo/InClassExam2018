package com.exam;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;
	
	public Ticket(String origin, String destination, int price, int quantity) {
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Ticket() {
		
	}
	
	public void  print(){
		System.out.println(origin+"\t"+destination+"\t"+price+"\t"+quantity+"\t"+price*quantity);
		
	}
    
	
	/*public String met(){
		String one = origin + destination;
		return one;
	}
	
	public int num() {
		int number = price;
		return number;
	}
	
	public int numm() {
		int number2 = quantity;
		return number2;

	}*/
	public int allPrice() {
		int allPrice = price*quantity;
		return allPrice;
	}

}
