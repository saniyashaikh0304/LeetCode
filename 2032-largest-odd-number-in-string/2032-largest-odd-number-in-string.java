class Solution {
    public String largestOddNumber(String num) {
        String output = "";
		int startValue = 0, endValue = 0;
		for (int i = num.length() - 1; i >= 0; i--) {
			int n1 = Integer.valueOf(num.charAt(i));
			if (!(n1 % 2 == 0)) {
				endValue = i + 1;
				break;
			}
		}
		output = num.substring(startValue, endValue);
		return output;
    }
}