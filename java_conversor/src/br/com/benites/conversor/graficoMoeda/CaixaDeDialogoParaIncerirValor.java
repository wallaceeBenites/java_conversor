package br.com.benites.conversor.graficoMoeda;

import javax.swing.JOptionPane;

public class CaixaDeDialogoParaIncerirValor {
	
	public CaixaDeDialogoParaIncerirValor() {
		
		
		String RecebeValorDoDinheiro = JOptionPane.showInputDialog("Insira um valor:");
		
		try {
			if(RecebeValorDoDinheiro != null) {
				
				double valorDouble = Double.parseDouble(RecebeValorDoDinheiro);
		
		System.out.println("Teste :"+RecebeValorDoDinheiro);
		
		new ComboBoxEscolhaDeCombio(valorDouble);
				
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);;
			}
			
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Valor invalido : "+RecebeValorDoDinheiro,"Error",JOptionPane.WARNING_MESSAGE);
			new ComboBoxEscolhaDeConversor();
			
		}
		
		
		
	};

}
