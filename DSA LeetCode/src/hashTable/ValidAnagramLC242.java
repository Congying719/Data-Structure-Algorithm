package hashTable;

public class ValidAnagramLC242 {

    public static void main(String[] args) {
        System.out.println(validAnagram("hgfd","dfgh"));

    }

    public static boolean validAnagram(String string, String sub) {
        char[] chars = string.toCharArray();
        int[] numbers = new int[26];
        for(char c: string.toCharArray()) {
            numbers[c-'a'] += 1;
        }
        for(char c: sub.toCharArray()) {
            numbers[c-'a'] -= 1;
        }
        for (int i:numbers) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
