package de.thk.se.prakt.module.anwendung;

import de.thk.se.prakt.module.selectinterface.SelectArray;

import java.util.Iterator;
import java.util.ServiceLoader;

public class AnwendungsKlasse {





    public static void main ( String [] args ) {

        SelectArray impgrade = null;
        SelectArray impungrade = null;
        int[] original = {15, 2, 1, 0, 1123, 345, 66, 7, 88};


      //  ServiceLoader<SelectArray> sl = ServiceLoader.load(SelectArray.class);
      //  Iterator<SelectArray> it = sl.iterator();

        Iterator<SelectArray> it = ServiceLoader.load(SelectArray.class).iterator();

        while (it.hasNext()) {
            SelectArray imp = it.next();


            if ("gerade".equals(imp.getImplProperty())) {

                String b = arrayzustring(imp.select(original));
                System.out.println("Selektion gerader Werte: " + b);

            } else if ("ungerader".equals(imp.getImplProperty())) {

                String a = arrayzustring(imp.select(original));
                System.out.println("Selektion ungerader Werte: " + a);

            }
        }

        if (!(it.hasNext())) {
            System.out.println("Implementierungen für Werte nicht gefunden");
        }


    }

    private static String arrayzustring(int[] input) {

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            s.append(input[i]);

            if (i < input.length - 1) {
                s.append(", ");
            }

        }

        return s.toString();
    }


}
