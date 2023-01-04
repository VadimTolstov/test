package Ycheba.ForWhile;

class BreakMetka {
    public static void main(String args[]) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;      //переход по метки
                        if (i == 2) break two;      //переход по метки
                        if (i == 3) break three;    //переход по метки
                        // Эта строка кода никогда не будет достигнута
                        System.out.println("не будет выведено");
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for");
    }
}
