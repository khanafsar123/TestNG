package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCountWithSet {
    public static void main(String[] args) {


        int a_pointer = 0;
        int b_pointer = 0;
        int count = 0;

        List<String> newList = new ArrayList<>();
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");

        boolean duplicate = false;
        Set<String> set = new HashSet<>(newList);

        for(int i=0; i<set.size(); i++) {
            System.out.println(set);
        }

        while (a_pointer < newList.size()) {
            if (set.contains(newList.get(a_pointer))) {
                set.add(newList.get(a_pointer));
                a_pointer++;
            }
            System.out.println(a_pointer);
        }


        while (b_pointer < newList.size()) {


            if (set.contains(newList.get(b_pointer))) {
                set.add(newList.get(b_pointer));
                duplicate = true;
                b_pointer++;
                System.out.println(duplicate);
            } else if (!duplicate) {
                for (int i = 0; i < newList.size(); i++) {
                    String name = newList.get(i);

                    if (newList.get(i).equals(name + count)) {
                        //    exists = true;
                        count++;
                    }

                }
                System.out.println(count);
            }
        }

    }}
