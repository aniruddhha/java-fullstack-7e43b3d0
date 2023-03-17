package com.ani.anno;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetSetProcessor {
    
    public static void generateAccessors(Object obj) {

        Class<?> clazz = obj.getClass();

        for(Field field : clazz.getDeclaredFields()) {

            String name = field.getName();
            String camelCaseFieldName = Character.toUpperCase(name.charAt(0)) + name.substring(1);

            System.out.println(camelCaseFieldName);

            String getterName = "get" + camelCaseFieldName;
            String setterName = "set" + camelCaseFieldName;

            System.out.println(getterName);
            System.out.println(setterName);

            try {
                clazz.getMethod(getterName).invoke(obj);

                clazz.getMethod(setterName).invoke(obj);

                // we need to update bytecode, 
                // which is beyond the scope for now.

            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }

        }
    }
}
