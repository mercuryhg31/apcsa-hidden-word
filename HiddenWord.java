public class HiddenWord {
    private String word;

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        if (guess.equals(word)) {
            return word;
        }
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                hint += guess.charAt(i);
            } else if (inWord(guess.charAt(i))) {
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }

    private boolean inWord(char a) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == a) {
                return true;
            }
        }
        return false;
    }
}