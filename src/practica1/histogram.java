package practica1;

import java.util.HashMap;

public class histogram <T> {
    
    private final T[] elVector;

    public HashMap<T, Integer> gethisto(){
        HashMap<T, Integer> histogram = new HashMap();
        for (int i = 0; i < elVector.length; i++) {
            if(!histogram.containsKey(elVector[i])){
                histogram.put(elVector[i], 0);
            }
            histogram.put(elVector[i], histogram.get(elVector[i])+1);
        }
        return histogram;
    }

    public histogram(T[] elVector) {
        this.elVector = elVector;
    }
    
}
