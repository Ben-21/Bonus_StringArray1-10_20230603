public class Main {

    public static void main(String[] args){

       giveBackNumbers();



    }

    static public String numberWord(int number){
        String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

        return numbers[number-1];
    }


    static public void giveBackNumbers(){
        String result = "";
        for (int i = 1; i <= 100; i++){
            if (i%3 == 0 && i%5 == 0){
                result = "#$"+i;
                System.out.println(result);
            }else if (i%3 == 0){
                result = "#"+i;
                System.out.println(result);
            } else if (i%5 == 0){
                result = "$"+i;
                System.out.println(result);
            } else {
                result = Integer.toString(i);
                System.out.println(result);
            }
        }


    }


}
