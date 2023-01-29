package Ycheba.Massivi;

class Massiv {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
        for (i = 0; i < 10; i +=1)//Индексация массивов начинается с нуля
            sample[i] = i;

        for (i = 0; i < 10; i = i + 1)//Индексация массивов начинается с нуля
            System.out.println("Элемент[" + i + "]: " + sample[i]);
    }
}