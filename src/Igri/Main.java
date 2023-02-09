package Igri;

class Main {
    public static void main(String[] args) {
        //Вывести граници диапозона
        //Вывести числа из этого диапозона
        //вывести Fizz если число кратно 3
        //вывести Buzz если число кратно 5
        //вывести FizzBuzz если число кратно 3 и 5

        int lowerBound = 0;
        int upperBound = 20;
        System.out.println("lowerBounda " + lowerBound);
        System.out.println("upperBound " + upperBound);

        for (int i =lowerBound; i <= upperBound; i++)
            System.out.println(i);

        for (int i =lowerBound; i <= upperBound; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i%5==0) {
                System.out.println("Buzz");

            }else System.out.println(i);
        }
    }
}
