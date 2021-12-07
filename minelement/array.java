import java.util.Scanner;

import javax.swing.InputMap;

public class array {
    public static void main(String[]args){
        int []a=new int[20];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=input.nextInt();
        int min,i,temp,j;
        for(i=0;i<n;i++){
            System.out.println("Enter the element: ");
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        min=a[0];
        
        for(i=0;i<n;i++){
            if(min!=a[i]){
                System.out.println("Second minimum: "+a[i]);
                break;
            }
        }
    }
}
