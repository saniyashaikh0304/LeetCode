class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;

		String[] words = s.trim().split("\\s+");
		length = words[words.length-1].length();

		return length;
    }
}