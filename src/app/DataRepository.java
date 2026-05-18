package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // The method return the list of names
    public List<String> getData() {
        List<String> list = new ArrayList<>();

        // add elements to list of names
        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");

        return list;
    }
}