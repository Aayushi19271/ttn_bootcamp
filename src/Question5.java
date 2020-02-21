package aayushi;
//Write a program to sort Employee objects based
// on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.*;

class Employee
{
    private double age;
    private double salary;
    private String name;

    public Employee(double age,double salary,String name)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

class SalarySorter implements Comparator<Employee>
{
    @Override
    public int compare(Employee t1, Employee t2) {
        return (int) (t1.getSalary() - t2.getSalary());
    }
}

public class Question5 {
    public static void main(String[] args) {
        Employee e1 = new Employee(45, 85600, "Aayushi");
        Employee e2 = new Employee(22, 32000, "Komal");
        Employee e3 = new Employee(43, 57000, "Aakash");
        Employee e4 = new Employee(20, 98200, "Aastha");
        Employee e5 = new Employee(23, 29200, "Shobhit");


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e5);
        employees.add(e2);
        employees.add(e1);
        employees.add(e3);
        employees.add(e4);

        ListIterator<Employee> itr = employees.listIterator();
        System.out.println("-------BEFORE SORTING-------");

        while (itr.hasNext())
        {
            System.out.println("Value is : " + itr.next());
        }

        System.out.println();
        Collections.sort(employees,Collections.reverseOrder(new SalarySorter()));
        ListIterator<Employee> iterator = employees.listIterator();

        System.out.println("-------AFTER SORTING--------");
        while (iterator.hasNext())
        {
            System.out.println("Value is : " + iterator.next());
        }
    }
}
