package lesson17;

public class StringB {

    static boolean isEqual(StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        if (s1.equals(s2)) return true;
        return false;
    }

}

class TestStringBuild {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("def");
        StringBuilder sb3 = new StringBuilder("abC");
        System.out.println(StringB.isEqual(sb1,sb2));
        System.out.println(StringB.isEqual(sb1,sb3));
        System.out.println(StringB.isEqual(new StringBuilder(""), new StringBuilder("")));
        System.out.println(StringB.isEqual(new StringBuilder(), new StringBuilder()));

    }

}