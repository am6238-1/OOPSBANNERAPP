public class OopsBannerUC4 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        // Store all lines in a String array
        String[] banner = {

            String.join("", "OOOOO   ", "PPPPP   ", "SSSSS"),
            String.join("", "OO  OO  ", "PP  PP  ", "SS     "),
            String.join("", "OO  OO  ", "PPPPP   ", "SSSSS "),
            String.join("", "OO  OO  ", "PP      ", "    SS"),
            String.join("", "OOOOO   ", "PP      ", "SSSSS")
        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}