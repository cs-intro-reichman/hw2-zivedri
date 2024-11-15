// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double pi = 1;
		double divisor = -3;
		while (n>1) {
			pi= pi + 1/divisor;
			divisor=divisor*-1;
			if (divisor<0)
				divisor-=2;
			else divisor+=2;
			n--;
		}
		System.out.println("pi, approximated:     "+pi*4);
		}
	}
