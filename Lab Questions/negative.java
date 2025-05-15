import java.util.*;
public class negative extends RuntimeException {
    negative(String s)
    {
        super(s);
    }


}
class average{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size;

        System.out.println("Enter the number of elements :");
        size=sc.nextInt();

        int sum=0;
        int[] k= new int[size];

        System.out.println("Enter the elements :");
        for(int i=0;i<size;i++)
        {
            k[i]=sc.nextInt();
            try{
                if(k[i]<0)
                {
                    throw new negative("Negative numbers are not allowed");
                }
                else{
                    sum+=k[i];
                }
            }
            catch(negative e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average is :"+(sum/size));





    }
}
