package Aula01;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return getBase() * getAltura();
	}
}
