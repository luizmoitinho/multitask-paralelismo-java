package progressbar;

import java.awt.Color;

import javax.swing.JProgressBar;

public class ProgressDownload extends Thread {
	
	private JProgressBar progressBarDownload;
	private DinamicWords words;
	
	public ProgressDownload(DinamicWords words)
	{
		this.words = words;
		
		this.progressBarDownload = new JProgressBar();
		this.progressBarDownload.setBounds(35, 126, 370, 14);
		
		
	}
	
	public JProgressBar get() {
		return this.progressBarDownload;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		
		try {
			Thread.currentThread();
			this.words.start();
			for (int i = 0; i <= 100; i+=10 ) {
				this.progressBarDownload.setValue(i);
				Thread.sleep(2000);
			}
			this.progressBarDownload.setForeground(Color.GREEN);	
			this.words.suspend();
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}	
		
		Thread.currentThread().suspend();
		
	}

	

	
}
