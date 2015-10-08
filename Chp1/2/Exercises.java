public class Exercises {
	public static void main(String[] args) {
		int theta = Integer.parseInt(args[0]);
		double a = Math.pow(Math.sin(theta),2) + Math.pow(Math.cos(theta),2);
		System.out.println(a);
	}
}