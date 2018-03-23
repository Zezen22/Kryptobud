package kryptobud;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cyclist extends User implements Runnable {
	private Job lastJob; // the last Job we saw from the central joblist

	ArrayList<Job> potencialJobs = new ArrayList<Job>();
	ArrayList<Job> interestingJobs = new ArrayList<Job>();

	public Cyclist(Validator v) {
		super(v);
	}

	public void askForNewJobs(Job lastJob) {
		String result = sendMessage();
	}

	public void chooseInterestingJobs() {

	}

	public void askForJob(Job interestingJob) {
		String result = sendMessage();
	}

	public void checkStatus(Job job) {
		String result = sendMessage();
	}

	public void pickUpp(Job job) {
		String result = sendMessage();
	}

	public void delivery(Job job) {
		String result = sendMessage();
	}

	public void setETA() {
		String result = sendMessage();
	}

	public void ringCustomer(Job job) {

	}

	Object[] options = { "leta efter nya jobb", "rapportera activitet", "kontakta kunden" };
	private JOptionPane frame = new JOptionPane("Cryptobud");

	@Override
	public void run() {

		while (true) {

			String address = JOptionPane
					.showInputDialog("Var ska du göra?" + publicKey + " 1:leta jobb  2:jobba  3:kontakta kund");
			// int n = JOptionPane.showOptionDialog(frame, "Vad ska jag göra?", "Cyclist",
			// JOptionPane.YES_NO_OPTION,
			// JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (address) {
			case "1": {
				System.out.println("jag letar " + publicKey);
				break;
			}
			case "2": {
				System.out.println("nu jobbar jag");
				break;
			}
			case "3": {
				System.out.println("pling pling");
				break;
			}
			default: {
				try {
					Thread.sleep(13000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				}
			}
			}
		}
	}

}
