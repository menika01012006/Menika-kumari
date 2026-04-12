/*
A
B C
D E F*/ 
public class Mains {
    public static char noofcol(int col,int maxcol,char ch){
    if(col>maxcol){
        return ch;
    }
    System.out.print(ch+" ");
    ch++;
   return noofcol(col+1, maxcol,ch);
}
public static void noofrow(int row,int maxno,char ch){
    if(row>maxno){
        return;
    }
    ch=noofcol(1, row, ch);
    
    System.out.println();
    noofrow(row+1, maxno,ch);
}
    public static void main(String[] args) {
        noofrow(1, 5,'A');
    }
}