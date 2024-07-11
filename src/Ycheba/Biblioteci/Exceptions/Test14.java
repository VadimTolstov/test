package Ycheba.Biblioteci.Exceptions;

public class Test14 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
          try {
              System.out.println(s.length());//поймать можно только с новым try catch
          }catch (NullPointerException exception){
              System.out.println("Это внутренний catch");
          }
        } catch (NullPointerException e) {
            System.out.println("Пойман NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test14 test14 = new Test14();
        test14.abc();
    }
}
