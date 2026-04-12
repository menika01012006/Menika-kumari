import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first");
        int x = input.nextInt();
        System.out.println("second");
        int y = input.nextInt();
        System.out.println("third");
        int z = input.nextInt();
        if (x > y && x > z){ 

            System.out.println(x);}
            if (y > x && z < y) {
                System.out.println(y);}
                if (z > x && z > y){ 
                    System.out.println(z);}
                
            
        else {
            System.out.println("not positive");
        }
    }
}

import java .util.Scanner;
public class Condition {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the year");
        int year=input.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){ 
        System.out.println("is a leap year");

}else{
       System.out.println("is not leap year");
}
}
}


import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("month");
        int x = input.nextInt();
        System.out.println("year");
         int year = input.nextInt();
        // System.out.println("third");
        //int z = input.nextInt();
        if (x==1){ 
                System.out.println("january=31");}
           else if (x==2){
                if(((year%4==0 && year%100!=0)||(year%400==0)))
            System.out.println("feb=29");}
        else{
            System.out.println("feb=28");
        }
            if (x==3) {
            System.out.println("march");}
            else if (x==4){
            System.out.println("aprial");}
            else if (x==5) 
            System.out.println("may");
            else if (x==6)
            System.out.println("june");
            else if (x==7) 
            System.out.println("july");
            else if (x==8)
            System.out.println("august");
           else  if (x==9)
            System.out.println("sep");
            else if (x==10) 
            System.out.println("oct");
            else if (x==11) 
            System.out.println("nov");
            else if (x==12) 
            System.out.println("dec");
            
        else {
            System.out.println("not positive");
        }
    }
}

public class Incre {
    public static void main(String[] args) {
        int x=345678;
        if(x%3==0){
            int newno=x*2;System.out.println(newno);
            int x1=newno%100;System.out.println(x1);
            newno=newno/100;System.out.println(newno);
            newno=newno*2;System.out.println(newno);
            int x2=newno%100;System.out.println(x2);
            newno=newno/100;System.out.println(newno);
            newno=newno*2;System.out.println(newno);
            int x3=newno%100;System.out.println(x3);
            newno=newno/100;System.out.println(newno);
            newno=newno*2;System.out.println(newno);
            int sum=x1+x2+x3;System.out.println(sum);
            if (sum%5==0){
                System.out.println("yes");
            }else{
                System.out.println("no");}
            int mul=sum*5;
            int quo=mul/3;
    
            if(quo%2==0){
                System.out.println("even");

        }else{
            System.out.println("odd");
        }

    }
}
}

    import java .util.Scanner;
public class Incre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int unit=input.nextInt();
        if(unit<=100){
            System.out.println("rs:5");
        }else if(unit<=200){
            System.out.println("rs:7");
        }else if(unit<201){
            System.out.println("rs:10");
        }else if(unit>1||unit<=100){
            System.out.println("rs:5");
        }else if(unit>300){
            System.out.println("rs:15");
        }else if(unit>500){
            System.out.println("rs:20");
        }
        
            
}
}

    import java .util.Scanner;
public class Incre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=345679;
        if(x%3==0){
        int X1=x%10;//8
        x=x/10;
        int x2=x%100;//67
        x=x/100;
        int x3=x%10;//5
        x=x/10;
        int x4=x%100;//34
        x=x/100;System.out.println(x);
        int sum=X1+x2+x3+x4;
         if(sum%2==0)
        System.out.println("even");
        int q=sum/5;
        if (q%2==0)
            System.out.println("yes");
    else{
            System.out.println("no");
        }
     } else{
        System.out.println("odd");
     }      
}
}

 *********//first digit>last digit ho,check number 4 se divisible hai ya ya nahi
 //if first =last ho ,check number palindrome hai ya nahi
 //if first<last ho,check karonumber even hai ya odd********
 
 import java .util.Scanner;
