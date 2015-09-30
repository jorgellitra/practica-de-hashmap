package practica1;

import java.util.HashMap;

public class histogram {
    
    private final int[] elVector;

    public HashMap<Integer, Integer> gethisto(){
        HashMap<Integer, Integer> histogram = new HashMap();
        for (int i = 0; i < elVector.length; i++) {
            if(!histogram.containsKey(elVector[i])){
                histogram.put(elVector[i], 0);
            }
            histogram.put(elVector[i], histogram.get(elVector[i])+1);
        }
        return histogram;
    }

    public int[] getElVector() {
        return elVector;
    }

    public histogram(int[] elVector) {
        this.elVector = elVector;
    }
}
