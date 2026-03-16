public class UC7  {
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });
        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
        CharacterPatternMap[] bannerLetters = {O, O, P, S};
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (CharacterPatternMap letter : bannerLetters) {
                lineBuilder.append(letter.getPattern()[row]).append("  ");
            }
            System.out.println(lineBuilder.toString());
        }
    }
}