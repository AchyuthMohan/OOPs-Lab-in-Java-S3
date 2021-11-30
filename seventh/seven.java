import java.util.Scanner;



public class seven {
   public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=input.nextLine();
        String str2="";
        str2+=str;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(str2[j]==str2[i]){
                    for(k=j;k<n;k++){
                        str2[k]=str2[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        int ctr;
        for(i=0;i<n;i++){
            ctr=0;
            for(j=0;j<m;j++){
                if(Charat(i)==charat(j)){
                    ctr++;
                }
            }
            System.out.println(str[j]+": "+ctr);
        }
        

    }
}
