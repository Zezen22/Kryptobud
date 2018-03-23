package kryptobud;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Validator v= new Validator();
		Object[] options = { "New cyclist", "new customer", "se jobblista" };
		JOptionPane frame = new JOptionPane("Cryptobud");

		while(true){
			
			int n = JOptionPane.showOptionDialog(frame, "Vad vill du?", "CRYPTOBUD", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (n) {
			case 0: {
				new Thread(new Cyclist(v)).start();
				break;
			}
			case 1: {
				new Thread(new Customer(v)).start();
				break;
			}
			case 2: {
				break;
			}
			}
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
