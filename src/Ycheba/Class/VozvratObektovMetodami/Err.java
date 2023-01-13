package Ycheba.Class.VozvratObektovMetodami;

// Возврат объекта, определяемого разработчиком программы
class Err {
    String msg; // сообщение об ошибке
    int severity; // уровень серьезности ошибки

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class Errorlnfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbad[] = {3, 3, 2, 4};

    Err getErrorlnfo(int i) { // Возврат объекта типа Err
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);//При каждом вызове метода getErrorlnfo () создается новый объект типа
        else                                                      // Err, и ссылка на него возвращается вызывающему методу. Затем этот объект
            return new Err("Несуществующий код ошибки", 0); //используется методом main () для отображения степени серьезности ошибки и
                                                                //   текстового сообщения.


    }
}

class Errlnfo {
    public static void main(String args[]) {
        Errorlnfo err = new Errorlnfo();
        Err e;
        e = err.getErrorlnfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);
        e = err.getErrorlnfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);


    }
}

