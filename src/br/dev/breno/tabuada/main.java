package br.dev.breno.tabuada;

import model.tabuada;

public class main {

	public static void main(String[] args) {
		{
			tabuada t1 = new tabuada();
			t1.setMutiplicando(8);
			t1.setMinimoMultiplicador(4);
			t1.setMaximoMutiplicador(6);
			t1.mostrarTabuada();
			
			tabuada t2 = new tabuada();
			t2.setMutiplicando(40);
			t2.setMinimoMultiplicador(20);
			t2.setMaximoMutiplicador(30);
			
		}
	}
}