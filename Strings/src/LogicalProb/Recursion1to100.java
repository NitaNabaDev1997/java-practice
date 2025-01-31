package LogicalProb;
import java.util.*;
class Recursion1to100 {
    
    public static void printnum(int n)
    {
        if(n<=100)
        {
            System.out.println(n);
            printnum(n+1);
        }
    }
    public static void main(String[] args) {
       //int i=0;
       printnum(1);
    }
}
