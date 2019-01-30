public class Factorial {

	public Factorial() {

	}

	private int isPrime(int p) {
		if (p < 2) {
			return false;
		}
		else {
			for(int i = 2; i < p; i++) {
				if(p%i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private int iterative(int n) {
		int i = 1;
		int temp = n;
		int result = 1;
		if(n == 1) {
			return 1;
		}
		do {
			result *= i;
			i++;
		} while(n+1 != i);

		return result;
	}

	private int recursive(int n) {
		if(n == 1) {
			return 1;
		}
		else {
			return recursive(n-1) * n;
		}
	}

	public int factorial(int n, String type) {
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