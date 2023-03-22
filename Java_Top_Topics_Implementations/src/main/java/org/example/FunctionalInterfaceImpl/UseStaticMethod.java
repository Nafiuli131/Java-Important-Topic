package org.example.FunctionalInterfaceImpl;

import org.example.FunctionalInterfaceClass;

public class UseStaticMethod {

    public void CreateUpperCase(String str){
        String output = FunctionalInterfaceClass.toUpperCase(str);
        System.out.println(output);
    }
}
