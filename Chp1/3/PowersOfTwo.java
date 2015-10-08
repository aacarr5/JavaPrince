public class PowersOfTwo {
	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);

		for (int i = 0; i < count ; i = i + 1) {
			// System.out.print(i + ": ");
			double value = (Math.pow(2,i));
			System.out.printf("2 ^ " + i + " = ");
			System.out.printf("%.0f",value);
			System.out.println("");
		}
	}
}