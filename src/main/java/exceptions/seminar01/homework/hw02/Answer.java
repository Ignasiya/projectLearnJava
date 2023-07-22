package exceptions.seminar01.homework.hw02;

class Answer {
    public int[] subArrays(int[] a, int[] b){
        int[] c = {0};
        if (a.length != b.length) return c;
        c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}
