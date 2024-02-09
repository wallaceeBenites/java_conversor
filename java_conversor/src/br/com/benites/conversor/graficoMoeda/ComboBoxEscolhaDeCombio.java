package br.com.benites.conversor.graficoMoeda;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.benites.conversor.calculo.CalculoDinheiro;

public class ComboBoxEscolhaDeCombio extends JFrame {
	
	/**
	 * o eclipse me obrigou a colocar um serial 
	 */
	private static final long serialVersionUID = 1L; 
	private JComboBox<String> comboBox;
	private JButton buttonOk;
	private JButton buttonCancelar;
	private String opcaoSelecionada;
	private JLabel mensagemDoPanel;

	public ComboBoxEscolhaDeCombio(double valorDouble) {
		
		
		
		mensagemDoPanel = new JLabel("Escolha a moeda para a qual você deseja girar seu dinheiro");
		
		String[] opcoes = { 
					"De Reais a Dólares",
					"De Reais a Euros",
					"De Reais a Libras",
					"De Reais a Yenes",
					"De Reais a Won Coreano",
					"De Dólares a Reais",
					"De Euros a Reais",
					"De Libras a Reais",
					"De Yenes a Reais",
					"De Won Coreano a Reais",
				};
		comboBox = new JComboBox<String>(opcoes);
		comboBox.setPreferredSize(new Dimension(300, comboBox.getPreferredSize().height));
		
		buttonOk = new JButton("OK");
		buttonOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				opcaoSelecionada = (String) comboBox.getSelectedItem(); 
				 dispose();
				 new CalculoDinheiro(valorDouble, opcaoSelecionada);

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
