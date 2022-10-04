
import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        int no;
        int sum;
        int s;
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
        x=i+1;
        j=i;
        while (s < sum)
        {
            s=s+a[j];
            j++;
            if(s==sum)
            y=j+1;
        }
printf("The position for thr sum is"+ x +"and"+ y )

    }
}
