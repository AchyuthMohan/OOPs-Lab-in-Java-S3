class printer{
     synchronized void display(char ch){
        for(int i=1;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
class star extends Thread{
    printer p;
    star(printer p){
        this.p=p;
    }
    public void run(){
        p.display('*');
    }
}
class hash extends Thread{
    printer p;
    hash(printer p){
        this.p=p;
    }
    public void run(){
        p.display('#');
    }
}

class sync{
    public static void main(String[] args) {
        printer p=new printer();
        star s=new star(p);
        hash h=new hash(p);
        s.start();
        h.start();
    }
}