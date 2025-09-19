import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        String sum = "";
		for (int i : digits) {
			String value = String.valueOf(i);
			sum += value;
		}
		
		BigInteger num = new BigInteger(sum);
	    num = num.add(BigInteger.ONE);
	    String result = num.toString();
		int length = result.length();
		int[] output = new int[length];

		for (int i = 0; i < result.length(); i++) {
			char a = result.charAt(i);
			int n = Integer.parseInt(String.valueOf(a));
			output[i] = n;
		}

		return output;
    }
}