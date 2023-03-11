public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    private static void printInfo(){
        for(Employee employee: EMPLOYEES){
            System.out.println(employee.toString());
        }
    }
    private static int sumOfSalary(){
        int sum = 0;
        for(Employee employee: EMPLOYEES){
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    private static Employee minimalSalaryEmployee(){
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for(Employee employee1: EMPLOYEES){
            if (employee.getSalary() < min){
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }
    private static Employee maximalSalaryEmployee(){
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for(Employee employee1: EMPLOYEES){
            if (employee.getSalary() > max){
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    private static double averageSalary(){
        return sumOfSalary() / (double) EMPLOYEES.length;
    }
    private static void printNameOfEmployees(){
        for(Employee employee: EMPLOYEES){
            System.out.println(employee.getName());
        }
    }


    public static void main(String[] args) {

        EMPLOYEES[0] = new Employee("Ivan Ivanov Ivanovich", 200000, 1);
        EMPLOYEES[1] = new Employee("Ira Irova Irinovna",170000,2);
        EMPLOYEES[2] = new Employee("Rodik Rodikov Rodikovich",300000,3 );
        EMPLOYEES[3] = new Employee("Govor Govorov Govorovich",198765,4);
        EMPLOYEES[4] = new Employee("Andrey Andreyev Andreyevich",100000,5);
        EMPLOYEES[5] = new Employee("Maxim Maximov Maximovich",90000,1);
        EMPLOYEES[6] = new Employee("Nadya Nadya Nadyina", 70000,2);
        EMPLOYEES[7] = new Employee("Vadim Vadimov Vadimovich",400000,3);
        EMPLOYEES[8] = new Employee("Sergey Sergeev Sergeevich",135000,4);
        EMPLOYEES[9] = new Employee("Ilya Ilyin ilyich",120000,5);
        printNameOfEmployees();

    }


}