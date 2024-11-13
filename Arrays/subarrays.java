package Arrays;

public class subarrays {
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

	        int n = arr.length;
	        int count = 0;
	        int max = 0;
	        int si = 0;
	        int ei = 0;

	        for (int i = 0; i < n; i++) {
	            if (isPrime(arr[i])) {
	                count++;
	            } else {
	                if (count > max) {
	                    max = count;
	                    si = i - count;
	                    ei = i - 1;
	                }
	                count = 0;
	            }
	        }

	        // Check for the last subarray
	        if (count > max) {
	            max = count;
	            si = n - count;
	            ei = n - 1;
	        }

	        System.out.println("Longest subarray of prime numbers:");
	        for (int i = si; i <= ei; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	}


