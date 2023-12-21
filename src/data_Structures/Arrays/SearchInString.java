package data_Structures.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Keyur";
        char ch = 'e';
        System.out.println(searchInString2(name, ch));
    }
    static boolean searchInString(String name, char ch) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (ch == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean searchInString2(String name, char ch) {
        if (name.length() == 0) {
            return false;
        }
        for (char chr : name.toCharArray()) {
            if (chr == ch){
                return true;
            }
        }
        return false;
    }
}