public class Incre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
      int x=input.nextInt();
      int x1=x%10;//last
      int y1=x/1000;//first
      if(x1>y1){
        if(x%4==0){
            System.out.println("divisible");}
        else{
            System.out.println("not divisible");
        
        }
    }
      else if(x1==y1){
        int reverse=(x1*1000)+((x/10)%10)*100+((x/100)%10)+y1;System.out.println(reverse);
        if(x==reverse){
            System.out.println("plindrom");
        }else{
System.out.println("not plindrom");
        }
      }else{
        if(x%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        
      }
        
    }
}


***********// Ek 4-digit number input lo.

// Agar digits ka sum > 20 ho → number 5 se divisible hai ya nahi

//Agar digits ka sum == 20 ho → number palindrome hai ya nahi

//Agar digits ka sum < 20 ho → number even ya odd***********

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter input");
        int x =input.nextInt();//1234
        int a=x%10;System.out.println(a);//4
       int A=x/10;System.out.println(A);//123
       int b=A%10;System.out.println(b);//3
       int B=A/10;System.out.println(B);//12
       int c=B%10;System.out.println(c);//2
       int C=B/10;System.out.println(C);//1
int D=C%10;System.out.println(D);
int sum=a+b+c+D;
        if(sum>20){
            if(x%5==0){
                System.out.println("divisible");}
            else{
                System.out.println("not divisible");}
            }else if(sum==20){
                int reverse=(a*1000)+(b*100)+(c*10)+D;
                if(reverse==x){
                    System.out.println("palindrome");
                }else{
                    System.out.println("not palindrome");
                }
                

            }else if(sum<20){
                if(x%2==0){
                    System.out.println("even");
                }else{
                    System.out.println("odd");
                }
            }

            }
        }


      ***********  // Ek character input lo.
//Agar vowel ho → print "Vowel"
//Agar consonant ho → print "Consonant"
//Agar digit (0–9) ho → print "Digit"
//Otherwise → print "Special Character"**********

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        char ch = input.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.println("vowel");
            } else {
                System.out.println("consonent");
            }
        } else {
            System.out.println("spacial carecter");
        }
    }
}



********===========//Ek uppercase alphabet input lo.

//Agar A–M ke beech ho → print "First Half"

//Agar N–Z ke beech ho → print "Second Half"=========********
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            if (ch >= 'A' && ch <= 'M') {
                System.out.println("first half");
            } else {
                System.out.println("second half");
            }
        } else {
            System.out.println("does not charecter");
        }
    }
}

**************//Ek character lo.

//Agar digit ho → check karo even ya odd digit

//Agar alphabet ho → check karo vowel ya consonant

//Otherwise → "Special character"===========
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        char ch = input.next().charAt(0);
        if (ch >= '0' && ch <= '9') {
            if (ch % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("alphabate");
        } else {
            System.out.println("does not charecter");
        }
    }
}


============//Ek character lo.

//Agar ASCII value even ho → "Even ASCII"

//Agar ASCII value odd ho → "Odd ASCII"*************

import java.util.Scanner;
public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        char ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            int i = (int) ch;
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("even");
            
        } else {
            System.out.println("odd");
        }

    }
    }}
            
    
