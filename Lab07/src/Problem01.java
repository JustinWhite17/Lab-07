
public class Problem01 {

	public static long getSumOfPrimes(int n) {
	    if (n < 2) {
	        return 0;
	    }
	    boolean[] isComposite = new boolean[n + 1];
	    long sum = 0;
	    for (int i = 2; i <= n; i++) {
	        if (!isComposite[i]) {
	            sum += i;
	            for (int j = i * i; j <= n; j += i) {
	                isComposite[j] = true;
	            }
	        }
	    }
	    return sum;
}


public static void main(String[] args) {
    int n1 = 10; // sum of all prime numbers between 1 and the int
    int n2 = 50;
    int n3 = 100;
    int n4 = 1000; 
    
    long sum1 = getSumOfPrimes(n1);
    long sum2 = getSumOfPrimes(n2);
    long sum3 = getSumOfPrimes(n3);
    long sum4 = getSumOfPrimes(n4);
    
    System.out.println("sum1 = " + sum1); // prints the sum of all the primes of 10 = 17
    System.out.println("sum2 = " + sum2); // prints the sum of all the primes of 100 = 328
    System.out.println("sum3 = " + sum3); // prints the sum of all the primes of 100 = 1060
    System.out.println("sum4 = " + sum4); // prints the sum of all the primes of a 1000 = 76127
	}
}

// Time complexity O(n log log n) 
// Space complexity is O(n) uses boolean array of n+1