package pl.mk;

public class Solution {

    public int solution(String str) {

        int leftBrackets = 0;
        int newLeftBrackets = 0;
        int rightBrackets = 0;
        int length = str.length();
        int point = 0;

        for (int i = 0; i < length; i++) {

            switch (str.charAt(i)) {
                case '{':
                    leftBrackets++;
                    break;
                case '}':
                    rightBrackets++;
                    break;
            }
        }

        if (0 == rightBrackets) {
        } else if (0 == leftBrackets) {
            point = length;
        } else {
            for (int i = 0; i < length; i++) {
                if ('}' == str.charAt(i)) {
                    rightBrackets--;
                    if (newLeftBrackets == rightBrackets) {
                        point = i + 1;
                        break;
                    }
                } else if ('{' == str.charAt(i)) {
                    newLeftBrackets++;
                    if (newLeftBrackets == rightBrackets) {
                        point = i + 1;
                        break;
                    }
                }

            }
        }
        return point;
    }
}
