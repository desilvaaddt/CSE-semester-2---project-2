import java.util.*;

public class MapTest {
    Random random = new Random();

    private int ELEMENT_COUNT = 100_000;

    private Map<Integer, Integer> obj;

    public MapTest(Map<Integer, Integer> obj){
        this.obj = obj;
        AddIntegers(ELEMENT_COUNT);
    }

    public String getObjectType(){
        String objType = String.valueOf(obj.getClass()).substring(16);
        return objType;
    }

    private void AddIntegers(int element_count){
        int random_value;
        for(int i = 0; i < element_count; i++){
            random_value = random.nextInt(100_000);
            obj.put(i, random_value);
        }
    }

    public long clearAverage(int n){
        long sum = 0;
        for (int i = 0; i < n ; i++){
            sum += clearTime();
        }

        return sum/n;
    }
    private long clearTime(){
        long startTime = System.nanoTime();
        obj.clear();
        long endTime = System.nanoTime();

        AddIntegers(ELEMENT_COUNT);

        return endTime - startTime;

    }

    public long containAverage(int n){
        long sum = 0;
        for (int i = 0; i < n ; i++){
            sum += containTime();
        }

        return sum/n;
    }

    private long containTime(){
        int value = random.nextInt(100000);

        long startTime = System.nanoTime();
        obj.containsValue(Integer.valueOf(value));
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long removingAverage(int n){
        long sum = 0;
        for (int i = 0; i < n ; i++){
            sum += removeTime();
        }

        return sum/n;
    }

    private long removeTime(){
        int value = random.nextInt(100000);

        long startTime = System.nanoTime();
        obj.remove(Integer.valueOf(value));
        long endTime = System.nanoTime();

        obj.put(value, value);

        return endTime - startTime;
    }

    public long addingAverage(int n){
        long sum = 0;
        for (int i = 0; i < n ; i++){
            sum += addTime();
        }

        return sum/n;
    }

    private long addTime(){
        int value = random.nextInt(100000);

        long startTime = System.nanoTime();
        obj.put(100_001, value);
        long endTime = System.nanoTime();

        obj.remove(Integer.valueOf(value));

        return endTime - startTime;
    }
}
