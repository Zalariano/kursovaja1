public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());

        }
        System.out.println();
    }

    public static int salaryCount(Employee[] employees) {

        int summa = 0;
        for (Employee employee : employees) {
            final int current = employee.salary;
            summa = summa + current;
        }
        return summa;
    }

    public static void lookingForMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee j : employees) {
            if (j.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = j;
            }
        }
        System.out.println("Работник с наибольшей заработной платой  " + employeeWithMaxSalary);
    }

    public static void lokingForMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        System.out.println("Работник с наименьшей заработной платой  " + employeeWithMinSalary);
    }

    public static void countAverageSalary(Employee[] employees) {
        double averageSalary;
        averageSalary = (double) salaryCount(employees) / employees.length;
        System.out.println("Средние месячные расходы на зарплату составили: " + averageSalary);
        System.out.println();
    }

    public static void poluchitDannyje(Employee[] employees) {
        System.out.println("Список сотрудников");
        for (Employee employee : employees) {
            final String curentSurname = employee.surname;
            final String curentName = employee.name;
            final String curentOtchestvo = employee.otchestvo;
            System.out.println(" Фамилия : " + curentSurname + " Имя : " + curentName + " Отчество : " + curentOtchestvo);
        }

    }


    public static void main(String[] args) {

        employees[0] = new Employee("Roman1", "Prakapovich", "Victorovich", 8000, 1);
        employees[1] = new Employee("Roman2", "Prakapovich", "Victorovich", 6000, 2);
        employees[2] = new Employee("Roman3", "Prakapovich", "Victorovich", 5000, 3);
        employees[3] = new Employee("Roman4", "Prakapovich", "Victorovich", 7000, 4);
        employees[4] = new Employee("Roman5", "Prakapovich", "Victorovich", 4000, 5);
        employees[5] = new Employee("Roman6", "Prakapovich", "Victorovich", 2500, 5);
        employees[6] = new Employee("Roman7", "Prakapovich", "Victorovich", 9000, 4);
        employees[7] = new Employee("Roman8", "Prakapovich", "Victorovich", 20000, 3);
        employees[8] = new Employee("Roman9", "Prakapovich", "Victorovich", 3300, 2);
        employees[9] = new Employee("Roman10", "Prakapovich", "Victorovich", 6000, 1);
        printAllEmployee(employees);
        System.out.println("Mесячные расходы на зарплату составили: " + salaryCount(employees));
        System.out.println();
        lokingForMinSalary(employees);
        lookingForMaxSalary(employees);
        countAverageSalary(employees);
        poluchitDannyje(employees);

    }

}