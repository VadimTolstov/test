package ObjectZoo.Zoo;

public class Zoo {

    Object[] animals;
    public Zoo() {
        //в этой строке мы еще не создаем животных
        animals = new Object[3];
        //наполняем массив конкретными животными
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }
    public void print(){
        // Используем цикл!
        // Каждое животное выводится по-своему!
        for ( Object a: animals ){
            System.out.println(a); // Object недоступин .print
        }
    }
    //Помогает менять животных в массиве
    public void changer(Object a, int i){
        if (i>=0 && i < animals.length)
            animals[i] =a;
    }
}
