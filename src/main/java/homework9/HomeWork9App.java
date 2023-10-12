package homework9;

import java.util.ArrayList;
import java.util.List;

public class HomeWork9App {
    public static void main(String[] args) {
        List<Integer> workList = getMinMaxList(1, 10);
        System.out.println("getMinMaxList (1 - 10): " + workList);
        System.out.println("------------");
        System.out.println("getSumByList (> 5): " + getSumByList(workList));
        System.out.println("------------");
        fillListByNumber(workList, 10);
        System.out.println("fillListByNumber (10): " + workList);
        System.out.println("------------");
        increaseListByNumber(workList, 3);
        System.out.println("increaseListByNumber (3): " + workList);
        System.out.println("------------");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 28));
        employeeList.add(new Employee("Steven", 45));
        employeeList.add(new Employee("Marta", 56));
        employeeList.add(new Employee("Felix", 32));
        System.out.println("getEmployeeName:");
        getEmployeeName(employeeList);
        System.out.println("------------");
        System.out.println("getEmployeeListByMinAge:");
        employeeList = getEmployeeListByMinAge(employeeList, 30);
        System.out.println(employeeList);
        System.out.println("------------");
        System.out.println("checkMinAverageAge:");
        checkMinAverageAge(employeeList, 40);
        System.out.println("------------");
        System.out.println("getYoungestEmployee:");
        Employee employee = getYoungestEmployee(employeeList);
        System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge());
        System.out.println("------------");
    }

    public static List<Integer> getMinMaxList(int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int getSumByList(List<Integer> array) {
        int result = 0;
        for (Integer el : array) {
            if (el > 5) {
                result += el;
            }
        }
        return result;
    }

    public static void fillListByNumber(List<Integer> array, int value) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, value);
        }
    }

    public static void increaseListByNumber(List<Integer> array, int value) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) + value);
        }
    }

    public static void getEmployeeName(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }

    public static List<Employee> getEmployeeListByMinAge(List<Employee> employeeList, int age) {
        List<Employee> newEmployeeList = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getAge() >= age) {
                newEmployeeList.add(employee);
            }
        }
        return newEmployeeList;
    }

    public static void checkMinAverageAge(List<Employee> employeeList, int minAverageAge) {
        int averageAge = 0;
        for (Employee emp : employeeList) {
            averageAge += emp.getAge();
        }
        averageAge = averageAge / employeeList.size();
        if (averageAge > minAverageAge) {
            System.out.println("Средний возвраст (" + averageAge + ") превышает минимальный средний возраст (" + minAverageAge + ")");
        } else {
            System.out.println("Средний возвраст (" + averageAge + ") не превышает минимальный средний возраст (" + minAverageAge + ")");
        }
    }

    public static Employee getYoungestEmployee(List<Employee> employeeList) {
        int index = 0;
        for (Employee emp : employeeList) {
            if (emp.getAge() < employeeList.get(index).getAge()) {
                index = employeeList.indexOf(emp);
            }
        }
        return employeeList.get(index);
    }
}
