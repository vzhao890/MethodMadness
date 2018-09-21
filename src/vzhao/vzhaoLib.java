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
    public static int leastCommonMultiple(int num1,int num2,int num3)
    {
        int a=0;
        if(num1>=num2&&num1>=num3)
        {
            a=num1;
        }
        if(num2>=num1&&num2>=num3)
        {
            a=num2;
        }
        else
        {
            a=num3;
        }
        //All the if statement above makes sure if all the parameters are equal to
        for(int i=a;i<=a;i--)
        {
            if(num1%i==0&&num2%i==0&&num3%i==0)
            {
                return i;
            }
        }
        return 0;
    }
    public static int sumUpTo(int end)
    {
       int c=0;
        for(int i=0;i<=end;i++)
        {

            c += i;
        }
        return c;
    }

}
