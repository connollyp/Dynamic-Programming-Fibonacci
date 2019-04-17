package algreview;

public class DynamicFibonacci {

	/**
	 * 
	 * @param n
	 *            the number who's Fibonacci number is being sought
	 * @param A
	 *            an array containing previous Fibonacci numbers
	 * @return The Fibonacci number of n
	 */
	public static int Fibonacci(int n, int[] A) {
		// Sets 0's Fibonacci number to 0
		A[0] = 0;
		// Set's 1's Fibonacci number to 1
		A[1] = 1;
		// Checks to see if n's Fibonacci number could potentially be undefined
		if (n > 1) {
			// Checks to see if n-1 is defined
			if (A[n - 1] != 0) {
				// Sets N's Fibonacci number
				A[n] = A[n - 1] + A[n - 2];
				// Returns n's Fibonacci number
				return A[n];
			} else {
				// Recursively calls the function to find previous Fibonacci numbers
				A[n] = Fibonacci(n - 1, A) + Fibonacci(n - 2, A);
				return A[n];
			}
		}
		return A[n];
	}

	public static void main(String[] args) {
		int[] A = new int[11];

		for (int i = 0; i < A.length; i++) {
			A[i] = 0;
		}

		System.out.println(Fibonacci(10, A));

	}

}
