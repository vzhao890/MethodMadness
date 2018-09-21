package vzhao;

public class    vzhaoLib
{
    public static String date(String date)
    {
        String d = date.substring(3,5);
        String m = date.substring(0,2);
        String y = date.substring(6,date.length());
        return d+  "-"  +m+  "-"  +y;
    }
    public static String cutOut(String mainStr, String subStr)
    {
        int index =mainStr.indexOf(subStr);
        String a = mainStr.substring(index+3,mainStr.length());
        return a;
    }
    public static void multiplyTable(int base,int range)
    {
        for(int x=0;range>=x;x++)
        {
            int y= x*base;
            System.out.println(y);
        }
    }
     

}
