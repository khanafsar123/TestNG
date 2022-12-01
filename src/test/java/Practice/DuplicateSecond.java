package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DuplicateSecond {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");
        System.out.println(countDeviceNames(newList));

    }
    public static List<String> countDeviceNames(List<String> deviceNames) {
        List<String> newList = new ArrayList<>();
        int count = 0;

        Iterator<String> iterator = deviceNames.iterator();

        while (iterator.hasNext()) {
            String list = iterator.next();
            newList.add(list);
        }
//if(arr[i]==arr[j]) then. count++
        for(int i=0; i< newList.size(); i++) {
            for(int j=0; j<newList.size(); j++) {
                String nw = newList.get(0);
                if (newList.get(i) != nw){
                    count++;

                } else if(newList.get(i) == newList.get(j+1)) {
                    return newList;
                }


            }
            StringBuffer str=new StringBuffer(newList.get(i));
            str.append(count);
            System.out.print(str +" ");

        }
/*
if (newList.get(i+1) != deviceNames.get(j) || newList.get(i) == deviceNames.get(j)) {
                count++;

            }
 */


return newList;
    }
}
