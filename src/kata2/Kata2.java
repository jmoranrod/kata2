package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            histogram.put(numbers[i], getFrecuency(histogram, numbers[i]) + 1);
        }
        System.out.println(histogram.entrySet());
        int mostRepeatedValue = 0, key = 0;
        for (int iKey : histogram.keySet()) {
            if (histogram.get(iKey) > mostRepeatedValue) {
                mostRepeatedValue = histogram.get(iKey);
                key = iKey;
            }
        }
        System.out.println("Most repeated key "+"["+key+"]"+ 
                " repeated "+mostRepeatedValue+" times.");
    }        

    private static int getFrecuency(HashMap<Integer, Integer> histogram, int i) {
        return histogram.containsKey(i) ? histogram.get(i) : 0;
    }
}