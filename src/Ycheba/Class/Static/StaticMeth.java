package Ycheba.Class.Static;

// Применение статического метода
class StaticMeth {
    static int val = 1024; // статическая переменная

    // Статический метод
    static int valDiv2() {
        return val / 2;
    }
}


class SDemo2 {
    public static void main(String args[]) {
        System.out.println("Значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " +
                           StaticMeth.valDiv2());

        StaticMeth.val = 4;
        System.out.println("Значение val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " +
                           StaticMeth.valDiv2());
    }
}/*  На применение методов типа s t a t i c накладывается ряд следующих ограничений:
 в методе типа static допускается непосредственный вызов только других
 методов типа static ;
 для метода типа static непосредственно доступными оказываются только
 другие данные типа static , определенные в его классе;
 в методе типа static должна отсутствовать ссылка this .
 В приведенном ниже классе код статического метода valDivDenom () создан
 некорректно.

   class StaticError {
     int denom =3; // обычная переменная экземпляра
     static int val = 1024; // статическая переменная
// Ошибка! К нестатическим переменным нельзя обращаться
// из статического метода,
                    static int valDivDenom() {
                        return val/denom; // не пройдет компиляцию!
                    }
   В данном примере denom является обычной переменной экземпляра, к которой нельзя
   обращаться из статического метода.
*/