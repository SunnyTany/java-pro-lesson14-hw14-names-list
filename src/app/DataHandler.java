package app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    // The method forms the display of the name behind the song index
    public String formOutput(List<String> list, int index) {
        try {
            // call the get() method
            String name = list.get(index);
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    // The method generates a numbered list of names
    // generic-typing List<String>
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);

        // the variable type name is declared and the target list is specified
        for (String name : list) {
            sb.append(String.format("%d) %s%n",
                    count.getAndIncrement(), name));
        }
        return "Names:\n" + sb.toString().trim();
    }
}