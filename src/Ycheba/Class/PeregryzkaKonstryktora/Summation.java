package Ycheba.Class.PeregryzkaKonstryktora;

// Инициализация одного объекта посредством другого
class Summation {
    int sum;

    // Создание объекта на основе целочисленного значения
    Summation(int num) { //Создание одного объекта на основании другого объекта
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    // Создание одного объекта на основе другого
    Summation(Summation ob) {
        sum = ob.sum;// Равно sum Summation(int num) после выполнения
    }
}

class SumDemo {
    public static void main(String args[]) {
        Summation si = new Summation(5);
        Summation s2 = new Summation(si);
        System.out.println("si.sum: " + si.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
//Как следует из приведенного выше примера, использование одного объекта
//при инициализации другого нередко вполне оправданно. В данном случае при
//создании объекта s2 нет необходимости вычислять сумму. Даже если подобная
// инициализация не повышает быстродействие программы, зачастую удобно
//иметь конструктор, создающий копию объекта.