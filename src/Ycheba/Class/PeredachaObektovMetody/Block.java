package Ycheba.Class.PeredachaObektovMetody;

// Методам можно передавать объекты
class Block {

    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Возврат логического значения true, если
// параметр ob определяет тот же параллелепипед
    boolean sameBlock(Block ob) {//использование обьектного типа в качестве параметра
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Возврат логического значения true, если
// параметр ob определяет параллелепипед того же объема
    boolean sameVolume(Block ob) {//использование обьектного типа в качестве параметра
        if (ob.volume == volume) return true;
        else return false;
    }

}


class PassOb {
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
        System.out.println("ob1 имеет те же размеры, что и оЬ2: " +
                           ob1.sameBlock(ob2));//передача обьекта
        System.out.println("ob1 имеет те же размеры, что и оЬЗ: " +
                           ob1.sameBlock(ob3));//передача обьекта
        System.out.println("ob1 имеет тот же объем, что и оЬЗ: " +
                           ob1.sameVolume(ob3));//передача обьекта
    }
}
/*В методах sameBlock () и sameVolume () объект Block, переданный им в
качестве параметра, сравнивается с текущим объектом. Метод sameBlock ()
возвращает логическое значение true только в том случае, если все три размера
обоих параллелепипедов совпадают. В методе же sameVolume () сравниваются
лишь объемы двух параллелепипедов. Но в обоих случаях параметр ob имеет
тип Block. Несмотря на то что Block — это класс, параметры данного типа используются
 точно так же, как и параметры встроенных в Java типов данных.


 */


