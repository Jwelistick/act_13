package act;

import java.util.*;

public class lambdasort {
    public static void main(String[] args) {
        List<String> sorteo = new ArrayList<String>();
        int a;
        Object o1,o2;

            //añadido de valores
            for (int i = 1; i < 11; i++) {
                a=(int)(Math.random()/Math.random()/Math.random()/Math.random()/Math.random()/Math.random());
                sorteo.add(new String(String.valueOf(a+i)));

            }
            //Print normal
            System.out.println(sorteo);

            //Lambda sort
            Collections.sort(sorteo);
            System.out.println(sorteo);

            //Lambda sort reverse
            Collections.reverse(sorteo);
            System.out.println(sorteo);

    }

    //Sort con clase
    public int compare(Object o1, Object o2)
    {
        if(o1 instanceof String && o2 instanceof String)
        {
            String s_1 = (String)o1;
            String s_2 = (String)o2;

            return s_1.compareTo(s_2);
        }
        return 0;
    }
}
