package Q5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
    // values = [1,4,5,10]
    // output = [5, -1, 12, 17]
    private static int[] getStartOfEachValues(int[] arr, int[] values){
        int[] indexes = new int[values.length];
        HashMap<Integer, Integer> sortedIndex = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(!sortedIndex.containsKey(arr[i])){
                sortedIndex.put(arr[i], i);
            }
        }
        for(int i = 0; i < values.length; i++){
            if(!sortedIndex.containsKey(values[i])){
                indexes[i] = sortedIndex.get(values[i]);
            } else{
                indexes[i] = -1;
            }
        }
        return indexes;
    }
}
//Time: O(N), OC: O(N)
