import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Morse {
    public static void main(String [] args ) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] trans = input.trim().split("\\s+");
        HashMap <String, String> morse = new HashMap<>();

        morse.put(".-", "A");
        morse.put("-...", "B");
        morse.put("-.-.", "C");
        morse.put("-..", "D");
        morse.put(".", "E");
        morse.put("..-.", "F");
        morse.put("--.", "G");
        morse.put("....", "H");
        morse.put("..", "I");
        morse.put(".---", "J");
        morse.put("-.-", "K");
        morse.put(".-..", "L");
        morse.put("--", "M");
        morse.put("-.", "N");
        morse.put("---", "O");
        morse.put(".--.", "P");
        morse.put("--.-", "Q");
        morse.put(".-.", "R");
        morse.put("...", "S");
        morse.put("-", "T");
        morse.put("..-", "U");
        morse.put("...-", "V");
        morse.put(".--", "W");
        morse.put("-..-", "X");
        morse.put("-.--", "Y");
        morse.put("--..", "Z");

        ArrayList<String> result = new ArrayList<>();
        
        for (String e : trans ) {
            morse.forEach((k, v) -> {
                if (e.equals(k)) {
                    result.add(v); 
                }
            });
            //         for (String e : trans ) {
            // morse.forEach((k, v) -> {
            //     if (e.equals(v)) {
            //         result.add(k); 
            //     }
            // });
        }
        for (String e : result){
            System.out.print(e);
        }
    }
}