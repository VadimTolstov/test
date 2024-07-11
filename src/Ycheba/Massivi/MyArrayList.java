package Ycheba.Massivi;
/*
Степик 3.9 Java с нуля до Junior + https://stepik.org/lesson/721036/step/1?unit=722151
 */


class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("James");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("-----------------------------");
        System.out.println(employees.get(10));

        System.out.println("-----------------------------");
        employees.remove("Emma");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("-----------------------------");
        System.out.println(employees.get(0));
        employees.remove(0);
    }

    private static MyArrayList getEmployees() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("John");
        myArrayList.add("Olivia");
        myArrayList.add("Emma");
        myArrayList.add("Max");
        myArrayList.add("Nick");
        return myArrayList;
    }
}


public class MyArrayList {
    private String[] array = new String[6];
    private int size = 0;

    public String get(int index) {
        String s = "";
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            s = e.getMessage();
        }
        if (index < 0) {
            System.out.println("Значение index не может быть меньше нуля!");
        } else if (index > size) {
            System.out.println("Значение index не может быть больше размера массива!" + "\nРазмер массива " + getSize());
        }
        return s;
    }

    public void add(String element) {
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index > -1 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            array[size] = null;
        }
    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}

