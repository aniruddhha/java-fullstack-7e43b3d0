package com.ani.anno;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetSetProcessor {
    
    public static void generateAccessors(Object obj) {

        Class<?> clazz = obj.getClass();

        for(Field field : clazz.getDeclaredFields()) {

            String name = field.getName();
            String camelCaseFieldName = Character.toUpperCase(name.charAt(0)) + name.substring(1);
            //Ac
            // c
            System.out.println(camelCaseFieldName);

            String getterName = "get" + camelCaseFieldName;
            // getAc
            // getBalance
            String setterName = "set" + camelCaseFieldName;
            // setAc
            // setBalance

            System.out.println(getterName);
            System.out.println(setterName);

            // we need to update bytecode, 
            // which is beyond the scope for now.
        }
    }

}
