package Practice;

import java.util.ArrayList;
import java.util.List;

public class prefixDone {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("steve");
        arr.add("stevens");
        arr.add("danny");
        arr.add("steves");
        arr.add("dan");
        arr.add("john");
        arr.add("johny");
        arr.add("joe");
        arr.add("alex");
        arr.add("alexander");

        List<String> test = new ArrayList<>();
        test.add("steve");
        test.add("alex");
        test.add("joe");
        test.add("dan");
        test.add("john");
        System.out.println(countOnlyPrefixes(arr, test));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {

          List<Integer> allCount = new ArrayList<>();
        int count=-1;
        for(int i=0; i< query.size(); i++) {
            for(int j=0; j< names.size(); j++) {

             if(names.get(j).startsWith(query.get(i))) {
                 count++;
             }

            }
            allCount.add(count);
            count=-1;
        }


        return allCount;
    }
}







/*        List<Integer> count = new ArrayList<>();
        int c=0;

        for (int i= names.size(); i >= 0; i--) {

        if(names.size()== query.size()) {
            if(names.equals(query.get(i+1))) {
                c++;
            } }
            System.out.println(c);
          *//*  if (query.contains(names.get(i))) {
                System.out.println("The prefix is "+names.get(i));
                String prefix = names.get(i);*//*


           // }
            count.add(c);
        }



        return count;

    }

}*/
/*
  while(names.get(i) == query.get(i+1)) {
                count.add(i);

            }
 */

/* int cout1 = 0;
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < query.size(); j++) {
                if (query.get(j).length() == names.get(i).length()) {
                    break;
                }
                    else if ( query.get(j).length() < names.get(i).length()  &&
                            names.get(i).contains(query.get(j))) {
                        cout1++;
                    }
            }

            count.add(cout1);
        }*/