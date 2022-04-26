
import java.util.Scanner;

public class sinlink {
    class node{
        int data;
        node next;
        public node(int x){
            this.data=x;
        }
    }
    node head=null;
    node tail=null;

    void insert(int x){
        node newnode=new node(x);
        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.next=null;
            tail=newnode;
        }

    }
    void delete(){
        if(head==null){
            System.out.println("Empty");
        }
        else if(head==tail){
            System.out.println("Deleted: "+head.data);
            head=tail=null;
        }
        else{
            System.out.println("Deleted: "+head.data);
            head=head.next;
        }
    }
    void display(){
        node temp=head;
        if(head==null){
            System.out.println("Empty..");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        int state=0;
        Scanner sc=new Scanner(System.in);
        sinlink s=new sinlink();
        while(state==0){
            System.out.println("1. insert 2.delete last 3. display 4.exit: ");
            int ch;
            ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter the data to be inserted: ");
                    int item;
                    item=sc.nextInt();
                    s.insert(item);
                    break;
                }
                case 2:{
                    s.delete();
                    break;
                }
                case 3:{
                    s.display();
                    break;
                }
                case 4:{
                    state=1;
                    break;
                }
            }

        }
    }
}
