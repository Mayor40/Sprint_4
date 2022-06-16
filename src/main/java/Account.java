public class Account {

    private final String name;


    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {

        return name.length() >= 3 && name.length() <= 19 && spacesCount(name) == 1 && hasLeadingOrTrailingSpaces();
    }

    private int spacesCount(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) count++;
        }
        return count;
    }

    private boolean hasLeadingOrTrailingSpaces() {
        return name.trim().length() == name.length();
    }
}
