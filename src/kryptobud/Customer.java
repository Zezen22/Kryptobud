package kryptobud;


import javax.xml.ws.handler.MessageContext;

public class Customer extends User implements Runnable{
	
	
	
	public Customer(Validator v) {
		super(v);
	}
	
	public void createJob() {
		Job newJob = new Job();
		String jobMessage = newJob.toString();
		message = "NEW_ORDER" + jobMessage;
		String result = sendMessage();
		if(result.startsWith("OK")) activeJobs.add(Job.getJob(result));
		else //try again
			;
	}
	public void checkStatus(Job job) {
		
		message="CHECK_STATUS"+job.getJobId();
		String result= sendMessage();
		switch (job.getStatus()) {
		case CREATED:{
			
			break;
		}
			
			

		default:
			break;
		}
		// statusa zein den arabera lista bat , bestea edo biak ikutu
	}
	public void ringCyclist(Job job) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}		
}
