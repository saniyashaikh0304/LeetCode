class Solution {
    public String largestOddNumber(String num) {
        String output = "";
		int startValue = 0, endValue = 0;
		for (int i = num.length() - 1; i >= 0; i--) {
			String s = String.valueOf(num.charAt(i));
			int n = Integer.valueOf(s);
			if (!(n % 2 == 0)) {
				endValue = i + 1;
				break;
			}
		}
		output = num.substring(startValue, endValue);
		return output;
    }
}