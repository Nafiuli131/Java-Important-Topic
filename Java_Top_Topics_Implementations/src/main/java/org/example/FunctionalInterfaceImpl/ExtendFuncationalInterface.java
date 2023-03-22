package org.example.FunctionalInterfaceImpl;

import org.example.FunctionalInterfaceClass;

//@FunctionalInterface
//if we use this functionalInterface annotation, then this functional interface have two abstract method
//but the answer is yes. we can extend another funcational Interface from one interface class

public interface ExtendFuncationalInterface extends FunctionalInterfaceClass {

    void printSomething();
}
