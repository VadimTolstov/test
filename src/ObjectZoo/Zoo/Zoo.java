package ObjectZoo.Zoo;
import java.util.Arrays;
public class Zoo {

    Object[] objects;
    public Zoo() {
        //в этой строке мы еще не создаем животных
        objects = new Object[3];
        //наполняем массив конкретными животными
        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }
//    public String toString(){  //вариант 2
//        return "Zoo: " + Arrays.toString(objects);
//    }
        public void print(){
          // Используем цикл!
          // Каждое животное выводится по-своему!              вариант 1
         for ( Object a: objects){
             System.out.println(a); // Object недоступин .print
    }
}
   public void sound(){
       // Используем цикл!
            for ( Object a: objects){
                // если объект издает звук, послушаем!
            if (a instanceof  Sundable)//если а instanceof(проверяет возращяет true) реализует интерфейс Sundable
                ((Sundable)a).sound();//тогда приводим а к Sundable и выполняем функцию sound
                //Тогда функция sound будет проходить по всему массиву и вызывать sound только для тех
                //обьектов которые реализуют интерфейс Sundable
         }
    }

        //Помогает менять животных в массиве
    public void changer(Object a, int i){
        if (i>=0 && i < objects.length)
            objects[i] =a;
    }
}
