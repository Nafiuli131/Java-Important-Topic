package org.example;

import org.example.FunctionalInterfaceImpl.OnlyUseAbstractMethod;
import org.example.FunctionalInterfaceImpl.UseDefaultAndAbstractMethod;
import org.example.FunctionalInterfaceImpl.UseStaticMethod;
import org.example.LamdaExpression.Calculator;
import org.example.LamdaExpression.PrintOutput;
import org.example.Stream.EmployeeHighestSalary;
import org.example.Stream.GroupingBy;
import org.example.Stream.StreamExample;

public class Main {
    public static void main(String[] args) {
        //functionalInterface
        System.out.println("Output of the functional interface topic");
        OnlyUseAbstractMethod onlyUseDefaultMethod = new OnlyUseAbstractMethod();
        int sum = onlyUseDefaultMethod.sum(10,20);
        System.out.println(sum);
        UseDefaultAndAbstractMethod useDefaultAndAbstractMethod = new UseDefaultAndAbstractMethod();
        int subs = useDefaultAndAbstractMethod.substraction(10,2);
        System.out.println(subs);
        UseStaticMethod useStaticMethod = new UseStaticMethod();
        useStaticMethod.CreateUpperCase("hello nayeem");
        //lamda expression
        System.out.println("Lamda expression");
        Calculator addition = (a,b)->{
           return a+b;
        };
        System.out.println(addition.calculate(2,3));
        PrintOutput printOutput = ()-> System.out.println("hello nayeem");
        printOutput.print();
        //stream api
        System.out.println("Stream API");
        StreamExample streamExample = new StreamExample();
        streamExample.printNumbers();
        GroupingBy groupingBy = new GroupingBy();
        groupingBy.count();
        EmployeeHighestSalary employeeHighestSalary = new EmployeeHighestSalary();
        employeeHighestSalary.findHighestSalary();
    }
}