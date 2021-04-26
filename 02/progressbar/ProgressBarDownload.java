package progressbar;

import java.awt.Color;

import javax.swing.JProgressBar;

public class ProgressBarDownload extends Thread {
	
	private JProgressBar progressBarDownload;
	private Boolean isDownloaded;
	public ProgressBarDownload()
	{
		this.progressBarDownload = new JProgressBar();
		this.progressBarDownload.setBounds(35, 126, 370, 14);
		
		this.isDownloaded = false;
	}
	
	public JProgressBar get() {
		return this.progressBarDownload;
	}

	@SuppressWarnings("deprecation")
	public void run() {
		
		try {
			Thread.currentThread();
			for (int i = 0; i <= 100; i+=10 ) {
				this.progressBarDownload.setValue(i);
				
				Thread.sleep(2000);
			}
			this.progressBarDownload.setForeground(Color.GREEN);
			this.isDownloaded = true;
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}	
	}
	
	public Boolean isDownloaded() {
		return this.isDownloaded ;
	}
	
}
