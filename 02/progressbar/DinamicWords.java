package progressbar;

import javax.swing.JLabel;

public class DinamicWords extends Thread {
	
	private JLabel lblWords;
	
	public DinamicWords() {
		this.lblWords = new JLabel("");
		this.lblWords.setBounds(40, 91, 200, 15);
	}
	
	public JLabel get() {
		return this.lblWords;
	}
	
	public void run() {
		try {
			for(;;) {
				this.lblWords.setText("Aguarde alguns intantes.");
				Thread.currentThread();
				Thread.sleep(1500);
				this.lblWords.setText("Estamos preparando tudo!");
				Thread.currentThread();
				Thread.sleep(1500);
				this.lblWords.setText("Download ...");
			}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}

	}
	
	
	
}
