package Day19;

public class MyInteger {

    public static Integer valueOf(String s) throws NumberFormatException {
        if ("aaaa".equals(s)) {
            return Integer.valueOf(Integer.parseInt(s, 10));
        }
        return new Integer(3);
    }
}
