package Practice;

import java.util.*;

public class DuplicateCountRepl {

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



                ArrayList<String> strings=new ArrayList<>();

        int count=0;
        String temporary="";
        for (int i = 0; i < deviceNames.size(); i++) {
            // iterate through the List
            // get Strings values
            temporary= deviceNames.get(i);

            count =0;

            // now compare the list with new list if element is there
            for(int j=0; j< strings.size(); j++) {
                // if new array is empty then add first element
                if(strings==null) {
                    strings.add(temporary);
                }
                String newText=temporary+count;
                // now check if element found in newList
                if(temporary.equals(strings)) {
                    count++;

                    for(int k=0; k< strings.size(); k++) {
                        if(strings.get(k)==null){

                            strings.add(newText);
                        }
                    }
                }
                else if (strings.equals(newText));
                {
                    count++;
                }

            }
            }

        return strings;
    }


        }

        /*for (int i = 0; i < newList.size()-1; i++) {

            if(i==0) {
                first+=newList.get(0);
            }
            // a               !      b


            if(newList.get(i+1) == newList.get(i)){
             count++;

            }

            duplicate = duplicate+count +" ";
        }


        System.out.println(duplicate+count);

*/


