package Ycheba.Biblioteci.Exceptions.stepExceptions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7/a;
            int с =Integer.parseInt("sadasdasd");
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        } catch (Exception e1){
            e1.printStackTrace();
            System.out.println("Поймано исключение " + e1.getClass() + e1.getMessage() + Arrays.toString(e1.getStackTrace()));
        }
        System.out.println("Hello");
    }
}
