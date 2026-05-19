package app;

import java.util.List;

public class DataHandler {

    public String formOutput(List<String> list, int index) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        if (index < 0 || index >= list.size()) {
            throw new IllegalArgumentException("Index %d is out of bounds for list size %d".formatted(index, list.size()));
        }

        String name = list.get(index);
        return "Name: %s is in index %d".formatted(name, index);
    }

    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (String name : list) {
            sb.append("%d) %s%n".formatted(count, name));
            count++;
        }
        return "Names:\n" + sb.toString().trim();
    }
}