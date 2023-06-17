package javaLearn.Seminar04;

import java.util.LinkedList;
import java.util.Deque;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("simplifyPath(\"/home/\") = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(\"/../\") = " + simplifyPath("/../"));
        System.out.println("simplifyPath(\"/home//foo/\") = " + simplifyPath("/home/d/../s"));
        System.out.println("simplifyPath(\"/home//foo/\") = " + simplifyPath("/home//foo/"));
    }

    /**
     * @apiNote Преобразование пути в файловой системе Unix в упрошенную
     * @param path абсолютный путь
     * @return канонический путь
     */
    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)) {
                deq.add(s);
            }
        }
        if (deq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()) {
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }
}
