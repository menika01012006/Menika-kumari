//Question no.7
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      int num= n/2;
      
      if(num*num==n){
         System.out.println("even");
      }else{
         System.out.println("odd ");
      }
   }
}


///question 8
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int year=2024;
      
      if((year%4==0&&year%100!=0)||(year%400==0)){
         System.out.println("leap year ");
      
      }else{
         System.out.println("not leap year");

      }
       
   }
}



///question 9
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int a=7;
      
      if(a>=-9&&a<=9){
         System.out.println(" single digit ");
      
      }else{
         System.out.println("not single digit");

      }
       
   }
}



///question 14
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      char ch='G';
      switch(ch){
         case 'G':
            System.out.println("green");
            break;
            case 'R':
            System.out.println("red");
            break;
            case 'y':
            System.out.println("yellow");
            break;
      }
      
       
   }
}


//Question no.30
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char ch = input.next().charAt(0);
      if (ch >= '0' && ch <= '9') {
         System.out.println("digit");
      } else if ((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z')) {
         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
               || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
         } else {
            System.out.println("consonent");
         }
      } else {
         System.out.println("special");
      }
   }
}


//Question no.31
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("side1");
      int side1=input.nextInt();
      System.out.println("side2");
      int side2=input.nextInt();
      System.out.println("side3");
      int side3=input.nextInt();
      int side=side1+side2+side3;
      if(side==180){
         System.out.println("valid triangle");
      }else{
         System.out.println("not valid triangle");
      }
      }
   }



//Question no.34
import java.util.Scanner;

public class Mains {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int num=input.nextInt();
      if(num>0){
         System.out.println("positive");}
          else if(num<0){
            System.out.println("negative");}
         
        if(num%2==0){
         System.out.println("even");
        
       }else{
         System.out.println("odd");
       }
      }  
    }
// Determine if a triangle is equilateral, isosceles, or scalene. 
//nput: Three integers 
//Output: "Equilateral", "Isosceles", or "Scalene" no.62

import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("side1");
    int a = input.nextInt();
    System.out.println("side2");
    int b = input.nextInt();
    System.out.println("side3");
    int c = input.nextInt();
    if (a + b > c) {
      if (a + c > b) {
        if (c + b > a) {
          System.out.println("valid triangle");
          if (a == b && b == c) {
            System.out.println("equilateral");
          } else if (a == b || a == c || b == c) {
            System.out.println("isosceles");
          } else {
            System.out.println("scalene");
          }
        }

      }

    } else {
      System.out.println("not valid");
    }
  }
}




//Question no.36
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      String str=input.next();
      switch(str){
         case"3evening":
         System.out.println("dinner");
         break;
         case"8lunch":
         System.out.println("lunch");
         break;
      }
      }  
   }


//Question no.38
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int number=input.nextInt();
      if (number <= 1) {
            System.out.println("Not a prime number");
        } 
        else if (number == 2 || number == 3 || number == 5||number == 7) {
            System.out.println("Prime number");
        } 
        else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0||number % 7 == 0 ) {
            System.out.println("Not a prime number");
        } 
        else {
            System.out.println("Prime number");
        }
    }
}
   


//Question no.41
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int num=input.nextInt();
      if(num%2==0){
         System.out.println("even");
      }
        else if(num%2!=0){
System.out.println("odd");}
    if(num>0){
   System.out.println("positive");
    }else if(num<0){
   System.out.println("negative");
}else{
   System.out.println("zero");
}
  

  }       
}




//Question no.46
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int num=input.nextInt();
      if(num%2!=0){
         int num2=num+1;
         System.out.println(num2);
      }
        else{
         System.out.println(num);
        } 
}
  

  }       


//Question no.48
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
    char ch='A';
    int type;
      if(ch >= 'a' && ch <= 'z'){
         ch=(char)(ch-32);
        type=1; 
         
      }
        else if(ch >= 'A' && ch <= 'Z'){
                  ch=(char)(ch+32);

         type =2;
         System.out.println(ch);
        }else{
         type=3;
        }
        switch(type){
         case 1:
            System.out.println(ch);
            break;
            case 2:
            System.out.println(ch);
            break;
        }
}
  

  }       

