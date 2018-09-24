package vzhao;
//Vincent Zhao 9-18-18
import static vzhao.VZhaoLib.date;
import static vzhao.VZhaoLib.cutOut;
import static vzhao.VZhaoLib.multiplyTable;
import static vzhao.VZhaoLib.leastCommonMultiple;
import static vzhao.VZhaoLib.sumUpTo;
public class testFile
{
   public static void main(String[] args)
   {
       System.out.println("Date:" + date("12/01/2003"));
       System.out.println((cutOut("catatonic cat","cat")));
       multiplyTable(3,9);
       System.out.println((leastCommonMultiple(8,4,8)));
       System.out.println(sumUpTo(8));
   }
}
