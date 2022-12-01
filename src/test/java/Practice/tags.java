package Practice;

public class tags {
    public static void main(String[] args) {
        String str=HTMLElements("<div><b><p>hello</p></b></div>");
        System.out.println( HTMLElements(str));

        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
    public static String HTMLElements(String str) {

            String returnTag="";

            boolean isTag = true;


            int cont = 0;


               if(str.isBlank() && str.length()%2!=0) {
                   isTag = false;
               } else {
                   for (int j=0; j<str.length(); j++) {
                       if(str.length()%2==0) {
                           if(str.startsWith("<") || str.endsWith(">")) {
                               isTag = true;
                           }
                       }
                   }

               }
               for(int i=0; i<str.length(); i++) {
                   char tag = str.charAt(i);
                   if (isTag == false) {
                       returnTag += tag;
                   } else if (isTag == true) {

                   }
               }

           // System.out.println(isTag);
       return returnTag;
    }
}
