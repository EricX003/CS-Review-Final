public class Problem {

	public static void main(String[] args) {
		// testCow();
		// testHerdSort();
		// testHerdSearch();
	}

	private static Herd getData() {

		Cow[] cows = { new Cow("Alice"), new Cow("Bob"), new Cow("Cathy"), new Cow("Derrick"), new Cow("Eric"),
				new Cow("Frederick"), new Cow("Garett") };

		cows[0].eatGrass(2);
		cows[1].eatGrass(1);
		cows[2].eatGrass(0);
		cows[3].eatGrass(4);
		cows[4].eatGrass(3);
		cows[5].eatGrass(10);
		cows[6].eatGrass(3);

		Herd herd = new Herd(cows);

		return herd;

	}

	public static void testHerdSort() {

		Herd herd = getData();
		herd.sortHerd();

		Cow[] cows = herd.getCows();

		for (int i = 0; i < cows.length - 1; i++) {
			if (cows[i].compareTo(cows[i + 1]) == 1) {
				System.out.println("Failed");
				return;
			}
		}

		System.out.println("Passed");

	}

	public static void testHerdSearch() {

		Herd herd = getData();
		herd.sortHerd();

		if (!herd.getNameWithBales(10).equals("Frederick")) {
			System.out.println("Failed");
			return;
		}
		if (!herd.getNameWithBales(0).equals("Cathy")) {
			System.out.println("Failed");
			return;
		}
		if (!herd.getNameWithBales(2).equals("Alice")) {
			System.out.println("Failed");
			return;
		}

		System.out.println("Passed!");

	}

	public static void testCow() {

		Cow A = new Cow("Alice");
		if (!A.getName().equals("Alice")) {
			System.out.println("Name is returned incorrectly");
			return;
		}
		if (Cow.getPopulation() != 1) {
			System.out.println("Population is incorrect");
			return;
		}
		A.eatGrass(5);
		if (A.getGrass() != 5) {
			System.out.println("Did not consume bales correctly");
			return;
		}

		Cow B = new Cow("Bob");
		if (Cow.getPopulation() != 2) {
			System.out.println("Population is incorrect");
			return;
		}
		System.out.println("Passed!");

	}
}

class Herd {
	// Attributes go here

	// Make a herd matching the given Cow array
	public Herd(Cow[] herd) {
		// your code starts here
		;
		// your code ends here
	}

	// Return the Cow array modelling the population
	public Cow[] getCows() {
		// your code starts here
		return null;
		// your code ends here
	}

	// Sort the herd in ascending order, in terms of number of bales eaten
	public void sortHerd() {
		// your code starts here
		return;
		// your code ends here
	}

	// Return the name of the cow with bales number of bales eaten
	// Return "None" if no such cow exists
	public String getNameWithBales(int bales) {
		// your code starts here
		return null;
		// your code ends here
	}

}

class Cow {
	// Attributes go here

	public Cow(String name) {
		// your code starts here
		;
		// your code ends here
	}

	// Consumes bales number of grass
	public void eatGrass(int bales) {
		// your code starts here
		return;
		// your code ends here
	}

	public int getGrass() {
		// your code starts here
		return null;
		// your code ends here
	}

	public static int getPopulation() {
		// your code starts here
		return null;
		// your code ends here
	}

	public String getName() {
		// your code starts here
		return null;
		// your code ends here
	}

	// Do not modify this!
	public int compareTo(Cow other) {
		if (other.getGrass() < this.grass) {
			return 1;
		} else if (other.getGrass() > this.grass) {
			return -1;
		}
		return 0;
	}

}
