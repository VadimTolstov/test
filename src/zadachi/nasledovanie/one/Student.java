package zadachi.nasledovanie.one;

import java.util.Arrays;

public class Student {
    private StringBuilder name;
    private int course;
    private int[] grade;

    public Student(StringBuilder name, int course, int... grade) {
        if (name.length() > 3) {
            this.name = name;
        }
        if (course > 0 && course < 5) {
            this.course = course;
        }
        int iterator = 0;
        for (int s : grade) {
            if (s > 0 && s < 11)
                iterator++;
        }
        int[] massiv = new int[iterator];
        int y = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > 0 && grade[i] < 11) {
                massiv[y] = grade[i];
                y++;
            }
        }
        this.grade = massiv;
    }

    public void showInfo() {
        System.out.println("Имя студента " + getName());
        System.out.println("Курс студента " + getCourse());
        System.out.print("Оценки студента " + Arrays.toString(getGrade()));
    }

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public int getCourse() {
        return course;
    }

    public int[] getGrade() {
        return grade;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student(new StringBuilder("Иван"), 4, 3, 5, 6, 10, 45, -2);
        st.showInfo();
    }
}
