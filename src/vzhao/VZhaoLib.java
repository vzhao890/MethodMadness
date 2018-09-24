package vzhao;
//Vincent Zhao 9-18-18
public class    VZhaoLib
{
    public static String date(String date)
    {
        String d = date.substring(3,5);
        String m = date.substring(0,2);
        String y = date.substring(6,date.length());
        return d+  "-"  +m+  "-"  +y;
    }
    /*
    The String d separates the day from String date.
    The String m separates the month from String date.
    The String y separates the year from String date.
    This returns the individual strings of d.m.y into the required format.
     */
    public static String cutOut(String mainStr, String subStr)
    {
        int index =mainStr.indexOf(subStr);
        String a = mainStr.substring(index+3,mainStr.length());
        return a;
    }
    /*
    The index finds out the first occurence of what mainStr is(which is cat)
    Then The String a finds the end of string mainStr and everything further
    This returns Strings A(which is explained in above comment)
     */
    public static void multiplyTable(int base,int range)
    {
       String b="";
        for(int x=0;range>=x;x++) //This for loop is set at 0. Then x has to be less than or equal to the range variable.If true,If true, add one to x.
        {
            int y= x*base;  //Multiplies x variable with the base
            String a= String.valueOf(y); //Finds the String value of the integer number
            b= b+a+",";  //formats the String

        }
        System.out.println(b); //Prints out the string

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
        //All the if statement above makes sure if all the parameters are equal to each other or just filters out the highest number
        for(int i=a;i<=a;i--)
        {
            if(num1%i==0&&num2%i==0&&num3%i==0)
            {
                return i;
            }
        }
        return 0;
        //the for statement above filters out the least common multiply untill it recieves a number
        // it returns zero if it can't find anything
    }
    public static int sumUpTo(int end)
    {
       int c=0;
        for(int i=0;i<=end;i++)
        {
            c += i;
        }
        return c;
        //this just adds up the number from 0 to the parameter number
        //Example: end=3 0+1+2+3
    }

}
