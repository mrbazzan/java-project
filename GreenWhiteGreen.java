
// APALOWO ABDULWASIU I.
// CPE/16/7814

public class GreenWhiteGreen {

        private static final String ANSI_GREEN_BACKGROUND = "\033[42m";
        private static final String ANSI_WHITE_BACKGROUND = "\033[47m";
        private static final String ANSI_RESET = "\033[0m";

        public static void main(String[] args) {

            System.out.println(ANSI_GREEN_BACKGROUND
                    + "Green"
                    +ANSI_WHITE_BACKGROUND
                    + "White"
                    +ANSI_GREEN_BACKGROUND
                    + "Green"
                    + ANSI_RESET);
        }
    }

