public class UC6Banner {

    // Method to generate letter O
    static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Method to generate letter P
    static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };
    }

    // Method to generate letter S
    static String[] buildS() {
        return new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Loop to print banner
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}