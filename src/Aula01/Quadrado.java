package Aula01;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}

	@Override
	public double calculaDiagonal() {
		// TODO Auto-generated method stub
		return getAltura() * Math.sqrt(2);
	}

}
