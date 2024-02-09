package br.com.benites.conversor.graficoMoeda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.benites.conversor.graficoTemperatura.CaixaDeDialogoParaIncerirTemperatura;

public class ComboBoxEscolhaDeConversor extends JFrame {
	
	/**
	 * o eclipse me obrigou a colocar um serial 
	 */
	private static final long serialVersionUID = 1L; 
	private JComboBox<String> comboBox;
	private JButton buttonOk;
	private JButton buttonCancelar;
	private String opcaoSelecionada;
	private JLabel mensagemDoPanel;

	public ComboBoxEscolhaDeConversor() {
		
		mensagemDoPanel = new JLabel("Escolha uma opção");
		
		String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura"};
		comboBox = new JComboBox<String>(opcoes);
		
		buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				opcaoSelecionada = (String) comboBox.getSelectedItem(); 
				
				if(opcaoSelecionada == "Conversor de Moeda"){
					dispose();
					
					  new CaixaDeDialogoParaIncerirValor();
				
					 
				}else if(opcaoSelecionada == "Conversor de Temperatura") {
					 System.out.println("Opção selecionada: " + opcaoSelecionada);
					 dispose();
					 new CaixaDeDialogoParaIncerirTemperatura(); 
					
					 
				}else {
					JOptionPane.showMessageDialog(null,"Programa finalizado");
					System. exit(0);
				}
				
           

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
	        setSize(250, 150);
	        setLocationRelativeTo(null); 
	        setContentPane(panel); 
	        setVisible(true);

	}

}
