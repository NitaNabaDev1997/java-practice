package LogicalProb;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] inputarr= {10,6,7,8,9,10};
   int temp=0;
   for(int i=0;i<=inputarr.length-1;i++)
   {
	   for(int j=i+1;j<=inputarr.length-1;j++)
	   {
		   if(inputarr[i]>inputarr[j])
		   {
			   temp=inputarr[j];
			   inputarr[j]=inputarr[i];
			   inputarr[i]=temp;
		   }
	   }
   }
   
	
	 for(int i=0;i<=inputarr.length-1;i++) 
	 {
		 System.out.println(inputarr[i]); 
		 } 
		  for(int i = inputarr.length -2; i >=0; i--) 
		  { 
			  if(inputarr[i] !=inputarr[inputarr.length-1]) 
			  {
		  System.out.println("The second largest element " + inputarr[i]);
		  break;
		  } 
			  }
		 
	}
}
