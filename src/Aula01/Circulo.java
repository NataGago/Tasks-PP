package Aula01;	

public class Circulo extends Figura{
	private double raio;
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(getRaio(), getRaio());
	}
}
