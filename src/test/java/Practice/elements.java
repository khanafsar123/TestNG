package Practice;

public class elements {
    public static void main(String[] args) {
//        String str=HTMLElements("<div><b><p>hello</p></b></div>");
//        System.out.println( HTMLElements(str));

        System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        System.out.println(HTMLElements("<div><div><b></b></div></p>"));
        System.out.println(HTMLElements("<div>abc</div><p><em><i>test test test</b></em></p>"));
    }
    public static String HTMLElements(String str) {

        String returnTag="";
        boolean isTag = false;
        char[] tag=str.toCharArray();
        for( int i=0; i<str.length(); i++) {

            if(tag[i]==str.charAt(i)) {
                isTag = true;
            }
        }

        if(!isTag) {
            returnTag+=tag;
        }



        return returnTag;
    }
}
