package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeHighestSalary {


    Employee employee = new Employee("nafiul",1,25000,"cse");
    Employee employee2 = new Employee("nayeem",2,50000,"bba");
    Employee employee3 = new Employee("nafi",3,47000,"cse");
    Employee employee4 = new Employee("islam",4,59000,"bba");
    List<Employee> employeeList = Arrays.asList(employee,employee2,employee3,employee4);

    public void findHighestSalary(){
        Map<String, Optional<Employee>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment
                        ,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(employeeMap.entrySet());
    }
}
