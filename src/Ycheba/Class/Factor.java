package Ycheba.Class;

class Factor {
    boolean isFactor(int a, int b) { //Этот метод имеет два параметра
        if ((b % a) == 0) return true;
        else return false;

    }
}

class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();

        //Передача двух аргументов методу is Fact or ()
        if (x.isFactor(2,  20))System.out.println("2 - делитель");
        if (x.isFactor(3, 20)) System.out.println("эта строка не будет выведена");
    }
}