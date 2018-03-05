package Aula01;
import java.util.ArrayList;
public class Geometria {
	public static void main (String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(2.00));
		figuras.add(new Triangulo(2.00, 3.00));
		figuras.add(new Losango(2.00, 6.00));	
		figuras.add(new Retangulo(2.00, 6.00));
		figuras.add(new Quadrado(2.00, 5.00));
		
		for(Figura fig:figuras) {
			System.out.println(fig.area());
			if(fig instanceof Diagonal) {
				System.out.println(((Quadrado)fig).calculaDiagonal());
				System.out.println(((Retangulo)fig).calculaDiagonal());
			}
		}
	}
}