******************//Ek character input lo.f
//Agar character digit ho
//Agar digit even ho
//Agar digit + ASCII value > 100 ho → "Heavy Even Digit"
//Warna → "Light Even Digit"
//Agar digit odd ho
//Agar digit³ odd ho → "Odd Cube Digit"
//Agar character alphabet ho
//Agar uppercase ho
//Agar alphabet position (A=1…) prime ho → "Prime Uppercase"
//Agar lowercase ho
//Agar ASCII value palindrome ho → "Palindrome ASCII Lowercase"
//Otherwise → "Special Character"import java.util.Scanner;========*****

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      char ch = input.next().charAt(0);
      if (ch >= '0' && ch <= '9') {
         if (ch % 2 == 0) {
            int as = ch;
            System.out.println(as);
            int sum = ch + as;
            if (sum > 100) {
               System.out.println("heavy even digit");
            } else {
               System.out.println("light even digit");
            }
         } else {
            int cube = ch * ch * ch;
            if (cube % 2 != 0) {
               System.out.println("odd cube digite");
            }
         }

      } else if (ch >= 'A' && ch <= 'Z') {
         if (ch >= 'A' && ch <= 'z') {
            int position = ch - 'A' + 1;
            System.out.println(position);
            if (position == 2 || position == 3 || position == 5 || position == 7 || position == 11 || position == 13
                  || position == 17 || position == 19 || position == 23) {
               System.out.println("upper prim");
            }
         }
      } else if (ch >= 'a' && ch <= 'z') {
         int asi = ch;
         System.out.println("asi" + asi);
         int first = asi / 10;
         int second = asi % 10;
         int reverse = second + (first * 10);
         System.out.println("rev" + reverse);
         if (asi == reverse) {
            System.out.println("Palindrome ASCII Lowercase");
         }
      } else {
         System.out.println("special j");
      }
   }
}
        
 
*****************// /Ek character input lo.
// Agar digit ho
// Agar digit = ASCII last digit
// → "Digit equals ASCII last digit"
// Warna
// → "Digit not equal to ASCII last digit"
// Agar alphabet ho
// Agar vowel ho
// Agar ASCII % 3 == 0 → "Divisible Vowel"
// Agar consonant ho
// Agar ASCII % 2 == 0 → "Even ASCII Consonant"
// Otherwise → "Special Symbol"************

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      char ch = input.next().charAt(0);
      int asi = ch;
      System.out.println(asi);
      if (ch >= '0' && ch <= '9') {
         int digit = ch - '0';

         int lastDigit = ch % 10;
         if (digit == lastDigit) {
            System.out.println("Digit equals ASCII last digit");
         } else {
            System.out.println("Digit  not equals ASCII last digit");
         }
      } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
               || ch == 'o' || ch == 'u') {
            if (asi % 3 == 0) {
               System.out.println("divisival vowel");
            } else {
               if (asi % 2 == 0) {
                  System.out.println("even");
               }
            }
         }
      } else {
         System.out.println("special");
      }
   }
}       
    

*********=======
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int number = input.nextInt();
      if (number >= -9 && number <= 9) {

         System.out.println("single digit");
      } else {
         System.out.println("not single digit");
      }
   }
}


SWITCH CASE QUESTION.....
************//Check vowel or consonant using switch.///////
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char ch = input.next().charAt(0);
      switch (ch) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
            System.out.println("vowel");
           break;
           default:
            System.out.println("consonent");
      }
   }
}

***********//Print grade using switch.////////
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int mark=input.nextInt();
      switch(mark){
         case 90:
            System.out.println("grad =a");
            break;
            case 80:
            System.out.println("grad B");
            break;
            case 70:
            System.out.println("grad=C");
            break;
            case 60:
            System.out.println("grad=D");
            break;
            case 50:
            System.out.println("grad=e");
            break;
            default:
               System.out.println("fail");

      }
   }
}

//Print grade using switch.
import java.util.Scanner;



*********Write a program to check whether a number (1–4)
 corresponds to a season (1 → Winter, 2 → Spring, etc.).//////

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int whether=input.nextInt();
      switch(whether){
         case 1:
            System.out.println("spring");
            break;
            case 2:
            System.out.println("winter");
            break;
            case 3:
            System.out.println("summer");
            break;
            case 4:
            System.out.println("kuchh bhi");
            break;
            
            default:
               System.out.println("take valid value");

      }
   }
}


//Write a program to find the smaller of two numbers using switch (use 1 for smaller, 2 for larger).
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter first number");
      int a=input.nextInt();
      System.out.println("enter second number");
      int b=input.nextInt();
      System.out.println("enter first for smaller second for larger");
      int choice=input.nextInt();
      switch(choice){
         case 1:
            if(a<b){
            System.out.println("smaller num"+a);
         }else if(b<a){
            System.out.println("smaller num "+b);

         }else {
            System.out.println("both number is equel");
         }
         break;
            case 2:
            if(a>b){
            System.out.println("ller num"+a);
         }else if(b>a){
            System.out.println("ller num "+b);

         }else {
            System.out.println("both number is equel");
         }
            break;
            
            default:
               System.out.println("take valid value");

      }
   }
}


