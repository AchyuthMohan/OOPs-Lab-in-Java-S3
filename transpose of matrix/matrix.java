import java.util.Scanner;

public class matrix {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n,m,i,j;
        int [][]a=new int [30][30];
        
        System.out.println("Enter the number of rows: ");
        n=input.nextInt();
        System.out.println("Enter the column: ");
        m=input.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Enter the element: ");
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Original matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println("Transposed: ");
        for(j=0;j<m;j++){
            for(i=0;i<n;i++){
                System.out.println(a[i][j]);
            }
        }
        
    }
}
