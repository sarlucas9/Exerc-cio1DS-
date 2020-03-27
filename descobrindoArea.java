package exercicio1;

import exercicio1.CalculoQuadradro;

public class descobrindoArea {

	public static void main(String[] args) {
		
		//crio o objeto quadrado1
		CalculoQuadradro quadrado1 = new CalculoQuadradro();
			
		//dou valor ao atributo base 
			quadrado1.base=10;
			
			//dou valor ao atributo altura
		quadrado1.altura=5;
		
		//estou printando na tela a base e a altura
		System.out.println(quadrado1.base);
		System.out.println(quadrado1.altura);
		
		System.out.println(quadrado1.calcularArea());
		
	}

}
