class SBI implements Bank {
	@Override
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	@Override
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Main {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
