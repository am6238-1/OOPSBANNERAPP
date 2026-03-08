import java.util.HashMap;
import java.util.Map;

public class UC8Banner {

    public static void main(String[] args) {

        // HashMap storing character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String bannerWord = "OOPS";
        int height = 5;

        // Build banner row by row
        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : bannerWord.toCharArray()) {
                String[] pattern = patternMap.get(c);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}