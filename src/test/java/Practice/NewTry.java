package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewTry {
    public static void main(String[] args) {
        List<String> newList=new ArrayList<>();
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("switch");
        newList.add("TV");
        newList.add("switch");
        newList.add("TV");

        //  System.out.println(countDeviceNames(newList));


        System.out.println(countDeviceNames(newList));



    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
      int count=1;


        ArrayList<String> strings=new ArrayList<>();
        String str1="";
        boolean duplicate = false;

        for (int i = 0; i < deviceNames.size(); i++) {
            for (int j = 1; j < deviceNames.size(); j++) {

                if (deviceNames.get(i) == deviceNames.get(j)) {
                    duplicate = true;
                    count++;
                }


                    StringBuilder str = new StringBuilder(deviceNames.get(i));
                    for (int a = 0; a < str.length(); a++) {
                            str.append(count);
                        strings.add(String.valueOf(str));
                          break;
                    }
                    break;

               /* str.append(count);
                    strings.add(String.valueOf(str));
                    break;*/

            }


        }

            return strings;
    }}
