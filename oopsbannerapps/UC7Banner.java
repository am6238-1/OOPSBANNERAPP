import java.util.HashMap;
import java.util.Map;

public class UC7Banner {

    // Class representing a character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Static inner class to manage pattern mappings
    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            }));
        }

        public static String[] getPattern(char c) {
            CharacterPattern cp = patternMap.get(c);
            return cp != null ? cp.getPattern() : new String[0];
        }
    }

    public static void main(String[] args) {

        String word = "OOPS";
        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(c);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}