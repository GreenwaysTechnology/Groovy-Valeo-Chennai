package com.valeo.ts;

import com.valeo.ts.admin.Admin; //import only Admin class 
//import com.valeo.ts.admin.*; // import all files from admin folder ,not subfolder files
import com.valeo.ts.tickets.Ticket;

public class ValeoTickingSystem {

	public static void main(String[] args) {
		
		Ticket ticket = new Ticket(12, "Open", "Low", "Project field not found", "Project field not found");
		System.out.println(ticket);

		Admin admin = new Admin(1233, "Smart Office");
		System.out.println(admin);

		Author author = new Author("Valeo");
		System.out.println(author);
	}

}
