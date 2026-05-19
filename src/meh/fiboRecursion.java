package meh;

public class fiboRecursion {
	
	// Global counter equivalent
	static int count = 2;
	
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		fibonacci(1, 0);
	}

	private static void fibonacci(int prev1, int prev2) {
		if (count <= 19) {
			int newFibo = prev1 + prev2;
			System.out.println(newFibo);
			
			prev2 = prev1;
			prev1 = newFibo;
			count++;
			
			fibonacci(prev1, prev2);
		} else {
			return;
		}
	}
}
