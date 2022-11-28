/* Print numbers from 1 to N without the help of loops.*/

class Print
{
  public void printNos(int N)
    {
        //Your code here
        if(N==0)
        return;
        printNos(N-1);
        System.out.print(N+" ");
    }
}
