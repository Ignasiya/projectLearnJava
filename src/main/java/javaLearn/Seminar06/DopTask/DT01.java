package javaLearn.Seminar06.DopTask;

public class DT01 {
    public static String zad4(String a, String b) {
        if (a.length() < b.length()) {
            return zad4(b, a);
        }
        int carry = 0;
        int j = b.length() - 1;
        String ans = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carry++;
            }
            ans = carry % 2 + ans;
            j--;
            carry /= 2;
        }
        if (carry > 0) {
            ans = carry % 2 + ans;
        }
        return ans;
    }

}
