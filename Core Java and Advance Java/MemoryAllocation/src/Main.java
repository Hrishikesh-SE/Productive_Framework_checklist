public class Main {
	public static void main(String[] args) {
		var textBox1 = new TextBox();
		var textBox2 = textBox1;
		textBox2.setText("Hrishikesh Chavan");
		System.out.println(textBox1.text);
		textBox2.setInt(9);
		System.out.println(textBox1.a);
	}
}
