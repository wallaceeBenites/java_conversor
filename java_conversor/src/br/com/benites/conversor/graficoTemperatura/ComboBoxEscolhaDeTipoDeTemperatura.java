package br.com.benites.conversor.graficoTemperatura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.benites.conversor.calculo.CalculoTemperatura;


public class ComboBoxEscolhaDeTipoDeTemperatura extends JFrame {
	
	
	/**
	 * o eclipse me obrigou a colocar um serial 
	 */
	private static final long serialVersionUID = 2L; 
	private JComboBox<String> comboBox;
	private JButton buttonOk;
	private JButton buttonCancelar;
	private String opcaoSelecionada;
	private JLabel mensagemDoPanel;

	public ComboBoxEscolhaDeTipoDeTemperatura(double valorDouble) {
		
		mensagemDoPanel = new JLabel("Escolha a Temperatura para a qual você deseja converter");
		
		String[] opcoes = { "Celsius (C) para Kelvin (K)",
							"Celsius (C) para Fahrenheit (F)",
							"Kelvin (K) para Celsius (C)",
							"Fahrenheit (F) para Celsius (C)"
							};
		comboBox = new JComboBox<String>(opcoes);
		
		buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				opcaoSelecionada = (String) comboBox.getSelectedItem(); 
				 dispose();
				 new CalculoTemperatura(valorDouble, opcaoSelecionada);

			}
		});
		
		buttonCancelar  = new JButton("Cancelar"); 
		buttonCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}
		});
		
		
		
		JPanel panel = new JPanel();
		panel.add(mensagemDoPanel);
		panel.add(comboBox);
		panel.add(buttonOk);
		panel.add(buttonCancelar);
	

		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setTitle("Conversor");
	        setSize(360, 150);
	        setLocationRelativeTo(null); 
	        setContentPane(panel); 
	        setVisible(true);

	}

}
