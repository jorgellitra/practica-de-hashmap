package practica1;

public class calculaHistogram {
    
    public static <T> histogram <T> calcHisto(T[] vector){
        
        histogram<T> histo = new histogram();
        
        for (T key : vector) {
            histo.increment(key);
        }
        return histo;
    }
}
