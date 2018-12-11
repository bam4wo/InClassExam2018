package com.exam;

public class Order {
	public Order() {
		
	}
	
	public void add(Ticket ticket) {
		//System.out.println(t.met()+t.num()+t.numm()+t.allPrice());
		/*t.met();
		t.num();
		t.numm();*/
		/*Ticket tic = new Ticket();
		tic.print();
		tic = new Ticket();
		tic.print();*/
		ticket.print();
	}
	
	public void print() {
		Ticket a = new Ticket();
		//System.out.println(a.met()+a.num()+a.numm()+a.allPrice());
	}
}
