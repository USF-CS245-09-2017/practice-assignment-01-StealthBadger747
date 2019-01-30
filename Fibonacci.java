public class Fibonacci {
	public Fibonacci() {

	}

	private int iterative(int n) {
		// Check if non zero or lower
		if(n <= 1) {
			return n;
		}
		// Set base values for iteration
		int cur = 1;
		int prev = 1;
		
		for(int i=2; i<n; i++) {
			int temp = cur;
			cur += prev;
			prev = temp;
		}
		return cur;
	}

	private int recursive(int n) {
		// Check for base case
		if(n <= 1) return n;
		// Get to base case
		else return recursive(n-1) + recursive(n-2);
	}

	public int fibonacci (int n, String type) {
		int result = 69420;
		if(type.equals("iterative")) {
			result = iterative(n);
		}

		else if(type.equals("recursive")) {
			result = recursive(n);
		}

		return result;
	}
}