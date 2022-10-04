
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class App {
    public static void main(String[] args)  {
        int no;
        int sum;
        int s=0;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of intiger:");
        no=sc.nextInt();
        int array[]=new int[20];
        System.out.println("Enter the elements");

        for(int i=0;i<no;i++){
        array[i]=sc.nextInt();
        }
        System.out.println("enter the sum");
        sum=sc.nextInt();
        for(int i=0;i<no;i++){
        int x=i+1;
        int j=i;
        while(s < sum)
        {
            s=s+array[j];
            j++;
            if(s==sum)
           y=j+1;
        }
System.out.println("The position for thr sum is"+ x +"and"+ y );
}
}
}


