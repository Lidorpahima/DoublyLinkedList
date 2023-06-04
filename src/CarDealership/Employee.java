package CarDealership;

import java.util.InputMismatchException;

public class Employee implements Comparable<Employee> {
    String name;
    int id;
    int sales;

    public Employee(String name, int id, int sales) {
        try {
            if (!(name.matches(".*\\d.*"))) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name cannot contains numbers!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (id < 1000000000 || id > 99999999) {
                this.id = id;
            } else {
                throw new InputMismatchException("id number must contain 9 numbers!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (sales >= 0) {
                this.sales = sales;
            } else {
                throw new InputMismatchException("Sales cant be negative!");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setSales(Car car) {
        Car newsell = new Car();
        newsell.SoldCars(car);
        this.sales++;
    }

    public int sumSalary() {
        int base = 6000;
        int saleBase = 100;
        return (base + saleBase * this.sales);
    }

    @Override
    public String toString() {
        return "Name:" + name + " ID:" + id + " Sales:" + sales + " Salary:" + sumSalary();
    }

    public int compareTo(Employee other) {
        if (this.sales == other.sales) {
            return 0;
        } else if (this.sales > other.sales) {
            return 1;
        } else if (this.sales < other.sales) {
            return -1;
        }
        return 0;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public static boolean isDataValidE(Employee employee){
       Employee temp = new Employee();
       temp = employee;
       return (employee.id < 1000000000 && employee.id > 99999999 && employee.sales >= 0  && employee.name != null && (!employee.name.matches(".*\\d.*")));
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }
}
