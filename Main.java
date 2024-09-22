import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Collection> collectionList = new ArrayList<>();
        collectionList.add(new HashSet());
        collectionList.add(new TreeSet());
        collectionList.add(new LinkedHashSet());
        collectionList.add(new ArrayList());
        collectionList.add(new LinkedList());
        collectionList.add(new ArrayDeque());
        collectionList.add(new PriorityQueue());

        ArrayList<Map> mapList = new ArrayList<>();
        mapList.add(new HashMap());
        mapList.add(new TreeMap());
        mapList.add(new LinkedHashMap());

        CollectionTest collectionTester;
        MapTest mapTester;

        System.out.printf("\n   %-22s%-18s%-18s%-18s%-18s\n",
                "Collection",
                "Add",
                "Remove",
                "Contain",
                "Clear");

        for( int i = 0; i < (int) collectionList.size(); i++){
            collectionTester = new CollectionTest(collectionList.get(i));
            System.out.printf("%2d%-1s%-22s%-18d%-18d%-18d%-18d\n",
                    i+1,
                    '.',
                    collectionTester.getObjectType(),
                    collectionTester.addingAverage(100),
                    collectionTester.removingAverage(100),
                    collectionTester.containAverage(100),
                    collectionTester.clearAverage(100));
        }

        for(int j = 0; j<(int)mapList.size(); j++){
            mapTester = new MapTest(mapList.get(j));
            System.out.printf("%2d%-1s%-22s%-18d%-18d%-18d%-18d\n",
                    j+8,
                    '.',
                    mapTester.getObjectType(),
                    mapTester.addingAverage(100),
                    mapTester.removingAverage(100),
                    mapTester.containAverage(100),
                    mapTester.clearAverage(100));
        }
    }
}
