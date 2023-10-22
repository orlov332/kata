package leetcode.ArrayAndString.ReverseWordsIII;

class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();

        int i = 0;
        int wordStart = 0;
        while (i < str.length) {
            if (str[i] == ' ') {
                reverse(str, wordStart, i - 1);
                wordStart = i + 1;
            }
            i++;
        }
        reverse(str, wordStart, i - 1);

        return new String(str);
    }

    private void reverse(char[] str, int wordStart, int wordEnd) {
        while (wordStart < wordEnd) {
            char temp = str[wordStart];
            str[wordStart] = str[wordEnd];
            str[wordEnd] = temp;
            wordStart++;
            wordEnd--;
        }
    }
}
