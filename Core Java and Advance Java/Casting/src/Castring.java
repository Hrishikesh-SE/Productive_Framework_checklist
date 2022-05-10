public class Castring {
	public static void main(String[] args) {
		// Implicit casting
		System.out.println("Implicit casting");
		int a = 3;
		double b = a + 4.6;
		int c = a + 6;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		// Explicit casting
		System.out.println("Explicit casting");
		double x = 5.74;
		int y = (int) x + 7;
		String w = "4";
		int z = Integer.parseInt(w);
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	}
}
