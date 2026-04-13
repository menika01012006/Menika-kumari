/*
* * * * 
* * * * 
* * * * 
* * * *  */ 
public class Main {
public static void noofcol(int col,int maxcol){
    if(col>maxcol){
        return;
    }
    System.out.print("*"+" ");
    noofcol(col+1,maxcol);
}public static void noofrow(int row,int maxrow){
    if(row>maxrow){
        return;
    }
    noofcol(1,maxrow);
    System.out.println();
    noofrow(row+1, maxrow);
}
    public static void main(String[] args) {
       noofrow(1, 4); 
    }
}

/*
1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 */ 
public class Main {
public static void noofcol(int col,int maxcol){
    if(col>maxcol){
        return;
    }
    System.out.print(col+" ");
    noofcol(col+1,maxcol);
}public static void noofrow(int row,int maxrow){
    if(row>maxrow){
        return;
    }
    noofcol(1,maxrow);
    System.out.println();
    noofrow(row+1, maxrow);
}
    public static void main(String[] args) {
       noofrow(1, 4); 
    }
}

/*
* * * * * 
*       * 
*       * 
*       * 
* * * * *
*/ 

public class Main {
    
    public static void printCol(int col, int maxcol, int row) {
        if (col > maxcol) {
            return;
        }
        if (col == 1 || col == maxcol || row == 1 || row == maxcol) {
            System.out.print("*" + " ");
        } else {
            System.out.print(" " + " ");
        }
        printCol(col + 1, maxcol, row);
        
    }

    public static void prinrRow(int row, int maxrow) {
        if (row > maxrow) {
            return;
        }
        printCol(1, maxrow, row);
        System.out.println();
        prinrRow(row + 1, maxrow);
        ;
    }

    public static void main(String[] args) {
prinrRow(1, 5);
    }
}

/*
* 
* * 
* * * 
* * * * 
*/ 
public class Main {
    public static void main(String[] args) {
        int maxRows = 4; 
        for (int row = 1; row <= maxRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
         System.out.println();

        }
    }
}
/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/ 
public class Main {
   static int n=1;
    public static void noOfCols(int col){
    if(col==0){
        return;
    }

    System.out.print(col+" ");
    
    noOfCols(col-1);
}
public static void noOfRows(int row,int maxno){
    if(row>maxno){
        return;
    }
    noOfCols(row);
    System.out.println();
    noOfRows(row+1, maxno);
}
    public static void main(String[] args) {
        noOfRows(1, 5);
    }
}

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

/*
1 2 3 4 
1 2 3 
1 2 
1 
 */ 
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
    noofcol(1, maxrow-row+1);
    System.out.println();
    noofrow(row+1, maxrow);
}
    public static void main(String[] args) {
       noofrow(1, 4); 
    }
}

// * 
// * * 
// * * * 
// * * 
// * 

public class Main {

