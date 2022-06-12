public class Account {

    private final String name;


    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {

        if (name.length() > 3 && name.length() <= 19 && spacesCount(name) <= 1 && hasLeadingOrTrailingSpaces())
            return true;
        else return false;
    }
    private int spacesCount(String name){
        int count = 0;
        for(int i = 0; i < name.length(); i++) {
            if(Character.isWhitespace(name.charAt(i))) count++;
        }
        return count;
    }
    private boolean hasLeadingOrTrailingSpaces() {
        String compareName = name;
        if (compareName.trim().length() != compareName.length()) {
            return false;
        }
        return true;
    }

}
