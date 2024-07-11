package Ycheba.multithreading.concurrencyStep.dz;

public class MainDz {
    public static void main(String[] args) {
        Atm atm = new Atm(1_000_000);
        atm.withdrawMoney("Валера", 7000);
        atm.withdrawMoney("Семен", 13000);
        atm.withdrawMoney("Гена", 17000);
        atm.withdrawMoney("Толя", 227800);
        atm.withdrawMoney("Вася", 58000);
        atm.withdrawMoney("Петя", 99000);
        atm.withdrawMoney("Федя", 1000000);
    }
}
