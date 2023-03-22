package org.example.FunctionalInterfaceImpl;

import org.example.FunctionalInterfaceClass;

public class OnlyUseAbstractMethod implements FunctionalInterfaceClass {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
