import java.util.Scanner;

public class Menu {
    private static final String HELLO = "Вітаю! Це симулятор острова, параметри якого ти можеш \n" +
            "задати сам. Вкажи ширину острова (від 1 - 100)";
    private static final String YOU_INPUT = "Ви ввели ";
    private static final String WIDTH_ISLAND = "Ширина острова становить  ";
    private static final String LENGTH_ISLAND = "Довжина острова становить  ";
    private static final String INPUT_LENGTH_ISLAND = "Вкажи довжину острова (від 1 - 100) ";
    private static final String EROR = "Некоректні дані! Введіть ще раз. ";
    private String inputText;
    private int inputNumber;
    Scanner scanner = new Scanner(System.in);
    public void seyHello (){
        System.out.println(HELLO);
    }
    public void inputText(){
        String inputText = scanner.nextLine();
        System.out.println(YOU_INPUT + inputText);
        inputNumber = Integer.parseInt(inputText);
    }

    public void setWidthIsland (int number, Location location){
        if (number> 1 && number<101){
            location.setWidth(number);
            System.out.println(WIDTH_ISLAND + number);
            System.out.println(INPUT_LENGTH_ISLAND);
        }else {
            System.out.println(EROR);
        }
    }
    public void setLengthIsland (int number, Location location){
        if (number> 1 && number<101){
            location.setLength(number);
            System.out.println(LENGTH_ISLAND + number);
        }else {
            System.out.println(EROR);
        }
    }
    public int getInputNumber() {
        return inputNumber;
    }
}