import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        String str;
        System.out.println("Enter the string: ");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        int n=str.length();
        int i,j,k;
        String str1=str;
        int m=n;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(Character.compare(str1[i],str[j])==0){
                    for(k=j;k<n;k++){
                        str1[k]=str1[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        int ctr=0;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(Character.compare(str1[i],str[j])==0){
                    ctr++;
                }
            }
            System.out.println(str1[i]+": "+ctr);
        }
        

    }
}
