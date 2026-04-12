/*
1 
1 2 
1 2 3 
1 2 3 4 */ 
public class Main {
public static void noofcol(int col,int maxcol){
    if(col>maxcol){
        return;
    }
    System.out.print(col+" ");
    noofcol(col+1, maxcol);
}public static void noofrow(int row,int maxrow){
    if(row>maxrow){
        return;
    }
    noofcol(1, row);
    System.out.println();
    noofrow(row+1, maxrow);
}
    public static void main(String[] args) {
       noofrow(1, 4); 
    }
}