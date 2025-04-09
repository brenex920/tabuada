package br.dev.breno.tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMutiplicado;
	private JLabel labelMinimoMutiplicador;
	private JLabel labelMaximoMutiplicador;
	private JTextField pexMutiplicador;
	private JTextField texMinimoMutiplicador;
	private JTextField texMaximoMutiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void calcularTabuada() {
		
		
	}
	
	private void limparTabuada() {
		
	}
	
	public void criarTelaTabuada() {
		
		JFrame tela = new JFrame();
		tela.setTitle("tabuada magica");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		

		
		//vamos criar os componentes da tela
		labelMutiplicado = new JLabel();
		labelMutiplicado.setText("Mutiplicandor: ");
		labelMutiplicado.setBounds(20, 50, 150, 30);
		
		
		labelMinimoMutiplicador = new JLabel();
		labelMinimoMutiplicador.setText("Min. multiplicador: ");
		labelMinimoMutiplicador.setBounds(20, 80, 150, 30);
		
		
		
		labelMaximoMutiplicador = new JLabel();
		labelMaximoMutiplicador.setText("Max. multiplicador: ");
		labelMaximoMutiplicador.setBounds(20, 140, 150, 30);
		
		
		pexMutiplicador = new JTextField();
		pexMutiplicador.setBounds(300, 20, 50, 40);
		
		texMinimoMutiplicador = new JTextField();
		texMinimoMutiplicador.setBounds(300, 80, 50, 40);
		
		texMaximoMutiplicador = new JTextField();
		texMaximoMutiplicador.setBounds(300, 140, 50, 40);
		
		
		
		//Obtemos o painel de conteudo e adicionamos o labelMutiplicando nesse painel
				tela.getContentPane().add(labelMutiplicado);
				tela.getContentPane().add(labelMinimoMutiplicador);
				tela.getContentPane().add(labelMaximoMutiplicador);
				tela.getContentPane().add(pexMutiplicador);
				tela.getContentPane().add(texMinimoMutiplicador);
				tela.getContentPane().add(texMaximoMutiplicador);
		//essa linha deve ser a  utima linha desse metodo
		tela.setVisible(true);
		
		
		
	}
	
}
