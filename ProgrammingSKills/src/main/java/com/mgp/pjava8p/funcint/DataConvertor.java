package com.mgp.pjava8p.funcint;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface DataConvertor {
    // any number of default method.
    public default String mapper(Object content) {
        if(content != null) {
            return content.toString();

        }
        else {
            return "";
        }
    }
    // any number of default method.
    public default char[] mapToCharArray (String c){
        char[] chars = c.toCharArray();
        return chars;
    }

    public Object whatToWhat(Object obj) ;



}


class DataMapper implements DataConvertor{

    protected static Map<String, Object > objMap = new HashMap<>();

    @Override
    public Object whatToWhat(Object obj) {
        Object a = objMap.get(mapper("A"));
        Object b = objMap.get(mapper(obj));
        String s = mapper(a);
        String sb = mapper(b);
        System.out.println(mapToCharArray(s));
        System.out.println(mapToCharArray(sb));

        return Optional.of(s);

    }


    public void dataLoader () {
        objMap.put("A", Optional.of("A"));

        objMap.put("B", Optional.of("B"));

    }


}



