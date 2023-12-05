public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        array(new String[]{"hello", "world", "caKes"});

    }
    static String[] array(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("K")) {

                System.out.println(words[i].toUpperCase());

            }

        } return words;
    }
}