package Ycheba.Records;
/*
record финальный абстрактный класс имеет у себя два конструктора компакт и конанический
Иммутабельный
Всегда имеют каконический конструктор с параметрами, соответствующим компонентам
Всегда имеет аксессоры с именами, соответствующим компонентам
Два рекорта, сконструированные с одинаковыми параметрами, равны по equals и имеют ранвый hasCode
Если считать компоненты через аксесоры и создать из них новый рекорд, он будет
равен исходному по equals и иметь такой же hasCod
 */
public record Point(int x, int y) {//это (int x, int y) заголовок у record

    public Point {
        if (x < 0 || y > 0) {
            throw new IllegalArgumentException();
        }
    }
}