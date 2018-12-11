package com.exam;

import java.util.ArrayList;

public class Order {
	public Order() {
	
	}
	
	ArrayList machine = new ArrayList();
	public void add(Ticket ticket) {
		machine.add(ticket);
		ticket.print();
	}
	
	public void print() {
		
	}
}
