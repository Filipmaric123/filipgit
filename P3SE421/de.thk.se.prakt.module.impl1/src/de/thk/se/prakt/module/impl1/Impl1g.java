package de.thk.se.prakt.module.impl1;

import de.thk.se.prakt.module.selectinterface.SelectArray;

public class Impl1g implements SelectArray {



    @Override
    public  int[] select(int[] original){

        int count =0;
        int countad =0;

        for (int value : original) {
            if((value % 2)==0){
                count++;

            }

        }
        int[] a = new int [count];


        for (int value : original) {

            if((value % 2)==0){

              a[countad] = value;
              countad++;
            }
        }

        return a;
    }



    @Override
public String getImplProperty(){
        return "gerade";
}

}
