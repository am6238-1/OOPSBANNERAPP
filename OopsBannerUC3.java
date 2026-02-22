public class OopsBannerUC3 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        // Each line created using String.join()
        String line1 = String.join("",
                "OOOOO   ",
                "OOOOO   ",
                "PPPPP   ",
                "PPPPP   ",
                "SSSSS"
        );

        String line2 = String.join("",
                "OO  OO  ",
                "OO  OO  ",
                "PP  PP  ",
                "PP  PP  ",
                "SS"
        );

        String line3 = String.join("",
                "OO  OO  ",
                "OO  OO  ",
                "PPPPP   ",
                "PPPPP   ",
                "SSSSS"
        );

        String line4 = String.join("",
                "OO  OO  ",
                "OO  OO  ",
                "PP      ",
                "PP      ",
                "    SS"
        );

        String line5 = String.join("",
                "OOOOO   ",
                "OOOOO   ",
                "PP      ",
                "PP      ",
                "SSSSS"
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}