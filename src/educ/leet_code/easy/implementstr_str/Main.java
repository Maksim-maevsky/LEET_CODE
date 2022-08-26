package educ.leet_code.easy.implementstr_str;


public class Main {
    public static void main(String[] args) {

        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {

        if (needle.isEmpty()) return 0;
        if (!haystack.contains(needle)) return -1;

        return haystack.indexOf(needle);

    }
}