// Determine if a triangle is equilateral, isosceles, or scalene. 
//nput: Three integers 
//Output: "Equilateral", "Isosceles", or "Scalene" no.62

import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("side1");
    int a = input.nextInt();
    System.out.println("side2");
    int b = input.nextInt();
    System.out.println("side3");
    int c = input.nextInt();
    if (a + b > c&&a + c > b&&c + b > a) {
      
        
          System.out.println("valid triangle");
          if (a == b ) {
            if(b == c)
            System.out.println("equilateral");
          } else if (a == b || a == c || b == c) {
          
            System.out.println("isosceles");
          } else {
            System.out.println("scalene");
          }
        }else {
      System.out.println("not valid");
    

      }

    }
  }
  

// Determine if a triangle is equilateral, isosceles, or scalene. 
//nput: Three integers 
//Output: "Equilateral", "Isosceles", or "Scalene" no.62

import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("side1");
    int a = input.nextInt();
    System.out.println("side2");
    int b = input.nextInt();
    System.out.println("side3");
    int c = input.nextInt();
    if (a + b > c) {
      if (a + c > b) {
        if (b + c > a) {

          if (a == b) {
            if (b == c) {
              System.out.println("equilateral");

            } else {
              System.out.println("Isosceles");
            }

          } else {
            if (a == c) {
              System.out.println("isosceles");

            } else {
              if (a == c) {
                System.out.println("isosceles");

              } else {
                System.out.println("Scalene");
              }

            }
          }
        } else {
          System.out.println("not valid");
        }
      } else {
        System.out.println("not valid");
      }
    } else {
      System.out.println("not valid");
    }
  }
}

// largest three no.
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("side1");
    int a = input.nextInt();
    System.out.println("side2");
    int b = input.nextInt();
    System.out.println("side3");
    int c = input.nextInt();
    if(a>b){
      if(a>c){
        System.out.println(a);
      }else{
        System.out.println(c);
      }
    }else{
      if(b>c){
        System.out.println(b);
      }else{
        System.out.println(c);
      }
    }
    }
  }


// largest three no. question 63
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    if (a > 0) {
      if (a % 2 == 0) {
        System.out.println("positive and even");
      } else {
        System.out.println("positive and odd");}
      }
     else {
      if (a < 0) {
        if (a % 2 == 0) {
          System.out.println("negetive and even");
        } else {
          System.out.println("negetive and odd");
        }
      }else{
        System.out.println("zero");
      }

    }
    }
}



//questiob no.69
//Descrip on: Use if-else to check which character has a higher ASCII value. 
//Input: Two characters 
//Output: Character with higher ASCII value
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    char ch=input.next().charAt(0);
    System.out.println("enter next");
    char ch1=input.next().charAt(0);
    if(ch<='A'&&ch>='z'){
      int as=ch;
      int asi=ch1;
      if(as>asi){
        System.out.println("higher ch"+as);
      }else if(asi>as){
        System.out.println("higher ch1"+asi);
      }
    }else{
      System.out.println("not");
    }
      }
    }
  



//72. Nested If: Number is Positive and Divisible 
//Descrip on: Check if a number is posi ve, and if so, whether it is divisible by 2 and 5. 
//Input: Integer 
//Output: Appropriate message based on condi ons 
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int x=input.nextInt();
    if(x>0){
      if(x%2==0){
        if(x%5==0){
          System.out.println("divisible by 2 and 5");
        }else{
          System.out.println("not");
        }
      }else{
        System.out.println("not");
      }
    }else{
      System.out.println("n0t");
    }
    }
      }
    
  

