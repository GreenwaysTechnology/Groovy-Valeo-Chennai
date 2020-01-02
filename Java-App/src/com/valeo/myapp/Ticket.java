package com.valeo.myapp;

public class Ticket {
   int ticketId =1;
   String desc ="Jira Not working";
   String summary ="Jira not working due to heavy load";
   String status ="Open";
   
   //Add biz method to change 
   public void updateStatus(String newStatus) {
	   status = newStatus;
   }
   public void updateTicketId(int newId) {
	   ticketId=newId;
   }
   public void updateDesc(String newDesc) {
	   desc = newDesc;
   }
   public void updateSummary(String newSummary) {
	   summary = newSummary;
   }
}
