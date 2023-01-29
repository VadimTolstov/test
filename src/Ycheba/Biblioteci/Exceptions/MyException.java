package Ycheba.Biblioteci.Exceptions;


//Чтобы создать своё собственное исключение, мы должны расширить
// класс Exceptions или его подклассы.
//Давайте рассмотрим пример создания своего собственного исключения

public class MyException extends Exception {
    public static void main(String[] args) {

    }
    private int detail;
    public MyException(int detail, String message) {
        super(message);
        this.detail = detail;
    }
    @Override
    public String toString() {
        return "MyException{"
               + "detail=" + detail
               + ", message=" + getMessage()
               + "} ";
    }
}