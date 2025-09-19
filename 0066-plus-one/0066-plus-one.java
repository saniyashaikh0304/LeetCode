import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}

		int[] output = new int[digits.length + 1];
		output[0] = 1;
		return output;

        // String sum = "";
		// for (int i : digits) {
		// 	String value = String.valueOf(i);
		// 	sum += value;
		// }
		
		// BigInteger num = new BigInteger(sum);
	    // num = num.add(BigInteger.ONE);
	    // String result = num.toString();
		// int length = result.length();
		// int[] output = new int[length];

		// for (int i = 0; i < result.length(); i++) {
		// 	char a = result.charAt(i);
		// 	int n = Integer.parseInt(String.valueOf(a));
		// 	output[i] = n;
		// }

		// return output;
    }
}