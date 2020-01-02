package com.valeo.myapp;

public class TicketManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		// Ticket inital values
		System.out.println("Ticket Id :  " + ticket.ticketId);
		System.out.println("Ticket Desc : " + ticket.desc);
		System.out.println("Ticket Summary : " + ticket.summary);
		System.out.println("Ticket Status :" + ticket.status);

		ticket.updateStatus("InProgress");

		System.out.println("After Update Status Ticket Details ");

		System.out.println("Ticket Id :  " + ticket.ticketId);
		System.out.println("Ticket Desc : " + ticket.desc);
		System.out.println("Ticket Summary : " + ticket.summary);
		System.out.println("Ticket Status :" + ticket.status);

		ticket.updateStatus("Closed");
		ticket.updateTicketId(2);
		ticket.updateDesc("Jira is working");
		ticket.updateSummary("Load Problem has been soloved by increasing Cluster");

		System.out.println("After Update Status Ticket Details ");

		System.out.println("Ticket Id :  " + ticket.ticketId);
		System.out.println("Ticket Desc : " + ticket.desc);
		System.out.println("Ticket Summary : " + ticket.summary);
		System.out.println("Ticket Status :" + ticket.status);

	}

}
