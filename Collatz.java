// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]);
		String mode = (args[1]);
		int k = seed;

		if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		
		if (mode.equals("v")) {

			int i = 1;

			while (i <= k) {
				int steps = i;
				System.out.println(i);
				
				while (i != 1) {
				
					if (i % 2 == 0) {
						i = i / 2;

					} else {
							i = (i*3) + 1;						}

					System.out.println(" "+i);
					steps++;
				}
				System.out.println(i+" "+seed);
				i++;
				System.out.println(" ("+steps+") ");
			}	
			
			System.out.println("Every one of the first " + k + " hailstone sequences reached 1.");
		}
	}
}

