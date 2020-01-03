package calculator;

public class Calculator {

	 /**
	 * @author Shazaib
	 * @param num1 is the first integer
	 * @param num2 is the second integer
	 * @param num3 is the third integer
	 * @return the maximum of these three numbers
	 */
	
		public int findMax(int num1, int num2, int num3) {
			int[] arr = { num1, num2, num3 };
			int max = 0;
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] > max)
						max = arr[i];
		}
				return max;
		}
		
	 /**
     * @param num is the integer being checked for square
     * @return the maximum of these three numbers
     * @throws IllegalArgumentException when the num is less than 0 and greater than 10
	 */
		public int square(int num) throws IllegalArgumentException {
			int result = 0;
				if (num > 0 && num < 10) {
						result = num * num;
		} 
				else
					throw new IllegalArgumentException();
			return result;
		}
		
		/**
		 * 
		 * @param num is the integer being checked for cube
		 * @return result
		 */
		public int cube(int num)
		{
			int result = 0;
			result = num*num*num;
			return result;
		}
		}
