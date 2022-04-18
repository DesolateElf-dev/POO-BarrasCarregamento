package controller;

import javax.swing.JButton;
import javax.swing.JProgressBar;

public class ThreadBanner extends Thread {
	private JProgressBar progressBar;
	private JProgressBar progressBar2;
	private JButton btnIniciar;
	
	public ThreadBanner(JProgressBar progressBar, JProgressBar progressBar2, JButton btnIniciar) {
		this.progressBar = progressBar;
		this.progressBar2 = progressBar2;
		this.btnIniciar = btnIniciar;
	}
	
	private void geraBanner() {
		
		btnIniciar.setEnabled(false);
		Thread tBarra = new ThreadProgressBar(progressBar);
		Thread tBarra2 = new ThreadProgressBar(progressBar2);
		tBarra.start();
		tBarra2.start();
		
		btnIniciar.setEnabled(true);
	}
	
	@Override
	public void run() {
		geraBanner();
	}
}