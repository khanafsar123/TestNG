package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class duplicateNew {
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
        List<String> newList=new ArrayList<>();
        int count=0;
        boolean isEqual = true;

        Iterator<String> iterator= deviceNames.iterator();
        while (iterator.hasNext()) {
            String list= iterator.next();
            newList.add(list);
        }


        StringBuilder str = null;
        for(int i=0; i<newList.size(); i++) {


                if(!deviceNames.get(i).equals(deviceNames.get(i)+1)){
                    count++;
                    isEqual = true;
            }
           str=new StringBuilder(deviceNames.get(i));
                str.append(count);
            System.out.print(str +" ");
         //   newList.add(String.valueOf(str));
        }



        return newList;
    }
}
