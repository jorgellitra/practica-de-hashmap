package practica1;

import java.util.HashMap;

public class Practica1 {

    public static void main(String[] args) {
        int[] vector = {1,1,1,4,4,2,2,2,100};
        histogram mihisto = new histogram(vector);
        HashMap <Integer,Integer> histogram = mihisto.gethisto();
        System.out.println(histogram);
    }
}
