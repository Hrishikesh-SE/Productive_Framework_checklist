class MultithreadingDemo1 implements Runnable {
	@Override
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

class RunnableMultithread {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingDemo1());
			object.start();
		}
	}
}
