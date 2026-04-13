
/* 1
  232
 34543
4567654
*/
public class Main {

    public static void main(String[] args) {
        int maxrow = 4;

        for (int i = 1; i <= maxrow; i++) {
            int n = i;
            int n2 = 2 * i - 2;

            for (int s = maxrow-1; s>=0 ; s--) {
                System.out.print(" ");
            }

            for (int j =2*maxrow-i ; j >= 1; j--) {
                System.out.print(n);

                if (j <= i) {
                    n++;
                } else {

                    n--;
                }
            }
            System.out.println();
        }
    }
}