//78. Check Palindrome (2-digit) 
// Descrip on: Use if-else to check if a 2-digit number is a palindrome. 
// Input: Two-digit number (e.g., 44) 
// Output: "Palindrome" or "Not a palindrom
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int n = input.nextInt();

    int reverse = ((n / 10) + ((n % 10)*10)

    );
    if (reverse == n) {
      System.out.println("palindrom");
    } else {
      System.out.println("not palindrom");
    }
  }
}



//82. Nested If: Largest and Check Even/Odd 
// Descrip on: Take three numbers. Find the largest, then check if it’s even or odd. 
// Input: Three integers 
// Output: Largest number and whether it is even or odd 
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int n = input.nextInt();
    System.out.println("enter");
    int n1 = input.nextInt();
    System.out.println("enter");
    int n2 = input.nextInt();
int l=n;
if(n1>l){
  l=n1;
}if(n2>l){
  l=n2;
}System.out.println("lar"+l);
   if(l%2==0) {
    System.out.println("even");
   }else{
    System.out.println("odd");
   }
  }
}


//**300 For Loop and Number Theory Ques ons:**// 

//question no.1
public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 28;
        int HCF = 0;
        int largest = a;
        if (a < b) {
            largest = b;

        }
        for (int i = 1; i <= largest / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                HCF = i;
            }
        }
        System.out.println(HCF);
    }

}
///**using function and recursion
public class Mains {
    public static int FindLargest(int num1, int num2) {
        int largest = num1;
        if (num1 < num2) {
            largest = num2;
        }
        return largest;
    }

    public static int FindGDC(int num1, int num2) {
        int largest = FindLargest(num1, num2);
        int GDC = 0;
        for (int i = 1; i <= largest / 2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GDC = i;

            }
        }
        return GDC;
    }

    // using recursion
    public static int FindGDCs(int num1, int num2, int number, int GDC, int largest) {

        if (number > largest / 2) {
            return GDC;
        }
        else if (num1 % number == 0 && num2 % number == 0) {
            GDC = number;

        }
        return FindGDCs(num1, num2, number+1, GDC, largest);
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int GDC = 0;
        int largest = FindLargest(num1, num2);

        System.out.println(FindGDC(num1, num2));
        System.out.println(FindGDCs(num1, num2, 1, GDC, largest));
    }
}

//question number 2;

public class Main {

    public static void main(String[] args) {
        int n = 17;
        boolean isprime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;

            }

        }
        if (isprime) {
            System.out.println("it is prime ");
        } else {
            System.out.println("it is not prime");
        }
    }
}

// 2. Check if a Number is Prime 
// Problem Statement: 
// Check whether a given number n is a prime number. 
// Input: 
// n = 17 
// Output: 
// True 
public class Mains {
    public static boolean checkPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static boolean isPrime(int number,  int i) {
        if (  i==number) {
            return true;
        }

        if (number % i == 0) {
            return false;
        }
        return isPrime(number,  i + 1);
    }

    public static void main(String[] args) {
        int number = 16;
        boolean isprime = true;
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isprime = false;
            }

        }
        if (isprime) {
            System.out.println("prime");

        } else {
            System.out.println("not prime");
        }
        System.out.println(checkPrime(number));
        System.out.println(isPrime(number, 1));
    }
}

// 3. Count Factors of a Number 
public class Mains {
    public static int countoffactor(int number, int i) {
        int count = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                count++;
            }
            i++;

        }
        return count;
    }

    public static int count(int number, int count, int i) {
        if (i > number / 2) {
            return count;
        }
        if (number % i == 0) {
            return 1 + count(number, count, i + 1);
        }
        return count(number, count, i + 1);
    }

    public static void main(String[] args) {
        int number = 12;
        int count = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;

            }
        }
        System.out.println("count of factor:" + count);
        System.out.println(countoffactor(number, 1));
        System.out.println(count(number, 1, 1));
    }
}

// 5. Find LCM of Two Numbers bekar 
public class Mains {

