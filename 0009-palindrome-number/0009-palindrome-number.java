class Solution {
    public boolean isPalindrome(int x) {
        boolean output = false;
		int num1 = x;
		int rev = 0;
		while (x > 0) {
			int temp = x % 10;
			rev = rev * 10 + temp;
			x /= 10;
		}
		if (num1 == rev) {
			return true;
		}
		return output;
    }
}