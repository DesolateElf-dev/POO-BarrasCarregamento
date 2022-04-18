package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import controller.ProgressBarController;


public class Tela extends JFrame {
		
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	* Create the frame.
	*/
	
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 35, 188, 42);
		contentPane.add(progressBar);
		
		final JProgressBar progressBar2 = new JProgressBar();
		progressBar2.setBounds(10, 132, 188, 42);
		contentPane.add(progressBar2);
		
		JButton btnIniciar = new JButton("In\u00EDcio");
		btnIniciar.setBounds(10, 228, 89, 23);
		contentPane.add(btnIniciar);
		
		ProgressBarController pbController = new ProgressBarController(progressBar, progressBar2, btnIniciar);
		
		btnIniciar.addActionListener(pbController);
	}
}