package com.webkonsept.minecraft.boilerplate;

import java.util.ArrayList;
import java.util.Iterator;

public class JoinableArrayList extends ArrayList {

    public String join (String delimiter){
        StringBuilder sb = new StringBuilder();
        Iterator it = this.iterator();

        while (it.hasNext()){
            String next = it.next().toString();
            sb.append(next);
            if (it.hasNext()){
                sb.append(delimiter);
            }
        }

        return sb.toString();
    }
}
