import java.util.Scanner;


public class Main {

    public static String[] words = new String[1000];

    public static void main(String[] args) {


        //giveBackNumbers();
        scanner();


    }


    static public String numberWord(int number) {
        String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn" };

        return numbers[number - 1];
    }


    static public void giveBackNumbers() {
        String result = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = "#$" + i;
                System.out.println(result);
            } else if (i % 3 == 0) {
                result = "#" + i;
                System.out.println(result);
            } else if (i % 5 == 0) {
                result = "$" + i;
                System.out.println(result);
            } else {
                result = Integer.toString(i);
                System.out.println(result);
            }
        }
    }


    public static void scanner() {

        //Zählen der bereits befüllten Stellen in Array words
        while (true) {
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                String str = words[i];
                if (str != null && str.length() > 0) {
                    count++;
                }
            }
            //Ausgabe des bestehenden Arrays
            for (int i = 0; i < count; i++) {
                System.out.print(words[i] + " ");
            }
            System.out.println("");


            //Eingabe der neuen Wörter, die zu dem Array hinzugefügt werden.
            System.out.println("Bitte geben Sie einen Satz oder Ihre Sammlung von Wörtern, getrennt mit Lehrzeichen und ohne Satzzeichen, ein.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            //Splitten des Eingabestrings in ein neues Array
            String[] newWords = input.split(" ");

            //Befüllen des bestehenden Arrays mit den neuen Wörtern

            for (int i = 0; i < newWords.length; i++) {
                words[count] = newWords[i];
                count++;
            }
        }
    }
}
