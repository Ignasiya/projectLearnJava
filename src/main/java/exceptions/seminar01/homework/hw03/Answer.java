package exceptions.seminar01.homework.hw03;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        int[] c = {0};
        if (a.length != b.length) return c;
        c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) throw new RuntimeException("Делить на ноль НЕЛЬЗЯ!");
            c[i] = a[i] / b[i];
        }
        return c;
    }
}