**********//Write a program to convert a digit (0–9) to its word representation (0 → Zero, 1 → One, etc.)..
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int digit=input.nextInt();
      switch(digit){
         case 0:
            System.out.println("zero");
            break;
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            case 6:
            System.out.println("six");
            break;
            case 7:
            System.out.println("seven");
            break;
            case 8:
            System.out.println("eight");
            break;
            case 9:
            System.out.println("nine");
            break;
            default:
      }
   }
}


*********//Menu-driven program: ATM operations (1 → Balance, 2 → Deposit, 3 → Withdraw, 4 → Exit).
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int digit=input.nextInt();
      switch(digit){
         case 1:
            System.out.println("balance");
            break;
            case 2:
            System.out.println("deposite");
            break;
            case 3:
            System.out.println("withdraw");
            break;
            
            default:
               System.out.println("exit");
      }
   }
}


//Write a program that prints “Even” or “Odd” using switch. Hint: use number % 2.
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int digit=input.nextInt();
       digit=digit%2;
      switch(digit){
         case 0:
            System.out.println("even");
            break;
            
            
            default:
               System.out.println("odd");
      }
   }
}


*********//Write a switch program to check whether a character is uppercase or lowercase.
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" input");
      char ch=input.next().charAt(0);
      int type;
      if(ch>='A'&&ch<='Z'){
        type=1; 

       }else if(ch>='a'&&ch<='z'){
          type=2;
     }else{
          type= 3;
      }
      switch(type){
         case 1:
            System.out.println("uppercase");
            break;
            case 2:
            System.out.println("lowercase");
            break;
            default:
            System.out.println("notcase");
            break;
      }
       }
      
      }


     *********8 //Write a program using switch with String to create a food menu.
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" input");
      String menu=input.nextLine();
      
      
      switch(menu){
         case "pizza":
            System.out.println("120");
            break;
            case "pasta":
            System.out.println("60");
            break;
            default:
            System.out.println("not avalable");
            break;
      }
       }
      
      }



      //Write a program using switch with String to create a food menu.
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("******menu card*****");
      System.out.println("pizza");
      System.out.println("pasta");
      System.out.println("burger");
      System.out.println("momag");

      System.out.println(" enter food item ");
      String food=input.nextLine();
      System.out.println("enter quantity");
      int quatity=input.nextInt();
      int price=0;
      switch(food){
         case "pizza":
            price=120;
            break;
            case "pasta":
            price=100;
            break;
            default:
            System.out.println("not avalable");
            break;
      
      }
       
       int totalbill=price*quatity;
       System.out.println(".....total bill....");
      System.out.println("food: "+food);
      System.out.println("quantity: "+quatity);
   System.out.println("price: "+price);
System.out.println("total bill: "+totalbill);
      }
}



*********//Write a program using switch to check whether a number is
//Positive, Negative, or Zero.////////
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int key;
      if (num > 0) {
         key = 1;
      } else if (num < 0) {
         key = -1;
      } else {
         key = 0;
      }
      switch (key) {
         case 1:
            System.out.println("positive");
            break;
         case -1:
            System.out.println("negaitive");
            break;
         case 0:
            System.out.println("zero");
            break;
      }
   }
}


 
*****//C to F and F to C
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int temp = input.nextInt();
      int f=(temp * 9 / 5) + 32;
      int c=(temp - 32) * 5 / 9;
      System.out.println("enter 1 for F and enter 2 for C");
      int choice=input.nextInt();
      switch(choice){
         case 1:
            System.out.println("F:"+f);
            break;
            case 2:
            System.out.println("F:"+c);
            break;
      }
      }
   }
  
 
//leap year only nested if
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int year = input.nextInt();
    if (year % 400 == 0) {
      System.out.println("leap year");
    } else {
      if (year % 100 == 0) {

        System.out.println(" not leap year");
      } else {
        if (year % 4 == 0){
          System.out.println("leap year");
      }else{

      }  
      }
    }
  }
}



