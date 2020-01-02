
package com.valeo.ts.tickets;


public class Ticket {
	private int ticketId;
	private String status;
	private String priority;
	private String desc;
	private String summary;
	
	public Ticket() {
	}
	
	public Ticket(int ticketId, String status, String priority, String desc, String summary) {
		this.ticketId = ticketId;
		this.status = status;
		this.priority = priority;
		this.desc = desc;
		this.summary = summary;
	}


	
	public Ticket(int ticketId, String status) {
		this.ticketId = ticketId;
		this.status = status;
	}


	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", status=" + status + ", priority=" + priority + ", desc=" + desc
				+ ", summary=" + summary + "]";
	}
	

}
