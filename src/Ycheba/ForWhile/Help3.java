package Ycheba.ForWhile;

import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {
        char choice, ignore;
        eXit:
        for (; ; ) {
            do {
                System.out.print("Справка: \n1. if \n2. switch \n3. for \n4.while \n5. do-while \n6. break \n7. continue \nВыберите (q - выход): ");
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');
            System.out.println();
            switch (choice) {
                case '1':
                    System.out.println("Инструкция if:\n");
                    System.out.println("if(условие) инструкция;");
                    System.out.println("else инструкция;");
                    break;
                case '2':
                    System.out.println("Инструкция switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность инструкций");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Цикл for:\n");
                    System.out.print("for(инициализация; условие; итерация)");
                    System.out.println(" инструкция;");
                    break;
                case '4':
                    System.out.println("Цикл while:\n");
                    System.out.println("while(условие) инструкция;");
                    break;
                case '5':
                    System.out.println("Цикл do-while:\n ");
                    System.out.println("do {");
                    System.out.println(" инструкция;");
                    System.out.println("} while (условие);");
                case '6':
                    System.out.println("Инструкция break:\n");
                    System.out.println("break; или break метка;");
                    break;
                case '7':
                    System.out.println("Инструкция continue:\n");
                    System.out.println("continue; или continue метка;");
                    break;
                case 'q':
                    break eXit;


            }
        }

    }
}