    public static void main(String[] args) {
        int num = 12;
        int num2 = 4;
        int LCM = 1;
        int smallest = num;
        if (num > num2) {
            smallest = num2;
        }
        for (int i = 1; i <= smallest; i++) {
            int mul = smallest * i;
            if (mul % num == 0 && mul % num2 == 0) {
                LCM = mul;
            }
        }

        System.out.println("lcm is:" + LCM);
    }
}

//*** 5. Find LCM of Two Numbers thoda achha

public class Mains {

    public static void main(String[] args) {
        int num = 12;
        int num2 = 4;

        int max = (num > num2) ? num : num2;
        int lcm = max;

        while (true) {
            if (lcm % num == 0 && lcm % num2 == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM is: " + lcm);
    }
}

// 5. Find LCM of Two Numbers 
public class Mains {

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num = 4;
        int num2 = 12;

        int lcm = (num * num2) / gcd(num, num2);

        System.out.println("LCM is: " + lcm);
    }
}
// 10. Find Power of a Number
public class Mains {
public static int powerOfnumber(int base,int exp){
    if(exp==0){
        return 1;
    }
    return base*powerOfnumber(base, exp-1);
}
    public static void main(String[] args) {
        int base = 2;
        int exp = 5;
        int power=1;
        for (int i = 1; i <=exp; i++) {
           power*=base; 
        }
      //  int power=(int)Math.pow(base,exp);
        System.out.println(power);
        System.out.println(powerOfnumber(base, exp));
    }
}


//Question number 10;
public class Main {

    public static void main(String[] args) {
        int base=2;
        int exp=5;
        int power=1;
        for (int i = 1; i <=exp; i++) {
            power=power*base;
        }
        int result=(int)Math.pow(2,5);
        System.out.println(result);
        System.out.println("power="+power);
    }
}

//Question number 11;
public class Main {

  public static void main(String[] args) {
    int n = 7;

    int a = 0;
    int b = 1, c;
    for (int i = 0; i < n; i++) {

      if (i == 0) {
        System.out.println(a);
      } else if (i == 1) {
        System.out.println(b);
      } else {
        c = a + b;
        System.out.println(c);

        a = b;
        b = c;

      }

    }
  }
}

public class Main {
    public static void display(int a, int b) {

        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.println(a);
            } else if (i == 1) {
                System.out.println(b);
            } else {
                int c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        display(a, b);
    }
}

//34. Find Sum of an Arithme c Progression (AP) 

public class Mains {

    public static void main(String[] args) {
        int first = 2;
        int diff = 3;
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sum += first;
            } else {
                int c = first + diff;
                sum += c;

                first = c;

                System.out.println(c);
            }
        }
        System.out.println(sum);
    }
}
//35. Find Sum of a Geometric Progression (GP) 

public class Mains {

    public static void main(String[] args) {
        int first = 2;
        int ratio = 3;
        int n = 4;
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                sum += first;
            } else {
                int term = first * ratio;
                sum += term;

                first = term;

                System.out.println(term);
            }
        }
        System.out.println(sum);
    }
}

//thorq achha
public class Mains {
    public static void main(String[] args) {
        int first = 2;
        int ratio = 3;
        int n = 4;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int term = first * (int)Math.pow(ratio, i);
            System.out.println(term);
            sum += term;
        }

        System.out.println("Sum = " + sum);
    }
}

//thora aur accha
public class Mains {
    public static void main(String[] args) {
        int first = 2;
        int ratio = 3;
        int n = 4;
        int sum = 0;
        int term = first;

        for (int i = 0; i < n; i++) {
            System.out.println(term);
            sum += term;
            term = term * ratio;
        }

        System.out.println("Sum = " + sum);
    }
}

// 36. Find Missing Number in a Series 
public class Mains {

    public static void main(String[] args) {
        int Series=1245;
        int Actualsum=0;
        int Expectedsum=0;
        while(Series!=0){
            int digit=Series%10;
            Actualsum+=digit;
            Series/=10;
        }
        for (int i = 1; i <=5; i++) {
            Expectedsum+=i;
        }
        int missingnumber=Expectedsum-Actualsum;
        System.out.println(missingnumber);
    }
}

