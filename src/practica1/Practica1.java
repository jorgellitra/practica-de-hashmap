package practica1;

import java.util.HashMap;

public class Practica1 {

    public static void main(String[] args) {
        Integer[] vector = {1,1,1,4,4,2,2,2,100};
        String[] vector1 = {"Ana", "Juan", "Pedro", "Ana","Ana", "Juan", "Pedro", "Ana"};
        histogram <String> histogram = calculaHistogram.calcHisto(vector1);
        for (Object key : histogram.keySet()) {
            System.out.println(key +"-->"+ histogram.get(key));
        }
    }
}
