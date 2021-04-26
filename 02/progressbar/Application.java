package progressbar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Application extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setBounds(100,100,450,350);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		getContentPane().setLayout(null);
		
		JLabel lblSimulaoDeDownload = new JLabel("Simulação de Download");
		lblSimulaoDeDownload.setFont(new Font("Ubuntu", Font.BOLD, 16));
		lblSimulaoDeDownload.setBounds(126, 12, 190, 32);
		getContentPane().add(lblSimulaoDeDownload);
		
		DinamicWords words = new DinamicWords();
		getContentPane().add(words.get());
		
		ProgressDownload progressDownload =  new ProgressDownload(words);
		getContentPane().add(progressDownload.get());
		
		
		
		
		JButton btnStart = new JButton("Iniciar");
		btnStart.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				progressDownload.start();
	
			}
		});
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnStart.setBounds(160, 162, 117, 25);
		getContentPane().add(btnStart);
		
		
	

	
	}

	
}
