package kryptobud;

import java.util.ArrayList;

public abstract class User {

	protected int privateKey,publicKey;
	private final Validator validator;
	
	protected String telefon;
	protected String message;
	protected ArrayList<Job> activeJobs= new ArrayList<Job>();
	protected ArrayList<Job> finishedJobs= new ArrayList<Job>();

	
	public User(Validator v) {
		validator=v;
		privateKey=generatePrivateKey();
		publicKey=generatepublicKey();		
	}
	private int generatepublicKey() {
		// TODO Auto-generated method stub
		return (int)(Math.random() * 1000);
	}
	private int generatePrivateKey() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String sendMessage() {		
		return validator.comunicate(message);
	}
	
	
}
