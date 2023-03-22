package org.example;

@java.lang.FunctionalInterface
public interface FunctionalInterfaceClass {
    //functional interface must have one abstract method and it must be implemented those class extends functionalInterface
    //functional interface can have multiple static and default methods. and those methods are optional for implementations
    //by it's subclass

//    No, the @FunctionalInterface annotation is not required to create a functional interface in
//            Java, but it is recommended to use it for clarity and to prevent accidental addition of extra abstract methods.
    public int sum(int a,int b);

    default int substraction(int a,int b){
        return a-b;
    }

    default int multiplication(int a,int b){
        return a*b;
    }

    //static class are also known as utility class.
    static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
