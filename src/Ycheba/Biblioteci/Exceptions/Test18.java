package Ycheba.Biblioteci.Exceptions;

public class Test18 {
    public static void main(String[] args) throws Exception {

        OurCoolUncheckedException exception = getException(3);
        System.out.println("getException().getErrorCode() = " + exception.getErrorCode());
        throw exception;

    }

    public static OurCoolUncheckedException getException(int errorCode) {
        return switch (errorCode) {
            case 1:
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.FIRST_ERROR.getCode(), new Throwable(), ErrorCodes.FIRST_ERROR);
            case 2:
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.SECOND_ERROR.getCode(), new Throwable(), ErrorCodes.SECOND_ERROR);
            default: // Здесь мы подхватим тройку и все остальные коды, которые мы еще не добавили, то есть, это действие по умолчанию. Подробнее можешь узнать здесь Switch case Java (оператор switch в Java) (javarush.ru)
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.THIRD_ERROR.getCode(), new Throwable(), ErrorCodes.THIRD_ERROR);
        };
    }
}

class OurCoolUncheckedException extends RuntimeException {
    private Integer errorCode;

    public OurCoolUncheckedException(String message) {
        super(message);
    }

    public OurCoolUncheckedException(Throwable cause) {
        super(cause);
    }

    public OurCoolUncheckedException(String message, Throwable throwable) {

        super(message, throwable);
    }

    public OurCoolUncheckedException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode.getCode();
    }

    public Integer getErrorCode() {
        return errorCode;
    }
}

enum ErrorCodes {
    FIRST_ERROR(1),
    SECOND_ERROR(2),
    THIRD_ERROR(3);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}