package pkg5;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String[] pairsocks = {"5","13","7","5","9","20","9","5","14"};
        
        Arrays.sort(pairsocks);
        System.out.println("Pasangan Kaos Kaki: " + Arrays.toString(pairsocks));
        
        Arrays.sort(pairsocks,Collections.reverseOrder());
        
        System.out.println("Pasangan Kaos Kaki: " + Arrays.toString(pairsocks));
    }
    
}
