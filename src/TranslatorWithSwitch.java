import java.util.Scanner;

public class TranslatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово про погоду українською з маленької літери");
        String weatherWord = scanner.next();
        switch (weatherWord) {
            case "сонячно": {
                System.out.println("sunny");
                break;
            }
            case "хмарно": {
                System.out.println("cloudy");
                break;
            }
            case "дощово": {
                System.out.println("rainy");
                break;
            }
            case "вітряно": {
                System.out.println("windy");
                break;
            }
            case "туманно": {
                System.out.println("foggy");
                break;
            }
            case "холодно": {
                System.out.println("cold");
                break;
            }
            case "тепло": {
                System.out.println("warm");
                break;
            }
            case "спекотно": {
                System.out.println("hot");
                break;
            }
            case "морозно": {
                System.out.println("frosty");
                break;
            }
            case "прохолодно": {
                System.out.println("chilly");
                break;
            }
            default: {
                System.out.println("У данному українсько-англійському перекладачі такого слова немає");
                break;
            }
        }
    }
}
