package Ycheba.IfSwitch;

public class elvis {
    public static void main(String[] args) {
        // Одно и тоже но через тернарного оператора
//        int variable = 7;
 //       if (variable > 10) {
 //           variable = variable - 10;
  //      } else {
  //          variable = variable + 10;
        int x = 7;
        x = x > 10 ? x-10 : x+10;
        System.out.println(x);
    }
}

