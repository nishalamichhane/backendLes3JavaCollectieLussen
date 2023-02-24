import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Maak in je main methode een Integer array genaamd numeric die je vult met de nummers 1,2,3,4,5,6,7,8,9,0.
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //Maak in je main methode een String array genaamd alphabetic die je vult met de String varianten van de nummers uit stap 1, dus: "een", "twee", ... etc ..., "negen", "nul".
        String[] alphabetic = {"Een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
        //System.out.println(numeric);
        //Nu ga je deze aanroepen met de juiste argumenten in de main methode van de Main class, oftewel: maak in main een nieuw object aan van het type Translator.
        Translator translator = new Translator(numeric, alphabetic);

        //Maak in de main methode van de Main class een boolean variabele genaamd play
        // met de waarde true. Maak een String variabele genaamd ongeldig waarin je de String "ongeldige invoer" zet.
        // Als laatst maak je nog een nieuw Scanner object aan met Scanner scanner = new Scanner(System.in).

        Boolean play = true;
        String ongeldig = "Ongeldige invoer";
        Scanner scanner = new Scanner(System.in);
        //Vervolgens maak je een while-loop die doorgaat zolang play true is.
        while(play){
            //Print in de while-loop "Type 'x' om te stoppen \nType 'v' om te vertalen" en maak een String variabele genaamd input waarin je de waarde van scanner.nextLine() opslaat.
            System.out.println("Type 'x' om te stoppen");
            System.out.println("Type 'v' om te vertalen");
            String input = scanner.nextLine();
            //i. if: Als de input "x" is, dan zet je play naar false.
            if(Objects.equals(input, "x")){
                play = false;
            }
            //ii. else if: Als de input "v" is, dan print je eerst "Type een cijfer in van 0 t/m 9",
            else if (Objects.equals(input, "v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                // vervolgens sla je het resultaat van scanner.nextInt() op in een variabele int number, voeg nog een scanner.nextLine();
                int number = scanner.nextInt();
                scanner.nextLine();
                //// toe op de volgende regel (scanner.nextInt doet dit namelijk niet van zichzelf) en als laatste check je met een if-statement of

                //a. if: number kleiner is dan 10, dan sla je de waarde van translator.translate(number) op in String result en print je "De vertaling van " + number + " is " + result.
                //b. else: anders dan print je ongeldig
                if(number < 10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " +number + " is " + result);
                }
                else{
                    System.out.println("ongeldig number");
                }
            }
            //iii. else: Als de input dus iets anders dan "x" of "v" is, dan print je ongeldig
            else{
                System.out.println("ongeldig");
            }
        }


    }
}