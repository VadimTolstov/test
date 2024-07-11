package Ycheba.Generik;

class ParameterizedClass {
    public static void main(String[] args) {

        Info<String> info1 = new Info<>("Привет");//подставили тип данных вмето <Т> <String>
        System.out.println(info1);
        String s = info1.getVale();

        Info<Integer> info2 = new Info<>(27);
        System.out.println(info2);
        Integer i = info2.getVale();
    }

    //Перегрузка методов с джинериков невозможно по этому 2й закомнетирован информация о джинерике затирается
    public void abc(Info<String> info) {
        String s = info.getVale();
    }

//    public void abc(Info<Integer> info) {
//        Integer s = info.getVale();
//    }
}

class Info<T> { //<T> Это какойто тип данных и при создании класса стр6 мы подставляем туда <String> или что то еще
    private T vale;

    public Info(T vale) {
        this.vale = vale;
    }

    public String toString() {
        return "[{" + vale + "}]";
    }

    public T getVale() {
        return vale;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getVale();
    }
}
//так же нижи при наследовании не даст переопределить метод с дженериком
//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer s = info.getVale();
//    }
//}