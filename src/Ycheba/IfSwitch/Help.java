package Ycheba.IfSwitch;

import java.io.IOException;

 class Help {
    public static void main(String[] args) throws IOException {
        System.out.print("Справка: \n1. if \n2. switch \nВыберите: ");
        char choip = (char) System.in.read();
        System.out.println();
        switch (choip){
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
            default:
                System.out.print("Запрос не найден.") ;

        }
    }
}
