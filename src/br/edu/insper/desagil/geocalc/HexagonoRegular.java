package br.edu.insper.desagil.geocalc;
import br.edu.insper.desagil.geocalc.TrianguloEquilatero;
public class HexagonoRegular extends Poligono {
	private int lado;
	private double areatriangulo;
	public HexagonoRegular(int lado, double areatriangulo) {
		this.lado = lado;
		this.areatriangulo = TrianguloEquilatero area();
	}

	@Override
	public double perimetro() {
		return 6 * this.lado;
	}

	@Override
	public double area() {
		return 6 * areatriangulo;
	}
}
