package Practice;

import java.util.ArrayList;
import java.util.List;

public class Duplicate2 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        List<String> words1 = new ArrayList<>();
        words.add("Tv");
        words.add("Samsung");
        words.add("Tv");
        words.add("Samsung");
        words.add("phone");
        words.add("Laptop");
        words1= countDeviceNames(words);
        System.out.println(words1);
    }


    public static List<String> countDeviceNames(List<String> deviceNames) {

        String[] uniqueNames = new String[deviceNames.size()];
        for (int i = 0; i < deviceNames.size(); i++) {
            String name = deviceNames.get(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (uniqueNames[j].equals(name)) {
                    duplicate = true;
                    break;
                }}
            if (!duplicate) {
                uniqueNames[i] = name;
            } else {
                int id = 1;
                boolean exists = true;
                while (exists) {
                    exists = false;
                    for (int j = 0; j < i; j++) {
                        if (uniqueNames[j].equals(name + id)) {
                            exists = true;
                            id++;

                            break;
                        }
                    }

                }

            }

        }

        return List.of(uniqueNames);
    }
}
