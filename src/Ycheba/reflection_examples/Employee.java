package Ycheba.reflection_examples;

public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Employee() {

    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

//    public double getSalary() {
//        return salary;
//    }

    private void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Новый департамент: " + department);
    }

    public void increasesSalary() {
        salary *= 2;
    }

//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", department='" + department + '\'' +
               ", salary=" + salary +
               '}';
    }
}
