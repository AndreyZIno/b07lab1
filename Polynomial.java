public class Polynomial {

	double[] coef;
	
	// No-argument constructor
	public Polynomial() {
		coef = new double[1];
		for (int i = 0; i < coef.length; i++) {
			coef[i] = 0.0;
		}
	}
	
	// Constructor with array of coefficients
	public Polynomial(double[] new_coef) {
		coef = new_coef;
	}
	
	public Polynomial add(Polynomial poly) {
		
		int maxLength = Math.max(coef.length, poly.coef.length);
		double[] resultCoefficients = new double[maxLength];
		
		for (int i = 0; i < coef.length; i++) {
			resultCoefficients[i] += coef[i];
		}
		
		for (int i = 0; i < poly.coef.length; i++) {
			resultCoefficients[i] += poly.coef[i];
		}
		
		return new Polynomial(resultCoefficients);
	}
	
	public double evaluate(double x) {
		double result = 0.0;
		
		for (int i = 0; i < coef.length; i++) {
			result += coef[i] * Math.pow(x, i);
		}
		
		return result;
	}
	
	public boolean hasRoot(double x) {
		return evaluate(x) == 0.0;
	}
	
}