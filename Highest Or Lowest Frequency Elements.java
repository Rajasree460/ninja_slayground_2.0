import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        HashMap <Integer,Integer> freqMap=new HashMap<>();

        for(int num: v){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        // Variables to track highest and lowest frequency elements
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxElem = Integer.MAX_VALUE, minElem = Integer.MAX_VALUE;
        
        // Iterate through the frequency map to find desired elements
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int elem = entry.getKey();
            int freq = entry.getValue();
            
            // Check for highest frequency
            if (freq > maxFreq || (freq == maxFreq && elem < maxElem)) {
                maxFreq = freq;
                maxElem = elem;
            }
            
            // Check for lowest frequency
            if (freq < minFreq || (freq == minFreq && elem < minElem)) {
                minFreq = freq;
                minElem = elem;
            }
        }
        
        // Return the result as an array
        return new int[] {maxElem, minElem};

    }
}
