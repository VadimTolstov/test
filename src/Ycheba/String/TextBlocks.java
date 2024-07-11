package Ycheba.String;

//Форматирование текстовых блоков
public class TextBlocks {
    public static void main(String[] args) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.addStudent(studentDTO.name, studentDTO.grade);
    }
}

class StudentDTO {
    String name = "Robert'); DROP TABLE Students;--";
    int grade = 1;

    public void addStudent(String name, int grade) {
        String query = """
                INSERT INTO Students(grade, name)
                VALUES(%d, '%s'""".formatted(grade, name);
        System.out.println(query);
    }
}
