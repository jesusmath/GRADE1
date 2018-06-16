import java.util.Scanner;
public class Studentgrade {
	
	    public static void main(String[] args) {
	    int n; double mean=0, sd=0; 
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    System.out.println ("What is the number of student");
	    n=input.nextInt();
	    double[]a=new double[n]; double[]e=new double[n]; double[]t=new double[n];
	    for(int i=0;i<n;i++) {
	     System.out.println ("what is student "+i+" score exam?");
	     e[i]=input.nextInt();
	     System.out.println ("what is student "+i+" score assignement?");
	     a[i]=input.nextInt();
	     t[i]=e[i]+a[i];
	    }
	    for (int i=0;i<n;i++) {
	     mean=mean+t[i]/n;	
	    }
	    for (int i=0;i<n;i++) {
	     sd=sd+(t[i]-mean)*(t[i]-mean)/n;
	    }
	    sd=Math.sqrt(sd);
	    for (int i=0;i<n;i++) {
	     if (t[i]>=mean+2*sd)
	     System.out.println ("The student "+i+" has a A grade");
	     else
	      if (t[i]>=mean+sd)
	       System.out.println ("The student "+i+" has a B grade"); 
	      else
	       if (t[i]>=mean)	
	        System.out.println ("The student "+i+" has a C grade"); 
	       else
		    if (t[i]>=mean-sd)
		     System.out.println ("The student "+i+" has a D grade");
		    else
		     System.out.println ("The student "+i+" has a F grade");
	   }
     } 
	}
