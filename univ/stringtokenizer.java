import java.util.*;
public class stringtokenizer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=new String();
        str=sc.nextLine();
        int sum=0;
        StringTokenizer st=new StringTokenizer(str," ");
        while(st.hasMoreTokens()){
            String temp=st.nextToken();
            int t=Integer.parseInt(temp);
            sum+=t;
            System.out.print(t+" ");
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}