//37. Check if a Number is a Triangular Number 

public class Mains {

    public static void main(String[] args) {
        int n = 11;
        int sum = 0;
        int i = 1;
        while (sum < n) {
            sum += i;
            // if(sum>=n){
            // break;
            // }
            i++;
        }

        if (sum == n) {
            System.out.println("tringular ");
        } else {
            System.out.println("not trangular");
        }
    }
}

//39. Check if Number is a Square Number 

public class Mains {
    public static void main(String[] args) {
        int num = 16;
        int i = 1;

        while (i * i < num) {
            i++;
        }

        if (i  * i  == num) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

//40. Find Square Root Using Loops 

public class Mains {
    public static void main(String[] args) {
        int num = 25;
        int i;
        for (i = 1; i * i < num; i++) {

        }

        if (i * i == num) {
            System.out.println("square root is:" + i);
        } else {
            System.out.println("not perfect square");
        }
    }
}

//41. Find All Prime Factors of a Number 

public class Mains {
    public static void main(String[] args) {
        int num = 15;
        for (int j = 2; j <= num; j++) {
            while (num % j == 0 ) {
                System.out.println(j);

                num /= j;

            }
        }

    }
}

//42. Count Prime Factors of a Number 

public class Mains {
    public static void main(String[] args) {
        int num = 15;
        int count = 0;
        for (int j = 2; j <= num; j++) {
            while (num % j == 0) {
                System.out.println(j);
                count++;
                num /= j;

            }
        }
        System.out.println("count is:" + count);
    }
}

// 45. Find Euler’s To ent Func on φ(n) 
// Problem Statement: 
// Find the value of Euler’s To ent Func on φ(n), which counts numbers less 
// than n that are coprime with n.
public class Mains {
    public static void main(String[] args) {
        int num = 9;
        int count = 0;
        for (int j = 1; j <= num; j++) {
            System.out.print(j + "=");
            int gdc = 0;

            for (int i = 1; i <= j; i++) {
                if (j % i == 0 && num % i == 0) {
                    gdc = i;
                }

            }
            System.out.print(gdc);

            System.out.println();
            if (gdc == 1) {
                count++;
            }
        }
        System.out.println("count is:" + count);
        if (count < num) {
            System.out.println("Euler’s");
        } else {
            System.out.println("not Euler’s");
        }
    }
}

// 46. Check if Two Numbers are Amicable 
public class Mains {

    public static void main(String[] args) {
        int a = 221;
        int b = 284;
        int sumofa = 0;
        int sumofb = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sumofa += i;
            }
        }
        for (int i = 1; i <= b / 2; i++) {
            if (b % i == 0) {
                sumofb += i;
            }
        }
        if (sumofa == b && sumofb == a) {
            System.out.println("Amicable ");
        } else {
            System.out.println(" not Amicable");
        }
    }
}

// 47. Find the Next Prime Number 
public class Mains {

    public static void main(String[] args) {
        int n=5;
        int i;
        for ( i = n+1; true; i++) {
            boolean isprime=true;
            for (int j = 2; j <=i/2; j++) {
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                break;
            }
        }
        System.out.println(i);
    }
}

// 48. Find the privious Prime Number 
public class Mains {

    public static void main(String[] args) {
        int n=10;
        int i;
        for ( i = n-1; true; i--) {
            boolean isprime=true;
            for (int j = 2; j*j <=i; j++) {
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                break;
            }
        }
        System.out.println(i);
    }
}

//49. Count Digits in Factorial
 public class Mains {

    public static void main(String[] args) {
        int n=1;
        int Factorial=1;
        for ( int i = 1;i<= n; i++) {
            Factorial*=i;
            
        }
        int count=0;
        while(Factorial!=0){
            count++;
            Factorial/=10;
        }
        System.out.println(count);
    }
}

//50. Find Sum of Prime Numbers up to N 

