package vzhao;

import static vzhao.vzhaoLib.date;
import static vzhao.vzhaoLib.cutOut;
import static vzhao.vzhaoLib.multiplyTable;
import static vzhao.vzhaoLib.leastCommonMultiple;
public class testFile
{
   public static void main(String[] args)
   {
       System.out.println(date("12/01/2003"));
       System.out.println((cutOut("catatonic cat","cat")));
       multiplyTable(3,9);
       System.out.println((leastCommonMultiple(8,4,8)));
   }
}