// Q1. Quadratic Equation Nature
// Input: a, b, c
// Output:
// "Real and Equal Roots"
// "Real and Distinct Roots"
// "Imaginary Roots"
// 📌 Hint: Use discriminant D = b² - 4ac
// (No logical operators) 
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int a = input.nextInt();
    System.out.println("enter");
    int b = input.nextInt();
    System.out.println("enter");
    int c = input.nextInt();
    int d=b*b-4*a*c;
    if(d==0){
      System.out.println("Real and Equal Roots ");
    }else{
      if(d>0){
        System.out.println("Real and Distinct Roots");
      }else{
        
          System.out.println("Imaginary Roots");
        }
      }
    }
  }


// 🔹 Q2. ATM Machine Simulation
// Input:
// Balance
// Withdraw amount
// Output:
// "Insufficient Balance"
// "Invalid Amount" (if amount ≤ 0)
// "Transaction Successful"
//📌 Only nested if 
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int balance = input.nextInt();
    System.out.println("enter");
    int withdraw_amount = input.nextInt();

    if (withdraw_amount >= 0) {
      if (withdraw_amount <= balance) {
        System.out.println("tansaction succesfull");
      } else {
        System.out.println("Insufficient Balance");
      }
    } else {
      System.out.println("invalid amount");
    }
  }
}



// 🔹 Q2. ATM Machine Simulation
// Input:
// Balance
// Withdraw amount
// Output:
// "Insufficient Balance"
// "Invalid Amount" (if amount ≤ 0)
// "Transaction Successful"
//📌 Only nested if 
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int a = input.nextInt();
    System.out.println("enter");
    int b = input.nextInt();
    System.out.println("enter");
    int c = input.nextInt();
    if(a+b>c){
      if(a+c>b){
        if(b+c>a){
          int largest=a;
          if(largest<b){
            largest=b;
          }if(largest<c){
            largest=c;
          }if(largest==a){
            if(a*a>=b*b+c*c){
              System.out.println("tri");
            }else{
              
              System.out.println("po");
            }
          }
        }
      }
    }
  }
}




// Input: A 3-digit number
// Condition:
// Reverse the number
// If original number + reverse number is palindrome → print "Magic"
// Otherwise → print "Normal"
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int x = input.nextInt();// 123
        int revese = ((x / 100) + ((x / 10) % 10) * 10 + (x % 10) * 100);
        System.out.println(revese);
        int sum = x + revese;
        System.out.println(sum);
        int revers=0;
        if (sum >= 100 && sum <= 999) {
            revers = ((sum / 100) + ((sum / 10) % 10) * 10 + (sum % 10) * 100);
        } else {
            if (sum >= 1000 && sum <= 9999) {
                revers = ((sum % 10) * 1000 + ((sum / 10) % 10) * 100 + ((sum / 100) % 10) * 10 + (sum / 1000));
            }
        }
            if (sum == revers) {
                System.out.println("magic");
            }else{
System.out.println("normal");
            }
         
        }
    
        }
    

//1. Sum of Even and Odd Numbers
// 1 se 50 tak:
// Even numbers ka sum
// Odd numbers ka sum
// Agar even sum > odd sum → print "Even sum is greater" else "Odd sum is greate
import java.util.Scanner;
public class Mains{
    public static void main(String[] args) {
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=50;i++){
            if(i%2==0){
                sumeven+=i;

            }else {
                sumodd+=i;
            }
        }
     if(sumeven>sumodd){
        System.out.println("even sum is greater");
     }else{
        System.out.println("odd sum is greater");
     }
    }
}

//. Factorial of Even Numbers Only

// 1 se 10 tak:

// Agar number even → factorial calculate karo aur print karo

// Odd → skipater" 
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                int factorial = 1;

                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                System.out.println("factorial=" + i + " " + factorial);
            }

        }//. k 4-digit number input lo.
