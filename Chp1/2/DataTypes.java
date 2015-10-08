public class DataTypes {
	public static void main(String[] args) {

		int N = Integer.parseInt(args[0]);
		double r = Math.sin(N);
		int n = (int)(r * N);
		System.out.println("YOur random integer is:" + n);
	}
}