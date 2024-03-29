package Ycheba.Class;

import java.io.IOException;

class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        Help hlpobj = new Help();

        for (; ; ) {
            do {
                hlpobj.showmen();

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpon(choice);
        }
    }
}

class Help {
    void helpon(int what) {
        switch (what) {
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

        }
        System.out.println();
    }


    void showmen() {
        System.out.print("""
                Справка:\s
                1. if\s
                2. switch\s
                3. for\s
                4.while\s
                5. do-while\s
                6. break\s
                7. continue\s
                Выберите (q - выход):\s""");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }

}


