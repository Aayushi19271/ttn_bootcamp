package aayushi;
import java.util.LinkedHashMap;
import java.util.Map;

public class Question7 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < arr.length; i++)
        {
            if (countMap.containsKey(arr[i]))
            {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            }
            else
            {
                countMap.put(arr[i], 1);
            }
        }
        System.out.println(countMap);

        countMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed())
                .forEach(e -> {
                    int key = e.getKey();
                    int val = e.getValue();
                    for (int i = 0; i < val; i++) {
                        result.append(key + " ");
                    }
                });

        System.out.println("The Array sorted by frequency: "+result);
    }
}
