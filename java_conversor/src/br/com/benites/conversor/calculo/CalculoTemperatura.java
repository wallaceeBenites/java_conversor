package br.com.benites.conversor.calculo;

import javax.swing.JOptionPane;

import br.com.benites.conversor.graficoMoeda.ComboBoxEscolhaDeConversor;

public class CalculoTemperatura {
	
	public CalculoTemperatura(Double valorDaTemperatura, String nomeTemperatura) {
		
		if(nomeTemperatura == "Celsius (C) para Kelvin (K)") {
			
			Double resultadoDaConversao = valorDaTemperatura+273.15;
			
			JOptionPane.showMessageDialog(null, valorDaTemperatura+"°C em Kelvin (K) é igual a "+resultadoDaConversao+" K");
			
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
			
			
		}else if(nomeTemperatura == "Celsius (C) para Fahrenheit (F)") {
			
			Double resultadoDaConversao = (valorDaTemperatura * 1.8) + 32;
			
			JOptionPane.showMessageDialog(null, valorDaTemperatura+"°C em Fahrenheit (F) é igual a "+resultadoDaConversao+"°F");
			
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeTemperatura == "Kelvin (K) para Celsius (C)") {
			
			Double resultadoDaConversao = valorDaTemperatura - 273.15;
			String valorFormatado = String.format("%.2f", resultadoDaConversao);
			
			JOptionPane.showMessageDialog(null, valorDaTemperatura+" K em Celsius (C) é igual a "+valorFormatado+"°C");
			
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else if(nomeTemperatura == "Fahrenheit (F) para Celsius (C)") {
			
			Double resultadoDaConversao = (valorDaTemperatura - 32) * 5/9;
			String valorFormatado = String.format("%.2f", resultadoDaConversao);
			
			JOptionPane.showMessageDialog(null, valorDaTemperatura+"°F em Celsius (C) é igual a "+valorFormatado+"°C");
			
			int respostaDeContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");			
			if(respostaDeContinuar == 0) {
				new ComboBoxEscolhaDeConversor();
			}else {
				JOptionPane.showMessageDialog(null,"Programa finalizado");
				System. exit(0);
			}	
			
		}else {
			
		}
		
		
	}

}
