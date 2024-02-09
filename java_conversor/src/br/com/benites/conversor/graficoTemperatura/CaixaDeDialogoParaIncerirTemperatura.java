package br.com.benites.conversor.graficoTemperatura;

import javax.swing.JOptionPane;

import br.com.benites.conversor.graficoMoeda.ComboBoxEscolhaDeConversor;



public class CaixaDeDialogoParaIncerirTemperatura {
	
	public CaixaDeDialogoParaIncerirTemperatura() {
	
	String RecebeTemperatura = JOptionPane.showInputDialog("Insira uma Temperatura:");
	
	try {
		if(RecebeTemperatura != null) {
			
			double valorDouble = Double.parseDouble(RecebeTemperatura);
	
	System.out.println("Teste :"+RecebeTemperatura);
	
	new ComboBoxEscolhaDeTipoDeTemperatura(valorDouble);
			
		}else {
			JOptionPane.showMessageDialog(null,"Programa finalizado");
			System. exit(0);
		}
		
		
	} catch (Exception e) {
		
		JOptionPane.showMessageDialog(null, "Valor invalido : "+RecebeTemperatura,"Error",JOptionPane.WARNING_MESSAGE);
		new ComboBoxEscolhaDeConversor();
		
	}
	
	
	
	}

}
