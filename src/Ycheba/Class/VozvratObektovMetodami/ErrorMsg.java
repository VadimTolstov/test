package Ycheba.Class.VozvratObektovMetodami;

// Возврат объекта типа String

class ErrorMsg {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"

    };

    // Возврат сообщения об ошибке
    String getErrorMsg(int i) {//Возврат объекта типа String
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

class ErrMsg {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
