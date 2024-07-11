package Ycheba.IfSwitch;

//новый switch из 17 java
public class Switch2 {

    int abc(Pet pet) {
        int legs = switch (pet) {
            case DOG, CAT -> 4;
            case PARROT -> 2;
            case GOLDFISH -> {//можем писать блоки
                System.out.println("Получаем данные из блока");
                yield 2;//в конце блока нужна вернуть значение
            }
            case null -> 5;//можно обрабатывать null в 17 джаве
        };
        return legs;
    }

//    void dcc(int a) {
//        switch (a) {
//            case 2||3 -> System.out.println("Можно писать условие"); в 17 джаве можно условие в свичь вставлять но что то не получилось
//            default -> System.out.println("Должен быть дефолт");
//        }
//    }
}

enum Pet {
    DOG, CAT, PARROT, GOLDFISH
}
