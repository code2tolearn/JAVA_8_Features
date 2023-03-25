package streams.collectors.minmaxavg;

import streams.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMinMaxAvg {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ram", 25, 20000));
        employeeList.add(new Employee("Ashok", 25, 300000));
        employeeList.add(new Employee("Shailesh", 25, 40000));
        employeeList.add(new Employee("Shubham", 25, 50000));
 // average salary
      Double avgSalary = employeeList.stream().collect(Collectors.averagingInt(E->E.getSalary())) ;
        System.out.println("Avg salary :: "+ avgSalary) ;

        System.out.println("******************************************************");
  // Min salary
        Optional<Employee> minSalary = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))) ;

        if(minSalary.isPresent()){
            System.out.println("Min salary is :: " + minSalary);
        }
        System.out.println("******************************************************");
    // Max salary
    Optional<Employee> maxSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))) ;
        if(maxSalary.isPresent())
        {
            System.out.println("Max salary ::" +maxSalary);
        }
    }


}
