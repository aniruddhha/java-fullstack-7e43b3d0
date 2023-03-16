package com.ani.generics;

import java.sql.Date;

public class Box {
    
    private Object anything;

    public Object getAnything() {
        return anything;
    }

    public void setAnything(Object anything) {

        if(anything instanceof String) {
            String str = (String)anything;
        }
        if(anything instanceof Date) {
            Date dt = (Date)anything;
        }
        if(anything instanceof StringBuffer) {
            StringBuffer sb = (StringBuffer) anything;
        }

        this.anything = anything;
    }
}
