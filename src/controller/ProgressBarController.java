package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class ProgressBarController implements ActionListener{
	
	private JProgressBar progressBar;
	private JProgressBar progressBar2;
	private JButton btnIniciar;
	
	public ProgressBarController(JProgressBar progressBar, JProgressBar progressBar2, JButton btnIniciar){
		this.progressBar = progressBar;
		this.progressBar2 = progressBar2;
		this.btnIniciar = btnIniciar;
	}
	
	private void acaoBarra(){
		btnIniciar.setEnabled(false);
		Thread tBanner = new ThreadBanner(progressBar, progressBar2, btnIniciar);
		tBanner.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		acaoBarra();
	}
}