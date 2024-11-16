// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int steps = 0;
		if (mode.equals("v")) {
			for (int i = 1; i <= n; i++) {
				seed = i;
				steps = 1;
				if (seed == 1) {
					System.out.print(seed + " ");
					seed = seed * 3 + 1;
					steps++;
				}
				while (seed != 1) {
					System.out.print(seed + " ");
					if (seed % 2 == 0) {
						seed = seed / 2;
					} else {
						seed = seed * 3 + 1;
					}
					steps++;
				}
				System.out.println(seed + " (" + steps + ")");
			}
		}
		else {
			for (int i = 1; i <= n; i++) {
				seed = i;
				steps = 1;
				if (seed == 1) {
					seed = seed * 3 + 1;
					steps++;
				}
				while (seed != 1) {
					if (seed % 2 == 0) {
						seed = seed / 2;
					} else {
						seed = seed * 3 + 1;
					}
					steps++;
				}
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");

	}
}
