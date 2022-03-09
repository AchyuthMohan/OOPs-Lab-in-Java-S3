import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int l,n,m,o,i,j;
        int [][]a=new int[30][30];
        int [][]b=new int[30][30];
        System.out.println("Enter the size of first and second matrices: ");
        System.out.println("First: ");
        System.out.println("Row:");
        n=input.nextInt();
        System.out.println("columns: ");
        m=input.nextInt();
        System.out.println("Second: ");
        System.out.println("Row:");
        l=input.nextInt();
        System.out.println("columns: ");
        o=input.nextInt();
        System.out.println("First: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.println("Enter the element: ");
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Second: ");
        for(i=0;i<l;i++){
            for(j=0;j<o;j++){
                System.out.println("Enter the element: ");
                b[i][j]=input.nextInt();
            }
        }
        int [][]c=new int[30][30];
        int k;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                c[i][j]=0;
                for(k=0;k<n;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<o;j++){
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }



    }
}
