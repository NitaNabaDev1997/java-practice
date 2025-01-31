package Stringbasics;

public class reversesenctence {
	public static void main(String args[])
    {
        String s1="my name is naba";
        String[] strarray=s1.split(" ");
        
        //to reverse string without reversing each word
		/*
		 * String s2=""; for(int i=0;i<strarray.length;i++) { s2=strarray[i]+" "+s2; }
		 * System.out.print(s2);
		 */        
      //to reverse string with reversing each word
        String s2="";
        
        for(int i=0;i<strarray.length;i++)
        {
            StringBuffer sb= new StringBuffer(strarray[i]);
            s2=sb.reverse()+" "+s2;
            s2=s2.trim();
        }
        System.out.print(s2);
    }
}
