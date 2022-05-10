public class PrimitiveVsReference {
	int a;

	public static void main(String[] args) {
		// primitive
		int a = 25;
		double b = 2.5;
		System.out.println("Primitive variables");
		System.out.println("a = " + a + ", b = " + b);
		// reference
		System.out.println("Reference variables");
		String s1 = "Hrishikesh";
		String s2 = s1;
		System.out.println("s2 = " + s2 + ", Reference by s1.");
	}
}
