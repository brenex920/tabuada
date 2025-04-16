package br.dev.breno.tabuada.gui;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.tabuada;

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
		tela.setSize(270, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.setResizable(false);
		

		
		//vamos criar os componentes da tela
		labelMutiplicado = new JLabel();
		labelMutiplicado.setText("Mutiplicandor: ");
		labelMutiplicado.setBounds(20, 20, 150, 30);
		
		
		labelMinimoMutiplicador = new JLabel();
		labelMinimoMutiplicador.setText("Min. multiplicador: ");
		labelMinimoMutiplicador.setBounds(20, 65, 150, 30);
		
		
		
		labelMaximoMutiplicador = new JLabel();
		labelMaximoMutiplicador.setText("Max. multiplicador: ");
		labelMaximoMutiplicador.setBounds(20, 100, 150, 30);
		
		
		pexMutiplicador = new JTextField();
		pexMutiplicador.setBounds(180, 20, 50, 30);
		
		texMinimoMutiplicador = new JTextField();
		texMinimoMutiplicador.setBounds(180, 65, 50, 30);
		
		texMaximoMutiplicador = new JTextField();
		texMaximoMutiplicador.setBounds(180, 100, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("calcular");
		buttonCalcular.setBounds(20, 155, 95, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("limpar");
		buttonLimpar.setBounds(135, 155, 95, 30);
		
		//criar um objeto scroll
		listTabuada = new JList();
		
		
		
		
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 205, 210, 400);
		
		//Obtemos o painel de conteudo e adicionamos o labelMutiplicando nesse painel
				tela.getContentPane().add(labelMutiplicado);
				tela.getContentPane().add(labelMinimoMutiplicador);
				tela.getContentPane().add(labelMaximoMutiplicador);
				tela.getContentPane().add(pexMutiplicador);
				tela.getContentPane().add(texMinimoMutiplicador);
				tela.getContentPane().add(texMaximoMutiplicador);
				tela.getContentPane().add(buttonCalcular);
				tela.getContentPane().add(buttonLimpar);
				tela.getContentPane().add(scrollTabuada);
				
				//adicionar ouvintes de eventos aos botões
				
				buttonCalcular.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						tabuada tabuada = new tabuada();
						String multiplicando = pexMutiplicador.getText();
						double multiplicandoDouble = Double.valueOf(multiplicando);
						tabuada.setMutiplicando(multiplicandoDouble);
						
						String min = texMinimoMutiplicador.getText();
						double minDouble = Double.valueOf(min);
						tabuada.setMinimoMultiplicador(minDouble);
						
						String max =
						
						
						
						
						
						
						System.out.println(pexMutiplicador.getText() );
						System.out.println(texMinimoMutiplicador.getText() );
						System.out.println(texMaximoMutiplicador.getText() );
						
					}
				});
				
				
				//esse botao faz a açao de limpar 
				buttonLimpar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
						pexMutiplicador.setText(" ");
						texMinimoMutiplicador.setText(" ");
						texMaximoMutiplicador.setText(" ");
						
						pexMutiplicador.setFocusable(false);;
						
					}
				});
				
				
				
				
				
				
		//essa linha deve ser a  utima linha desse metodo
		tela.setVisible(true);
		
		
		
	}
	
}
