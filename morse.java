import java.util.HashMap;
import java.util.Scanner;

public class morse {
    public static void main(String[] args) {

        HashMap<Character, String> HashMapCastellanoAMorse = new HashMap<>();

        HashMapCastellanoAMorse.put('A', ".-");
        HashMapCastellanoAMorse.put('B', "-...");
        HashMapCastellanoAMorse.put('C', "-.-.");
        HashMapCastellanoAMorse.put('D', "-..");
        HashMapCastellanoAMorse.put('E', ".");
        HashMapCastellanoAMorse.put('F', "..-.");
        HashMapCastellanoAMorse.put('G', "--.");
        HashMapCastellanoAMorse.put('H', "....");
        HashMapCastellanoAMorse.put('I', "..");
        HashMapCastellanoAMorse.put('J', ".---");
        HashMapCastellanoAMorse.put('K', "-.-");
        HashMapCastellanoAMorse.put('L', ".-..");
        HashMapCastellanoAMorse.put('M', "--");
        HashMapCastellanoAMorse.put('N', "-.");
        HashMapCastellanoAMorse.put('O', "---");
        HashMapCastellanoAMorse.put('P', ".--.");
        HashMapCastellanoAMorse.put('Q', "--.-");
        HashMapCastellanoAMorse.put('R', ".-.");
        HashMapCastellanoAMorse.put('S', "...");
        HashMapCastellanoAMorse.put('T', "-");
        HashMapCastellanoAMorse.put('U', "..-");
        HashMapCastellanoAMorse.put('V', "...-");
        HashMapCastellanoAMorse.put('W', ".--");
        HashMapCastellanoAMorse.put('X', "-..-");
        HashMapCastellanoAMorse.put('Y', "-.--");
        HashMapCastellanoAMorse.put('Z', "--..");
        HashMapCastellanoAMorse.put('0', "-----");
        HashMapCastellanoAMorse.put('1', ".----");
        HashMapCastellanoAMorse.put('2', "..---");
        HashMapCastellanoAMorse.put('3', "...--");
        HashMapCastellanoAMorse.put('4', "....-");
        HashMapCastellanoAMorse.put('5', ".....");
        HashMapCastellanoAMorse.put('6', "-....");
        HashMapCastellanoAMorse.put('7', "--...");
        HashMapCastellanoAMorse.put('8', "---..");
        HashMapCastellanoAMorse.put('9', "----.");
        HashMapCastellanoAMorse.put(' ', "/");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto en castellano:");
        String input = scanner.nextLine().toUpperCase();

        StringBuilder textoCastellanoAMorse = new StringBuilder();

        for (char caracter : input.toCharArray()) {

            String morse = HashMapCastellanoAMorse.get(caracter);

            if (morse != null) {
                textoCastellanoAMorse.append(morse).append(" ");
            } else {
                System.out.println("Valor " + caracter + " no admitible");
            }
        }

        System.out.println("Tu texto en castellano ha sido traducido a morse:");
        System.out.println(textoCastellanoAMorse.toString().trim());

        HashMap<String, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put(".-", "A");
        morseCodeMap.put("-...", "B");
        morseCodeMap.put("-.-.", "C");
        morseCodeMap.put("-..", "D");
        morseCodeMap.put(".", "E");
        morseCodeMap.put("..-.", "F");
        morseCodeMap.put("--.", "G");
        morseCodeMap.put("....", "H");
        morseCodeMap.put("..", "I");
        morseCodeMap.put(".---", "J");
        morseCodeMap.put("-.-", "K");
        morseCodeMap.put(".-..", "L");
        morseCodeMap.put("--", "M");
        morseCodeMap.put("-.", "N");
        morseCodeMap.put("---", "O");
        morseCodeMap.put(".--.", "P");
        morseCodeMap.put("--.-", "Q");
        morseCodeMap.put(".-.", "R");
        morseCodeMap.put("...", "S");
        morseCodeMap.put("-", "T");
        morseCodeMap.put("..-", "U");
        morseCodeMap.put("...-", "V");
        morseCodeMap.put(".--", "W");
        morseCodeMap.put("-..-", "X");
        morseCodeMap.put("-.--", "Y");
        morseCodeMap.put("--..", "Z");
        morseCodeMap.put("-----", "0");
        morseCodeMap.put(".----", "1");
        morseCodeMap.put("..---", "2");
        morseCodeMap.put("...--", "3");
        morseCodeMap.put("....-", "4");
        morseCodeMap.put(".....", "5");
        morseCodeMap.put("-....", "6");
        morseCodeMap.put("--...", "7");
        morseCodeMap.put("---..", "8");
        morseCodeMap.put("----.", "9");
        morseCodeMap.put("/", " ");

        scanner = new Scanner(System.in);
        System.out.println("Introduce el texto en Morse (usa espacios para separar caracteres y '/' para separar palabras):");
        String morseInput = scanner.nextLine();

        String[] morseSymbols = morseInput.split(" ");

        StringBuilder translatedText = new StringBuilder();
        for (String symbol : morseSymbols) {
            String translatedChar = morseCodeMap.get(symbol);
            if (translatedChar != null) {
                translatedText.append(translatedChar);
            } else {
                translatedText.append("?");
            }
        }

        System.out.println("Texto traducido: " + translatedText.toString());


    }


}
