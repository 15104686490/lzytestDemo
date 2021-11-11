package leetcode;

public class offer3 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        /*if (s == null || s.length() == 0) return s;
        s = s.replaceAll(" ", "%");*/
        char[] resTemp = new char[s.length() * 3];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (tempChar == ' ') {
                resTemp[index++] = '%';
                resTemp[index++] = '2';
                resTemp[index++] = '0';
            } else {
                resTemp[index++] = tempChar;
            }
        }
        String result = new String(resTemp, 0, index);
        return result;
    }
}
