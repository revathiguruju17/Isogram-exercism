
class IsogramChecker {

    boolean isIsogram(String phrase) {
        for (int i = 0; i < phrase.length()-1; i++) {
            boolean isAlphabet = checkForCharacter(phrase.charAt(i));
            for (int j = i + 1; j < phrase.length(); j++) {
                boolean isLetterSame = checkForCaseSensitive(phrase.charAt(i), phrase.charAt(j));
                if (isLetterSame && isAlphabet) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkForCaseSensitive(char character1, char character2) {
        return character1 == character2 || Math.abs(character1 - character2) == 32;
    }

    private boolean checkForCharacter(char character) {
        return (character > 64 && character < 91) || (character < 123 && character > 96);
    }
}