    public static void main(String[] args) {
        int noOfrow=3;
        for (int i = 1; i <=noOfrow; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        int noOfrows=2;
        for (int i = 1; i <=noOfrows; i++) {
            for (int j = 1; j <=noOfrows-i+1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        }
    }
// * 
// * * 
// * * * 
// * * 
// * 

public class Main {

    public static void main(String[] args) {
        int noOfrow=4;
        for (int i = 1; i <2*noOfrow; i++) {
            int totalnocol=i>noOfrow?2*noOfrow-i:i; 
            for (int j = 1; j <=totalnocol; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        
        }
    }
}

    //Play Button pattern Using Recursion: in increasing Order of Number

/*

1  
1  2  
1  2  3  
1  2  3  4  
1  2  3  4  5  
1  2  3  4  
1  2  3  
1  2  
1   

 */

public class Main {

    public static void printCol(int col, int maxCol) {
        if (col == 0) {
            return;

        }
        System.out.print(col + "  ");
        printCol(col - 1, maxCol);

    }

    public static void printRow(int row, int maxRow) {
        if (row == 2 * maxRow) {
            return;

        }
        int totalNoCols = row > maxRow ? 2 * maxRow - row : row;
        printCol(1, totalNoCols);
        System.out.println();
        printRow(row + 1, maxRow);

    }

    public static void main(String[] args) {
        int maxRow = 5;
        printRow(1, maxRow);
    }
}

//Play Button pattern Using Recursion: in increasing Order of Number

/*

1  
2  1  
3  2  1  
4  3  2  1  
5  4  3  2  1  
4  3  2  1  
3  2  1  
2  1  
1  
 */

public class Main {

    public static void printCol(int col) {
        if (col == 0) {
            return;

        }
        System.out.print(col + "  ");
        printCol(col - 1);

    }

    public static void printRow(int row, int maxRow) {
        if (row == 2 * maxRow) {
            return;

        }
        int totalNoCols = row > maxRow ? 2 * maxRow - row : row;
        printCol(totalNoCols);
        System.out.println();
        printRow(row + 1, maxRow);

    }

    public static void main(String[] args) {
        int maxRow = 5;
        printRow(1, maxRow);
    }
}
//Play Button pattern Using Recursion

/*

0  
0  1 
0  1 0  
0  1 0  1 
0  1 0  1 0  
0  1 0  1 
0  1 0  
0  1 
0  
 */

public class Main {

    public static void printCol(int col,int maxcol) {
        if (col > maxcol) {
            return;

        }
        if (col % 2 == 0) {
            System.out.print("1" + " ");
        } else {
            System.out.print("0" + "  ");

        }

        printCol(col + 1,maxcol);

    }

    public static void printRow(int row, int maxRow) {
        if (row == 2 * maxRow) {
            return;

        }
        int totalNoCols = row > maxRow ? 2 * maxRow - row : row;
        printCol(1,totalNoCols);
        System.out.println();
        printRow(row + 1, maxRow);

    }

    public static void main(String[] args) {
        int maxRow = 5;
        printRow(1, maxRow);
    }
}
/*
1 2 3 4                                                      
1     4 
1     4 
1 2 3 4 
1     4 
1     4 
1     4 
1 2 3 4*/
public class Main {
 
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=2* n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n||i==2*n) {
                    if(i<=n){
                    System.out.print(j+" ");

                    }else{
                       System.out.print(j+" "); 
                    }

                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
    //     int n2 = 4;
    //     for (int i = 1; i <= n2; i++) {
    //         for (int j = 1; j <= n2; j++) {
    //             if (i == n2 ||  j == 1 || j == n2) {
    //                 System.out.print(i+" ");

    //             } else {
    //                 System.out.print(" "+" ");
    //             }
    //         }
    //         System.out.println("");
    // }
}
}

/*
     *
    * *
   *   *
  *     *
 *********
*/

public class Main {
    public static void prinrSpace(int space, int maxspace) {
        if (space > maxspace) {
            return;
        }
        System.out.print(" ");

        prinrSpace(space + 1, maxspace);

    }

    public static void printCol(int col, int maxcol, int row,int maxrow) {
        if (col > maxcol) {
            return;
        }
        if (col == 1 || col == maxcol || row == 1 || row == maxrow) {
            System.out.print("*" );
        } else {
            System.out.print(" " );
        }
        printCol(col + 1, maxcol, row,maxrow);

    }

    public static void prinrRow(int row, int maxrow) {
        if (row > maxrow) {
            return;
        }
        prinrSpace(1, maxrow - row + 1);
        printCol(1, 2 * row - 1, row,maxrow);
        System.out.println();
        prinrRow(row + 1, maxrow);

    }

    public static void main(String[] args) {
        prinrRow(1, 5);
    }
}

/*
 123456789
  1234567
   12345
    123
     1
*/

public class Main {
    public static void prinrSpace(int space) {
        if (space ==0) {
            return;
        }
        System.out.print(" ");

        prinrSpace(space - 1);

    }

    public static void printCol(int col,int maxcol) {
        if (col >maxcol) {
            return;
        }
        // if (col == 1 || col == maxcol || row == 1 || row == maxrow) {
        //     System.out.print("*" );
        // } else {
        //     System.out.print(" " );
        // }
        System.out.print(col);
        printCol(col + 1,maxcol);

    }

    public static void prinrRow(int row, int maxrow) {
        if (row >maxrow) {
            return;
        }
        prinrSpace(row-1);
        printCol(1,2 * (maxrow - row)+1);
        System.out.println();
        prinrRow(row +1, maxrow);

    }

    public static void main(String[] args) {
        prinrRow(1, 5);
    }
}

/*
 987654321
 7654321
  54321
   321
    1
*/

public class Main {
    public static void prinrSpace(int space) {
        if (space ==0) {
            return;
        }
        System.out.print(" ");

        prinrSpace(space - 1);

    }

    public static void printCol(int col) {
        if (col ==0) {
            return;
        }
        // if (col == 1 || col == maxcol || row == 1 || row == maxrow) {
        //     System.out.print("*" );
        // } else {
        //     System.out.print(" " );
        // }
        System.out.print(col);
        printCol(col - 1);

    }

    public static void prinrRow(int row, int maxrow) {
        if (row >maxrow) {
            return;
        }
        prinrSpace(row-1);
        printCol(2 * (maxrow - row)+1);
        System.out.println();
        prinrRow(row +1, maxrow);

    }

    public static void main(String[] args) {
        prinrRow(1, 5);
    }
}

/*
 *********
  *     *
   *   *
    * *
     *
*/

public class Main {
    public static void prinrSpace(int space, int maxspace) {
        if (space > maxspace) {
            return;
        }
        System.out.print(" ");

        prinrSpace(space + 1, maxspace);

    }

    public static void printCol(int col, int maxcol, int row,int maxrow) {
        if (col > maxcol) {
            return;
        }
        if (col == 1 || col == maxcol || row == 1 || row == maxrow) {
            System.out.print("*" );
        } else {
            System.out.print(" " );
        }
        printCol(col + 1, maxcol, row,maxrow);

    }

    public static void prinrRow(int row, int maxrow) {
        if (row ==0) {
            return;
        }
        prinrSpace(1, maxrow - row + 1);
        printCol(1, 2 * row - 1, row,maxrow);
        System.out.println();
        prinrRow(row -1, maxrow);

    }

    public static void main(String[] args) {
        prinrRow(5, 5);
    }
}

/*
123456789
 1     7
  1   5
   1 3
    1
*/

public class Main {
    public static void prinrSpace(int space) {
        if (space ==0) {
            return;
        }
        System.out.print(" ");

        prinrSpace(space - 1);

    }

    public static void printCol(int col,int maxcol,int row,int maxrow) {
        if (col >maxcol) {
            return;
        }
        if (col == 1 || col == maxcol || row == 1 || row == maxrow) {
            System.out.print(col );
        } else {
            System.out.print(" " );
        }
        printCol(col + 1,maxcol,row ,maxrow);

    }

    public static void prinrRow(int row, int maxrow) {
        if (row >maxrow) {
            return;
        }
        prinrSpace(row-1);
        printCol(1,2 * (maxrow - row)+1,row,maxrow);
        System.out.println();
        prinrRow(row +1, maxrow);

    }

    public static void main(String[] args) {
        prinrRow(1, 5);
    }
}