package kryptobud;

import java.util.Date;

public class Job {
	
	int jobId;
	private String pickUpAdress, DeliveryAdress;
	private Date pickSoonest, pickLatest, deliverSoonest, deliverLatest;
	int weight, lenght, deepth, high, maxPrice;
	private Boolean cyklable, document, verySmall, fragil, urgent, 
	confidencial, signature, multipleStops, returnToSender, multipleDeliveries;
	private Payment payment;
	private String otherInfo;
	private Customer customer;
	private Cyclist cyclist,mostInterested;
	private JobStatus status;
	
	public String toString() {
		return "massor med grejer som inte är implementerade"; // hur kan det bli kompakt?
	}

	public JobStatus getStatus() {
		return status;
	}

	public int getJobId() {
		return jobId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Cyclist getCyclist() {
		return cyclist;
	}

	public static Job getJob(String result) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
