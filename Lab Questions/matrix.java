import java.util.Scanner;
class matrix {
    
    int[][] m;
    int row,col;

    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of columns :");
        row=sc.nextInt();
        System.out.println("Enter the column size :");
        col=sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println(m[i][j]);
            }
        }
    }
    void addition(matrix a,matrix b)
    {
        if(a.row==b.row && a.col==b.col)
        {
            this.row=a.row;
            this.col=a.col;
            for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                this.m[i][j]=a.m[i][j]+b.m[i][j];
            }
        }
        this.display();

        }
        else{
            System.out.print("Unable to do addition,Size of matrices don't match ");
        }
    }

    void substraction(matrix a,matrix b)
    {
        if(a.row==b.row && a.col==b.col)
        {
            this.row=a.row;
            this.col=a.col;

            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    this.m[i][j]=a.m[i][j]-b.m[i][j];
                }
            }
            this.display();
        }
        else{
            System.out.println("Matrices dont match, unable to proceed");
        }
    }

    void multiplication(matrix a, matrix b)
    {
        if(a.col==b.row)
        {
            
        }
    }
    void transpose(matrix p)
    {
        this.row=p.row;
        this.col=p.col;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                this.m[i][j]=p.m[j][i];
            }
        }
        this.display();
    }
    
}