public class Mains {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 2; i <= n; i++) {

            boolean isprime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                sum += i;
            }

        }
        System.out.println("sum is :" + sum);

    }
}

// 51. Find Catalan Number 
public class Mains {

    public static void main(String[] args) {
        int n = 3;
        int facn = 1;
        int fac2n = 1;

        int facn1 = 1;
        for (int i = 1; i <= n; i++) {
            facn *= i;
        }
        for (int i = 1; i <= 2 * n; i++) {
            fac2n *= i;
        }
        for (int i = 1; i <= n + 1; i++) {
            facn1 *= i;
        }
        System.out.println(facn);
        System.out.println(facn1);
        System.out.println(fac2n);
        int cn = (fac2n) / ((facn1) * facn);
        System.out.println("catalan number is:" + cn);
    }
}

//52. Generate Lucas Numbers 
public class Mains {

    public static void main(String[] args) {
        int n = 5;
        int first = 2;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(first);
            } else if (i == 2) {
                System.out.println(second);

            } else {
                int third = first + second;
                System.out.println(third);
                first = second;
                second = third;
            }
        }
    }
}

// 53. Find Tribonacci Number 
// Problem Statement: 
// Find the nᵗʰ Tribonacci number
public class Mains {

    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second = 1;
        int third = 1;
        if (n == 1) {
            System.out.println(first);
        } else if (n == 2) {
            System.out.println(second);

        } else if (n == 3) {
            System.out.println(third);

        } else {
            int forth = 0;
            for (int i = 4; i <= n; i++) {

                forth = first + second + third;
                first = second;
                second = third;
                third = forth;
            }
            System.out.println(forth);

        }

    }

}
// 54. Check if a Number is Pronic 
// A pronic number is the product of two consecu ve integers 
//  12 = 3 × 4 
public class Mains {

    public static void main(String[] args) {
        int n = 12;
        boolean ispronic = false;
        // for (int i = 1; i < n / 2; i++)
        for (int i = 0; i * (i + 1) <= n; i++) {
            if (i * (i + 1) == n) {
                ispronic = true;
                break;
            }
        }
        if (ispronic) {
            System.out.println("it is pronic number");
        } else {
            System.out.println("it is not pronic number");
        }
    }
}

// 55. Find Sum of Reciprocals 

public class Mains {

    public static void main(String[] args) {
        int n = 3;
        float sum = 0f;
        for (float i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }
        System.out.println("sum of reciprocals :" + sum);

    }
}

// 57. Find Digital Root 

public class Mains {

    public static void main(String[] args) {
        int n = 123456;
        int sum ;
        while (n >= 9) {
            sum=0;
            int temp=n;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            n = sum;
        }

        System.out.println("sum of reciprocals :" + n);

    }
}

// 61. find a^b mod m

public class Mains {

    public static void main(String[] args) {
        int a=2,b=64,m=1000;
        int power=1;
        
        for (int i = 1; i <=b; i++) {
            power = (power * a) % m;
        }
        System.out.println(power);
    }
}

// 63. Find Modular Inverse 


public class Mains {

    public static void main(String[] args) {
        int a = 3;
        int m = 7;
        for (int i = 1; i <= m - 1; i++) {
            int mul = a * i;

            if (mul % m== 1) {
                System.out.println(i);
                break;
            }
        }
    }
}

//64. Solve Linear Congruence 


public class Mains {

    public static void main(String[] args) {
        int a = 3,b=2;
        int m = 7;
        for (int i = 1; i <= m - 1; i++) {
            int mul = a * i;

            if (mul % m== b) {
                System.out.println(i);
                break;
            }
        }
    }
}

//66. Find Order of an Element Modulo m 


public class Mains {

    public static void main(String[] args) {
        int a = 2;
        int m = 7;
        int power=1;
        for (int i = 1; i <= m - 1; i++) {
             power = power * a;

            if (power % m== 1) {
                System.out.println(i);
                break;
            }
        }
    }
}

