package com.ani.anno;

import java.lang.reflect.Field;

public class CheckerImpl {
    
    public static String checkFiled(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for ( Field fld : fields ) {
            System.out.println(fld.getName());
            String nm = fld.getName();
            char firstLetter = nm.charAt(0);
            if(Character.isUpperCase(firstLetter)) {
                Checker chk = fld.getAnnotation(Checker.class);
                return "❌ "+ nm +" : " +chk.message();
            }
        }
        return "✅ Fields are correctly defined";
    }
}
