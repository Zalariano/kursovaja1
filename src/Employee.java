import java.util.Objects;

public class Employee {
     String name;
     String surname;
     String otchestvo;
    int salary;
    int departmentNumber;
    private static  int count = 1;
    int id;
    public Employee(String name, String surname, String otchestvo, int salary, int departmentNumber) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
        this.id = count++;
    }

    public  int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getOtchestvo() {
        return this.otchestvo;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartmentNumber(byte departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(otchestvo, employee.otchestvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, otchestvo);
    }

    @Override
    public String toString() {
        return "Имя:" + name + " " + "Фамилия: " + surname + " " + "Отчество: " + otchestvo + " " + "Зарплата: " + " " + salary + " " +
                "Номер отдела: " + " " + departmentNumber + " " + "id: " + id;
    }
}
