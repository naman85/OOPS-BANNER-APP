public class UC6 {
    public static String[] opattern() {
        return new String[]{
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
    }
    public static String[] ppattern() {
        return new String[]{
            "******  ",
            "**   ** ",
            "**   ** ",
            "******  ",
            "**      ",
            "**      ",
            "**      "
        };
    }
    public static String[] spattern() {
        return new String[]{
            " ****** ",
            "**      ",
            "**      ",
            " *****  ",
            "      **",
            "      **",
            " ****** "
        };
    }

    public static void main(String[] args) {

        String[] O = opattern();
        String[] P = ppattern();
        String[] S = spattern();
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}