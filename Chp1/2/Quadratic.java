public class Quadratic {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double x_1 = ((b * -1) + Math.sqrt((Math.pow(b,2)) - 4 * a * c)) * (1 / (2 * a));
		double x_2 = ((b * -1) - Math.sqrt((Math.pow(b,2)) - 4 * a * c)) * (1 / (2 * a));

		// double x_1 = ((b * -1) + Math.sqrt(Math.pow(b,2) - (4 * a * c))) * (1 / (2 * a));
		// double x_2 = ((b * -1) + Math.sqrt(Math.pow(b,2) - (4 * a * c))) * (1 / (2 * a));

		System.out.println("The first possible number is: " + x_1);
		System.out.println("The second possible solution is: " + x_2);
	}
}