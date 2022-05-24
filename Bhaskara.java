package app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bhaskara {
    public static void main(String[] args) {
        int a = 1;
        int b = -7;
        int c = 12;
        
        List<Integer> lenis = calcular(a, b, c);
        
        System.out.println(lenis.get(0));
        System.out.println(lenis.get(1));
    }
    
    public static List<Integer> calcular(int a, int b, int c) throws Exception {
        DecimalFormat formatter = new DecimalFormat();
        
        double bottom = 2 * a;
        long delta = (b*b) - (4 * a * c);
        
        if (delta < 0) throw new Exception("Delta is negative");

        double root = Math.sqrt(delta);
        double end1 = (-b + root) / bottom;
        double end2 = (-b - root) / bottom;
    
        return new ArrayList(Arrays.asList(
            formatter.format(end1),
            formatter.format(end2)
        ));
    }
}
