package br.com.benites.conversor.calculo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import br.com.benites.conversor.graficoMoeda.ComboBoxEscolhaDeConversor;

public class CalculoDinheiro {
	
	public CalculoDinheiro(Double valorDoDinheiro, String nomeCambio) {
		
		Double cotacaoDoDolar = 4.99;
		Double cotacaoDoEuro = 5.36;
		Double cotacaoDaLibras = 6.28;
		Double cotacaoDoYene = 0.033;
		Double cotacaoDoWon = 0.0037;
		
		if(nomeCambio == "De Reais a Dólares") {
			
			Double valorConvertido = valorDoDinheiro / cotacaoDoDolar;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			
			
			JOptionPane.showMessageDialog(null, "Você tem $"+valorFormatado+" Dolares");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Reais a Euros") {
			
			Double valorConvertido = valorDoDinheiro / cotacaoDoEuro;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem €"+valorFormatado+" Euros");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Reais a Libras") {
			
			Double valorConvertido = valorDoDinheiro / cotacaoDaLibras;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem £"+valorFormatado+" Libras");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Reais a Yenes") {
			
			Double valorConvertido = valorDoDinheiro / cotacaoDoYene;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem ¥"+valorFormatado+" Yenes");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Reais a Won Coreano") {
			
			Double valorConvertido = valorDoDinheiro / cotacaoDoWon;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem ₩"+valorFormatado+" Won");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Dólares a Reais") {
			
			Double valorConvertido = valorDoDinheiro * cotacaoDoDolar;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem R$"+valorFormatado+" Reais");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Euros a Reais") {
			
			Double valorConvertido = valorDoDinheiro * cotacaoDoEuro;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem R$"+valorFormatado+" Reais");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Libras a Reais") {
			
			Double valorConvertido = valorDoDinheiro * cotacaoDaLibras;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem R$"+valorFormatado+" Reais");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Yenes a Reais") {
			
			Double valorConvertido = valorDoDinheiro * cotacaoDoYene;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem R$"+valorFormatado+" Reais");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeCambio == "De Won Coreano a Reais") {
			
			Double valorConvertido = valorDoDinheiro * cotacaoDoWon;
			DecimalFormat formato = new DecimalFormat("#.##");
			String valorFormatado = formato.format(valorConvertido);
			JOptionPane.showMessageDialog(null, "Você tem R$"+valorFormatado+" Reais");
			System.out.println("Calculo feito :"+valorConvertido);
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else {
			JOptionPane.showMessageDialog(null,"Programa finalizado");
			System. exit(0);
		}
		
		
		
		
	}
}
