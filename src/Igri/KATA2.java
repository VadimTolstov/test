package Igri;

import java.util.Scanner;

public class KATA2 {
    private static final char exitCharacter = '!';

    public static void main(String[] args) {
        DataReader reader = new DataReader(exitCharacter);
        while (true) {
            try {
                reader.read();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                continue;
            }
            if (reader.isExitFlag()) {
                System.out.println("В выражении пристутствует знак выхода: " + exitCharacter);
                System.out.println("Завершение программы.");
                break;
            }
            double result = Calculator.calculate(reader.getVar1(), reader.getVar2(), reader.getOper());
            System.out.println(result);
        }
    }
}




class DataReader {

    private int number1;
    private int number2;
    private char operation;
    private boolean exitFlag;
    private char exitCharacter;
    private char resultChar;


    public DataReader(char exitCharacter) {
        this.exitCharacter = exitCharacter;
        this.resultChar = '=';
    }


    public void read() {



        System.out.println("Введите выражение, состоящее из двух целых чисел от 0 до 10, знака операции и знака равно (напр. 2+2=): ");
        Scanner scanner = new Scanner(System.in);
        //StringBuilder builder = new StringBuilder();
        String text = scanner.nextLine();

        try {
            if ((text.charAt(text.length() - 1) != resultChar)) {
                throw new RuntimeException();
           }

            text = text.substring(0, text.length() - 1);
            String[] blocks = text.split("[+-/*]");



                    number1 = Integer.parseInt(blocks[0]);
                    operation = text.charAt(blocks[0].length());
                    number2 = Integer.parseInt(blocks[1]);



            if ((number1 > 10 || number1 < 1) || (number2 > 10 || number2 < 1)) {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат данных");
        }
    }



    public int getVar1() {
        return number1;
    }

    public int getVar2() {
        return number2;
    }

    public char getOper() {
        return operation;
    }

    public boolean isExitFlag() {
        return exitFlag;
    }
}

class Calculator {


    public static double calculate(int number1, int number2, char operation){
        int result = 0;
        switch (operation){
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': result = number1 / number2; break;
            default:throw  new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }

}