// Loop ka use karke digits nikaalo aur sum calculate karo.
// Phir condition lagao:
// Agar digit sum > 25 ho → check karo number Armstrong hai ya nahi
// Agar digit sum == 25 ho → check karo number reverse ke barabar hai ya nahi
// Agar digit sum < 25 ho → check karo number prime hai ya nahi
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n= input.nextInt();
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;
                    sum  +=digit;

        }
          System.out.println("sum"+sum);
          if(sum<25){
            int arm=0;
            for(int temp = 1234; temp > 0; temp /= 10){
                        int digit = temp % 10;
                        arm+=digit*digit*digit*digit;

            }
            System.out.println("arm"+arm);
            if(arm==n){
                System.out.println("Armstrong");
            }else{
                System.out.println("not Armstrong");
            }
          }
          else if(sum<=25){
            int revese=0;
            for(int temp = 1234; temp > 0; temp /= 10){
             int digit = temp % 10;
        revese=revese*10+10;
            }
            System.out.println("revese"+revese);
            if(revese==n){
                System.out.println("reverse ke brabar hai");
            }else{
                System.out.println("not equeal");
            }
          }  
        }
    }
        

    }
}



//.Question 2 (Thoda aur tricky)
// Ek 5-digit number input lo.
// Loop se:
// Even digits ka sum nikalo
// Odd digits ka sum nikalo// Phir:
// Agar even sum > odd sum → check karo number 7 se divisible hai ya nahi
// Agar even sum < odd sum → number ka square nikaalo
// Agar dono equal ho → check karo palindrome hai ya nahime hai ya nahi
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int evensum = 0;
        int oddsum = 0;
        for (int temp = n; temp > 0; temp /= 10) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
        }
        if (evensum > oddsum){
            if (n % 7 == 0) {
                System.out.println("devisible ");

            } else {
                System.out.println("not divisible");
            }
        }
        else if (evensum < oddsum) {
            int squere = n * n;
            System.out.println("squre" + squere);
        }
    else{
       int revese=0;
       for (int temp = n; temp > 0; temp /= 10){
        int digit=temp%10;
        revese=revese*10+digit;
       } 
       if(revese==n){
        System.out.println("palindrome");
       }else{
        System.out.println(" not palindrome");
       }
    }
}}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int sum1 = 0;
      int sum2=0;
      
      for (int i = 100; i <= 400; i++) {

         if (i % 3 == 1 ) {
         
            sum1+=i;
         } if(i%4==2){
            sum2+=i;
         }
      }
      System.out.println(sum1);
      System.out.println(sum2);
      int difference=sum1-sum2;
      System.out.println("the difference is"+difference);
      
      if(difference>0){
         System.out.println("positive");
      }else{
         System.out.println("negative");
      }
      }
   }


*****//character A to z and check vowel or if consonent then check even and odd
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        for (char ch = 'A'; ch <= 'z'; ch++) {
            if (ch >= 91 && ch < 97)
                continue;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E'
                    || ch == 'O' || ch == 'U') {
                System.out.println("vowel=" + ch);
            } else {
                int a = ch;
                if (a % 2 == 0) {
                    System.out.println(a+"=even");
                } else if (a % 2 != 0) {
                    System.out.println(a+"=odd");
                }

            }
        }

    }
}

////find binary division

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int n = 20;
    String str="";
for (int i = n; i > 0; i /= 2){
    int que=i%2;
    str=que+str;
    System.out.println(que);
    //     String binary = "";

    //     for (int i = n; i > 0; i /= 2) {
    //         binary = (i % 2) +binary;
    //     }

    //     System.out.println(binary);
    // }
}
}
      
    
// Write a Java program:

// Loop chalega 'a' se 'z' tak

// Agar character vowel ho → uska ASCII value add karo

// Agar character consonant ho → uska ASCII value subtract karo

// Lekin:

// Agar character 'm' aaye → loop stop ho jaye

// Agar character 'e' aaye → usko skip karo (add/subtract nahi karna)

// Finally sum print karo.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
    
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch == 'm') {
                break;

            }
            if (ch == 'e') {
                continue;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // if (ch == 'e') {
                // continue;

                // }
                // if (ch == 'm') {
                // break;
                // }

                sum +=ch;

            } else {

                sum -=ch;
                 
            }

        }
        System.out.println("sum="+sum);
    }
}

// /Loop chalega 'A' se 'z' tak.

// But:

