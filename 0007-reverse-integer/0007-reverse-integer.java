class Solution {
    public int reverse(int x) {
        int output = 0;
		String rem = "";
		String str = String.valueOf(x);
		if (str.startsWith("-")) {
			rem = "-";
			str = str.replace("-", "");
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			rem = rem + c;
		}
		try {
			output = Integer.valueOf(rem);			
			return output;
		} catch (NumberFormatException e) {
			return 0;
		}
    }
}