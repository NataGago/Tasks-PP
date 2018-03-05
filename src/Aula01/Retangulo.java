package Aula01;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
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
		return Math.sqrt((Math.pow(getAltura(), getAltura()) + Math.pow(getBase(), getBase())));
	}

}
