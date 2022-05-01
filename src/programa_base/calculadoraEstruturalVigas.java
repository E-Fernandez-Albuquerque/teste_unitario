package programa_base;

public class calculadoraEstruturalVigas {
	
	
	public static double sigmacd(double fck) {
		return 0.85 * fck / 1.4;
	}
	
	public static double mi(double mk, double sigmacd, int b, int d) {
		double mi = 1.4 * mk / (sigmacd * b * Math.pow(d,2));
		if (mi > 0.30) {
			return 1.4 * mk / (sigmacd * b * Math.pow(d,2));
		} else {
			return 0;
		}
		
	}
	
	public static double omega(double mi) {
		if (mi > 0.30) {
			return 1 - (Math.sqrt(1 - 2*mi));
		} else {
			return 0;
		}
	}
	
	public static double ks(double sigmacd, double fyd, int b, int d) {
		return (sigmacd/fyd) * b * d;
	}
	
	public static double as(double omega, double ks) {
		return omega * ks;
	}
}
