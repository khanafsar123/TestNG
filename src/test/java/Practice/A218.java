package Practice;

import java.util.*;

public class A218 {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("switch");
        newList.add("switch");

        newList.add("TV");
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");

        //  System.out.println(countDeviceNames(newList));


        System.out.println(countDeviceNames(newList));



    }
    public static List<String> countDeviceNames(List<String> deviceNames) {
        int count=0;


        ArrayList<String> strings=new ArrayList<>();


//        set.add(String.valueOf(strings));
//
//        strings.clear();
//        strings.add(String.valueOf(set));

        String str1="";

        for (int i = 0; i < deviceNames.size(); i++) {
              strings.add(deviceNames.get(i));




            for(int j=1; j< strings.size(); j++) {

                if (strings.get(j) != deviceNames.get(i)) {
                    count++;

                }
                StringBuilder str=new StringBuilder(deviceNames.get(i));

                str.append(count);
                strings.add(String.valueOf(str));
                break;

            }


            HashSet<String> set=new LinkedHashSet<>();
            set.addAll(strings);
            System.out.println(set);

        }
        return strings;
    }}