// Alphabet characters hi consider karna hai
// (Matlab ASCII gap 'Z' to 'a' skip karna hai automatically logic se)

// Agar character uppercase hai →
// usko lowercase me convert karo using ASCII math

// Agar character lowercase hai →
// usko uppercase me convert karo using ASCII math

// Lekin:

// Agar character 'K' aaye → skip karo

// Agar character 'x' aaye → loop stop karo

// Har converted character ka ASCII difference accumulate karo:
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (char ch = 'A'; ch <= 'z'; ch++) {
            if (ch >= 91 && ch <= 96) {
                continue;
            }
            if (ch == 'Y') {
                break;

            }
            if (ch == 'K') {
                continue;
            }
            char converter;
            if (ch >= 'A' && ch <= 'Z') {
                converter = (char) (ch + 32);

            } else {
                converter = (char) (ch - 32);
            }
            sum += (converter - ch);
        }
        System.out.println("sum" + sum);
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int digit = 0;
        int n = 123456789;
        for (int i = n; i > 0; i /= 10) {
            
            digit = i % 10;
            if(digit==8){
                break;
            }
            boolean isprime = true;
            for (int j = 2; j <= digit; j++) {
                if (digit % j == 0) {
                    isprime = false;
                }
            }
                if (isprime) {
                    System.out.println("prime");
                } else {
                    System.out.println("composite");
                }

            }

        }
    }
public class Mains {
    public static int countDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigit(number / 10);
    }

    public static int sumDigit(int number) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return digit + sumDigit(number / 10);
    }

    public static int reverseDigit(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        return reverseDigit(number / 10, reverse);
    }

    public static int largestDigit(int number, int largest) {
        if (number == 0) {
            return largest;
        }
        int digit = number % 10;
        if (digit > largest) {
            largest = digit;
        }
        return largestDigit(number / 10, largest);
    }

    public static int secondlargestDigit(int number, int secondlargest, int largest) {
        if (number == 0) {
            return secondlargest;
        }
        int digit = number % 10;
        if (digit > largest) {
            secondlargest = largest;
            largest = digit;

        } else if (digit < largest && digit > secondlargest) {
            secondlargest = digit;
        }
        return secondlargestDigit(number / 10, secondlargest, largest);
    }

    public static String isPalindrome(int number, int reverse) {
        int reversed = reverseDigit(number, reverse);
        return (number == reversed) ? "is Palindrome" : "is not Palindrome";
    }

    public static int PowerDigit(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * PowerDigit(base, exp - 1);
    }

    public static int sumOfPowerDigit(int number ,int counts) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return PowerDigit(digit, counts);
    }

    public static String isArmstrong(int number,int counts) {

        return (number == sumOfPowerDigit(number,counts)) ? "it is armstrong" : "it is not armstrong";
    }

    public static boolean isAutomorphic(int number, int square) {
        if (number == 0) {
            return true;
        }
        if (square % 10 != number % 10) {
            return false;
        }
        return isAutomorphic(number / 10, square / 10);
    }

    public static String Automorphic(int number, int square) {
        return isAutomorphic(number, square) ? "It is automorphic" : "it is not automorphic";
    }

    public static int sumUntilSingle(int number) {
        if (number <= 9) {
            return number;
        }

        return sumUntilSingle(sumDigit(number));
    }

    public static void main(String[] args) {
        int number = 123532;
        int reverse = 0;
        int largest=0;
        int square=number*number;
        int secondlargest=0;
        int counts=countDigit(number);
        int call=1;
        switch (call) {
            case 1:
               System.out.println(sumDigit(number)); 
                break;
                case 2:
               System.out.println(countDigit(number)); 
                break;
                case 3:
               System.out.println(isArmstrong(number, counts)); 
                break;
                case 4:
               System.out.println(isPalindrome(number, reverse)); 
                break;
                case 5:
               System.out.println(isAutomorphic(number, square)); 
                break;
                case 6:
               System.out.println(largestDigit(number, largest)); 
                break;
                case 7:
               System.out.println(secondlargestDigit(number, secondlargest, largest)); 
                break;
        
            default:
                break;
        }
    }
}
