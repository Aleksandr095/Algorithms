public class Task2 {

    public int wordsCount(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) count++;
        }
        return count;
    }
}
