public class firstprogram{
    public static void main(String[]args){
        System.out.println("menika");
        }
}


public class Incre {
    public static void main(String[] args) {
    System.out.println("hello Menika");
    System.out.println(7);
    System.out.println("7");
    System.out.println(7.1);
    System.out.println("7.1");
    System.out.println('a');
    System.out.println("a");
    System.out.println(false);
    System.out.println("This is a string:"+"hello Menika");
    System.out.println("This is a integer:"+7);
    System.out.println("This is a string"+"7");
    System.out.println("This is a string:"+7.1);
    System.out.println("This is a string:"+"7.1");
    System.out.println("This is a string:"+'a');
    System.out.println("This is a string:"+"a");
    System.out.println("This is a string:"+false);
     

    byte b=10;
    System.out.println(b);
    short s=12;
    System.out.println(s);
    int i=12;
    System.out.println(i);
    long l=123455678898765l;
    System.out.println(l);
    
    
    }
    }

    public class Mains {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;
        int z = 10;
        System.out.println("arthmetic operation");
        System.out.println("the sum is :" + (x + y));
        System.out.println("the sub is :" + (x - y));
        System.out.println("the mul is :" + (x * y));
        System.out.println("the div is :" + (x / y));
        System.out.println("the mod is :" + (x % y));
        System.out.println("relation operator");
        System.out.println("x==y:?" + (x == y));
        System.out.println("x!=y:?" + (x != y));
        System.out.println("x<=y:?" + (x <= y));
        System.out.println("x>=y:?" + (x >= y));
        System.out.println("x<=z:?" + (x <= z));
        
        // logical operation
        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.println("a&&b" + (a && b));
        System.out.println("a||b" + (a || b));
        System.out.println("b&&c" + (b && c));
        System.out.println("a&&b" + (!b));
        System.out.println("a&&b" + (!c));

        // bitwise operator
        int x1 = 5;
        int y2 = 3;
        System.out.println("x1&x2" + (x1 & y2));
        System.out.println("x1|x2" + (x1 | y2));
        System.out.println("~x1" + (~x1));
        System.out.println("x1&x2" + (~y2));
       System.out.println("increment and decrement operater");
int x3=7;
System.out.println("x++"+(x3++));
System.out.println("++x"+(++x3));
System.out.println("x--"+(x3--));
System.out.println("--x"+(--x3));
    

System.out.println("bitwise operator");
        int p = 5;
        int q = 3;
        System.out.println("p|q" + (p | q));
        System.out.println("p&q" + (p & q));
        System.out.println("~q" + (~q));
        System.out.println("p|q" + (p | q));
        System.out.println("~p" + (~p));
        System.out.println("p^q"+(p^q));
    }
}


  //Different types of Variables

public class Main {
    //Instance Variable
    int y=90;

    //static Variable
   static String str1="menika";

    public static void main(String[] args) {
        //local Variable
        int x=10;
        System.out.println(x);

        //local Variable
        String str="kushwaha";
        System.out.println(str);

        Main obj=new Main();
        System.out.println(obj.y);

        System.out.println(Main.str1);
        
    }
}  

public class Main {
    int y=50;
    static int z=40;
    public static void main(String[] args) {

        System.out.println("range of byte" + Byte. MAX_VALUE+"TO"+Byte.MIN_VALUE);
        System.out.println("range of int "+Integer.MAX_VALUE+"to"+Integer.MIN_VALUE);
        System.out.println("range of short "+Short.MAX_VALUE+"to"+Short.MIN_VALUE);
        System.out.println("range of long"+Long.MAX_VALUE+"to"+Long.MIN_VALUE);
        int x=10;
        System.out.println(x);
        byte b=20;
        System.out.println(b);
        short s=30;
        System.out.println(s);
        long l=203456729;
        System.out.println(l);
        float f=2.12f;
        System.out.println(f);
        double d=2.123456;
        System.out.println(d);
        Main obj=new Main();
     System.out.println(obj.y);
System.out.println(z);
    }
    
}




public class Demo {
 public static void main(String[] args) {
  int x=10;
    int y=3;
    float z=x%y;
int i=10;
float f=3;
float t=i%f;
  int j=10;
  float l=3;
  double o=j%l;
    System.out.println(z);
    System.out.println(t);
    System.out.println(o);
    System.out.println(x%y);
    System.out.println(i%f);
    System.out.println(j%l);
    }
}

public class TypeCasting {
 public static void main(String[] args) {
    //implicit typecasting or automatic typecasting
    byte b=10;
    short s=b;
    int i=s;
    long l=i;
    float f=l;
    double d=f;
    System.out.println("byte b=10:"+b);
    System.out.println("short s=b"+s);
    System.out.println("int i=s"+i);
    System.out.println("long l=i"+l);
    System.out.println("float f=l"+f);
System.out.println("double =d"+d);
    //explicit 
    double d1=130.98;
    float f1=(float)d1;
    long l1=(long)f1;
    int i1=(int)l1;
    short s1=(short)i1;
    byte b1=(byte)s1;
    System.out.println("double d1=130.98:"+d1);
    System.out.println("float f1=b:"+f1);
    System.out.println("long l1=s:"+l1);
    System.out.println("int i1=i:"+s1);
    System.out.println("byte b1=f"+b1);
}
}

public class Condition {
    public static void main(String[] args) {
        int marks = 80;
        if (marks >= 90) {
            System.out.println("A+");

        } else if (marks >= 80) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("B+");
        } else if (marks >= 40) {
            System.out.println("C");
        }else if(marks>=30){
            System.out.println("D");
    }else{
        System.out.println("fail");
    }
}
}

mport java .util.Scanner;
public class Condition {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("put the value of x ");
        int x=input.nextInt();
        System.out.println("put the value of y");
        int Y=input.nextInt();
        int z=x%Y;
        System.out.println("modulo of:="+z);
        
        if(x%2==0){
            System.out.println("This number is even");
        }else{
            System.out.println("This number is odd"); 
    }
}
}



public class Condition {
    public static void main(String[] args) {
        int x=90;
        if (x>=0) {
            System.out.println("This is positive");

        } else {
            System.out.println("This is positive");
        }
}
}

public class Positive {
    public static void main(String[] args) {
        int x=121;
        int remainder5=x%5;
        int remainder11=x%11;
        int sum=remainder5+remainder11;
        if(sum%15==0){
            System.out.println("divisible by 15");
        }else{
            System.out.println("not divisible by 15");
        }
    }
}




import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();

        if (x % 5 == 3 && x % 3 == 2) {

            int quotient5 = x / 5;
            int quotient3 = x / 3;
            int z = quotient5 + quotient3;
            System.out.println("addition of quotient:" + z);

        } else {
            System.out.println("condition is not satisfied :");
            input.close();

        }
    }
}


import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        int quotient3 = x / 3;
        if (x % 3 == 0) {

            if (quotient3 % 5 == 0)
                System.out.println("condition is true");

        } else {
            System.out.println("condition is not true :");
            input.close();

        }
    }
}

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int x = input.nextInt();
        
        if (x % 3 == 0) {
            int quotient3 = x / 3;

            if (quotient3 % 5 == 0)
                System.out.println("condition is true");

        } else {
            System.out.println("condition is not true :");

        }else{
               if(x%2==0){
            System.out.println("even");

        }else{
            System.out.println("odd");
        }
    }
}
}

public class Main {
    public static void main(String[] args) {

        int x = 345678;

        if (x % 3 == 0) {
            int x1 = x % 100;// 78
            x = x / 100;// 3456
            int x2 = x % 100;// 56
            x = x / 100;// 34
            int x3 = x % 100;
            int sum = (x1 + x2 + x3);

            if (sum % 3 == 0) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }

        } else {
            int y1 = x % 1000;
            x = x / 1000;
            int y2 = x % 1000;
            x = x / 1000;
            int sum1 = (y1 + y2);
            if (sum1 % 3 == 0) {
                System.out.println("yes2");
            } else {
                System.out.println("no2");
            }
            else if (x % 2 == 0) {
                System.out.println("even");
            }

            else {
                System.out.println("odd");

            }
        }
    }
}


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
**********calculator
 public class Main {
    public static void main(String[] args) {
        
        System.out.println("enter input");
         double a=10;
         double b=5;
         char operator='/';
         if(operator=='+'){
            System.out.println("sum is"+(a+b));
         }else if(operator=='-'){
            System.out.println("sum is"+(a-b));
         }else if(operator=='*'){
            System.out.println("sum is"+(a*b));
         }else if(operator=='/'){
            if(b!=0){
            System.out.println("sum is"+(a/b));
         }else 
            System.out.println("invalid input");
         }
        
    }
}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter input");
      int number = input.nextInt();
      if(number>=10&&number<=20){
         System.out.println("in range");
      }else{
         System.out.println("not");
      }
   }
}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     int day=1;
     switch(day){
      case 1:
         System.out.println("Monday");
         break;
         case 2:
         System.out.println("TUesday");
         break;
         case 3:
         System.out.println("Wednesday");
         break;
         case 4:
         System.out.println("Thrusday");
         break;
         case 5:
         System.out.println("Friday");
         break;
         case 6:
         System.out.println("Saturday");
         break;
         case 7:
         System.out.println("Sunday");
         break;
         
     }
   }
}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     int month=1;
     switch(month){
      case 1:
         System.out.println("31");
         break;
         case 2:
            
         System.out.println("28");
         break;
         case 3:
         System.out.println("31");
         break;
         case 4:
         System.out.println("30");
         break;
         case 5:
         System.out.println("31");
         break;
         case 6:
         System.out.println("30");
         break;
         case 7:
         System.out.println("31");
         break;
         case 8:
         System.out.println("31");
         break;
         case 9:
         System.out.println("30");
         break;
         case 10:
         System.out.println("31");
         break;
         case 11:
         System.out.println("30");
         break;
         case 12:
         System.out.println("31");
         break;
         default:
            break;

     }
   }
}


import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int month = 1;
      switch (month) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 11:
         case 12:
            System.out.println("31");
            break;
         case 2:
            System.out.println("28");
            break;
         case 4:
         case 6:
         case 9:
         case 10:
            System.out.println("30");
      }
   }
}

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 9;
        int z = 11;
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        System.out.println("the largest:" + largest);
    }
}


import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 9;
        int z = 11;
        int largest ;
        if (x > y) {
            
            if(x>z){
                largest=x;
            }else{
                largest=z;
            }
        }else{
            if(y>z){
                largest=y;
            }else{
                largest=z;
            }
        }
        System.out.println("largest"+largest);
        }


        import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 9;
        int z=11;
        int largest=(x>y)?(x>z?x:y):(y>z?y:z);
        System.out.println("largest element is:"+largest);
    }      
}

        
}
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 3;
        int y = 9;
//         int largest;
// if(x>y){
//     largest=x;
// }else{
//     largest=y;
// }
    int largest=(x>y)?x:y;
    System.out.println(largest);
        }
        
}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      int root= (int)Math.sqrt(n);
      
      if(root*root==n){
         System.out.println("perfect square");
      }else{
         System.out.println("not ");
      }
   }
}




import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      int root= (int)n/2;
      
      if(root*root==n){
         System.out.println("even");
      }else{
         System.out.println("odd ");
      }
   }
}



///find even or odd

///question 17
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int x=4;
      int num=x/2;
   if(num*2==x){
      System.out.println("even");
   }else{
      System.out.println("odd");
   }
      
      
       
   }
}


///find even and odd using bitwise
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     // Scanner input = new Scanner(System.in);
      int x = 5;

      if ((x & 1) == 0) {
         System.out.println("even");
      } else {
         System.out.println("odd");
      }

   }
}

 
///find even and odd using bitwise
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     // Scanner input = new Scanner(System.in);
      int number = 397;
      int mod1=number%10;
      number=number/10;
      int mod2=number%10;
      number=number/10;
      int mod3=number%10;
      int largest=mod1;
      
        if (mod2 > largest) {
            largest = mod2;
        }
        if (mod3 > largest) {
            largest = mod3;
        }
        System.out.println("the largest:" + largest);
    }
}

   

//d
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int x = input.nextInt();
    if (x % 2 == 0) {
      if (x % 3 == 0) {
        System.out.println("divisible by 2 and 3");
      } else {
        
          System.out.println("divisible only 2");
        
      }
    } else {
      if (x % 3 == 0) {
        System.out.println("divisible by only 3");
      } else {
        System.out.println("not divisible by 2and 3");
      }
    }
  }
}
 
//d
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int x = input.nextInt();
    System.out.println("enter");
    int y = input.nextInt();
    System.out.println("enter");
    int z = input.nextInt();
    System.out.println("enter");
    int w = input.nextInt();

    int max1, max2, largest;
    if (x > y) {
      max1 = x;
    } else {
      max1 = y;
    }
    if (z > w) {
      max2 = z;
    } else {
      max2 = w;
    }
    if (max1 > max2) {
      largest = max1;
    } else {
      largest = max2;
    }
    System.out.println("larest" + largest);
  }
}


   
//leap year
import java.util.Scanner;

public class Mains {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter");
    int year= input.nextInt();
    if(year%400==0){
      
        System.out.println("leap year");
      }else{
       if(year%4==0){
        if(year%100!=0){
          System.out.println("leap year");
        }else{
          System.out.println("not leap year");
        }
       }else{
       System.out.println("not leap year");
       }
        
      }
    }
  }
  

  import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        String role = "admine";
        switch (role) {
            case "admine":
                System.out.println("welcome to admine ");
                break;
            case "user":
                System.out.println("welcome to user");
                break;
            case "guest":
                System.out.println("welcome to guest");
                break;
            case "supper admine":
                System.out.println("welcome to supper admine");
                break;
            default:
                System.out.println("you are not allowed to enter the system");
        }
    }
}

import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        int department = 3;
        int year = 5;
        switch (department) {
            case 1:
                switch (year) {
                    case 1:
                        System.out.println("computer science department 1st year");
                        break;
                    case 2:
                        System.out.println("computer science department 2nd year");
                        break;
                    case 3:
                        System.out.println("computer science department 3rd year");
                        break;
                    case 4:
                        System.out.println("computer science department 4rt year");
                        break;
                    default:
                        System.out.println("invalid branch");

                }
                break;
            case 2: 
                switch (year) {

                    case 1:
                        System.out.println("CSIT department 1st year");
                        break;
                    case 2:
                        System.out.println("CSIT science department 2nd year");
                        break;
                    case 3:
                        System.out.println("CSIT science department 3rd year");
                        break;
                    case 4:
                        System.out.println("CSIT science department 4rt year");
                        break;
                    default:
                        System.out.println("invalid branch");
                }
            break;

            case 3: 
                switch (year) {

                    case 1:
                        System.out.println("mechenical department 1st year");
                        break;
                    case 2:
                        System.out.println("mechenical science department 2nd year");
                        break;
                    case 3:
                        System.out.println("mechenical science department 3rd year");
                        break;
                    case 4:
                        System.out.println("CSIT science department 4rt year");
                        break;
                    default:
                        System.out.println("invalid branch");
                        break;
                }
            break;
            case 4: 
                switch (year) {

                    case 1:
                        System.out.println("electrical department 1st year");
                        break;
                    case 2:
                        System.out.println("electrical  department 2nd year");
                        break;
                    case 3:
                        System.out.println("electrical department 3rd year");
                        break;
                    case 4:
                        System.out.println("electricai department 4rt year");
                        break;
                    default:
                        System.out.println("invalid branch");
                }
                break;
            default:
    System.out.println("invalid");
            }
        }
        }
    



import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
       // for(int i=0;i<=10;i++){
            for(int i=10;i>=0;i--){
            System.out.println(i+"  hello world");
        }
    }
}
}


//1to100
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     // Scanner input=new Scanner(System.in);
      
      for(int i=1;i<=100;i++){ 
         System.out.print(i+" ");
             
   }
} 
}   
  
/////using while and do loop 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=100){
        //     System.out.println(i);
        //     i++;
        // }
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=100);
    }
}
         

  


//56 to 23 where 56 is not include and 23 is incude
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
   
      
      for(int i=55;i>=23;i--){ 
         System.out.print(i+" ");
             
   }
} 
}
//use while and do loop
public class Main {
    public static void main(String[] args) {
        // int i = 55;
        // while (i >= 23) {
        //     System.out.println(i);
        //     i--;
        // }
        int i=55;
        do {
            System.out.println(i);
            i--;
        }while(i>=23);
    }
}

  

//print even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      for (int i = 1; i <= 100; ++i) {
         if (i % 2 == 0){
            System.out.print(i + " ");
         }

      }
   }
}


//print even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      for (int i = 1; i <= 100; ++i) {
         if (i % 2 == 0){
         }else{
            System.out.print(i + " ");

         }

      }
   }
}

///***use do and while loop
public class Main {
    public static void main(String[] args) {
      
        // int i=1;
        // while(i<=100){
        //     if(i%2==0){ 
        //         System.out.println(i);
                
        //     }
        //     ++i;
        
    //}
    int i=1;
    do{
        if(i%2==0){
        System.out.println(i);}
        i++;
    }while(i<=100);
    }
}

//print even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      for (int i = 1; i <= 100; ++i) {
         if ((i & 1) == 0){
            System.out.print(i + " ");
         }

      }
   }
}

 
//print even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      for (int i = 1; i <= 100; ++i) {
         if (i % 2 != 0) {

         } else {
            System.out.print(i + " ");

         }

      }
   }
}
        

//print even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      for (int i = 1; i <= 100; ++i) {
         if (i % 2 == 1) {
            continue;
         }
         System.out.print(i + " ");

      }

   }
}


//add 1to100
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int sum = 0;
      for (int i = 1; i <= 100; i++) {
         sum += i;

      }
      System.out.print("sum is" + sum);

   }
}

*****????use while and do loop
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            ++i;

        }
        System.out.println("sum" + sum);

        // }
        // int sum=0;
        // int i=1;
        // do{
        // sum+=i;
        // i++;
        // }while(i<=100);
        // System.out.println("sum"+sum);
    }




//add 1to100
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int n=100;
      int sum1=(n*(n+1))/2;
      System.out.println(sum1);
      int sum = 0;
      for (int i = 1; i <= 100; i++) {
         sum += i;

      }
      System.out.print("sum is:" + sum);

   }
}

//add even
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      int sum = 0;
      for (int i = 1; i <= 100; i++) {
         if (i % 2 == 0) {
            sum += i;

         }

      }
      System.out.print("sum is:" + sum);

   }
}


//find alll number from 300to600 which after div by 5is rem 3
//8div rem 4
//after add and check even odd
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int sum = 0;
      for (int i = 300; i <= 600; i++) {

         if (i % 5 == 3 && i % 8 == 4) {
            // System.out.println(i);
            sum += i;
         }
      }

      System.out.println(sum);
      if (sum % 2 == 0) {
         System.out.println("even");
      }else{
         System.out.println("odd");
      }

   }

}



//find alll number from 300to600 which after div by 5is rem 3
//8div rem 4
//after count
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int count = 0;
      for (int i = 300; i <= 600; i++) {

         if (i % 5 == 3 && i % 8 == 4) {
         
            count++;
         }
      }
      System.out.println("the count is"+ count);

   }

}

 

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
      }else if(difference==0){
         System.out.println("zero");
      }else{
         System.out.println("negative");
      }
      }
   }

use while and do loop
   public class Main {
    public static void main(String[] args) {
        int sum1=0,sum2=0;
//        int i=100;
//        while(i<=400){
//         if(i%3==1){
// sum1+=i;
//         }if(i%4==2){
//             sum2+=i;
//         }
//         i++;
//        }
int i=100;
do{
    if(i%3==1){
        sum1+=i;
    }if(i%4==2){
        sum2+=i;
    }i++;

}while(i<=400);
       int difference=sum1-sum2;
       System.out.println(difference);
       if(difference>0){
        System.out.println("positive");
       }else{
        System.out.println("negative");
       }
    }
}



 ///while and do loop

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // int i=0;
      // while(i<=4){
      //    System.out.println("hello world");
      //    i++;
      //
      //}
      int i=0;
      do{
         System.out.println("hello world");
         i++;
      }while(i<=4);
   }
}
//find factorial

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int factorial=1;
      for(int i=1;i<=5;i++){
         factorial*=i;

         System.out.println("factorial:"+factorial);
      }
      System.out.println("factorial:"+factorial);
   }
}


//find factorial

public class Main {
   public static void main(String[] args) {
      int sum1 = 0;
      int sum2=0;
      
     // for (int i = 10; i <= 40; i++) {
// int i = 10;
// while(i <= 40){
//          if (i % 3 == 1 ) {
         
//             sum1+=i;
//          } else if(i%4==2){
//             sum2+=i;
//          }
//             i++;

//       }
int i=10;
do{
 if (i % 3 == 1 ) {
         
            sum1+=i;
         } else if(i%4==2){
             sum2+=i;
          } 
          i++; 
}while(i <= 40);
      System.out.println(sum1);
      System.out.println(sum2);
      int difference=sum1-sum2;
      System.out.println("the difference is"+difference);
      
      if(difference>0){
         System.out.println("positive");
      }else if(difference==0){
         System.out.println("zero");
      }else{
         System.out.println("negative");
      }
      }
   }
}

public class Main {
    public static void main(String[] args) {
        int n = 120;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
find factor 
public class Main {
    public static void main(String[] args) {
        int n = 120;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
System.out.println(n+" ");
    }
}

///use while and do
public class Main {
    public static void main(String[] args) {
      //  int n=120;
       // int i=1;
        // while(i<=n/2){
        //     if(n%i==0){
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        // System.out.println(n);
        int n=120;
        int i=1;
        do{
          if(n%i==0){
                 System.out.println(i);
            }
            i++;  
        }while(i<=n);
System.out.println(n);
        
    }
}



   import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;

        int n = 120;
        if(n%2==0){
            count=1;
        }else{
            count=0;
        }
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    count++;

                }
            }
        }
        System.out.println(count);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumodd = 0;
        int evensum = 0;
        int n = 120;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    evensum += i;
                } else {
                    sumodd += i;
                }
            }
        }
        int difference = sumodd - evensum;
        System.out.println("difference" + difference);

    }
}
table of 5
public class Main {
    public static void main(String[] args) {
        
      for(int i=1;i<=50;i++)
if(i%5==0){ 
System.out.println(i);}
      } 
      }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        for (int i = n; i > 0; i /= 10) {

            count++;
        }
        System.out.println("count"+count);
    }
}
         
//count even and odd in digit
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3458762;
        int counteven = 0;
        int countodd = 0;
        for (int i = n; i != 0; i /= 10) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                counteven++;

            } else {
                countodd++;
            }
        }
        System.out.println("even count is"+counteven);
        System.out.println("odd count is"+countodd);
    }

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3458762;
        int sum = 0;
        
        for (int i = n; i != 0; i /= 10) {
            int digit = i % 10;
           sum+=digit;
           
        }
        System.out.println(" sum is"+sum);
        
    }

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3458762;
        int evensum = 0;
        int oddsum = 0;
        for (int i = n; i != 0; i /= 10) {
            int digit = i % 10;
            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
        }
        int difference = evensum - oddsum;
        boolean isprime = true;
        for (int i = 2; i <= difference / 2; i++) {
            if (difference % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
////check palindrome


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 1111;

        int reverse = 0;
        for (int i = n; i != 0; i /= 10) {
            int digit = i % 10;
            reverse = reverse*10+digit;
        }
        if (n == reverse) {
            System.out.println(n + "it is palindrom");
        } else {
            System.out.println(n + "not palindrom");
        }

    }
}

// armstrong 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 153;
        int temp = number;
        int count = 0;
        int sum = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp=temp/10;
        }
        if (sum == number) {
            System.out.println("armstrong  number");
        } else {
            System.out.println("not armstrong");
        }
    }
}


// armstrong 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 126;
        int temp = number;
        int count = 0;
        int sum = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            count--;
            temp = temp / 10;
        }
        if (sum == number) {
            System.out.println(" disarium number");
        } else {
            System.out.println("not disarium");
        }
    }
}


//Palindrome Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
        System.out.println("The Palindrome Numbers  ");
        for (int i = 1; i <=1000; i++) {
            int originalNumber=i;
            int reverseNumber=0;
            int temp=i;

            while (temp!=0) {
                int digit=temp%10;
                reverseNumber=reverseNumber*10+digit;
                temp=temp/10;
                
            }
            if (originalNumber==reverseNumber) {
                System.out.print(originalNumber+" ");
                
            }
            
        }
    }
}


//Palindrome Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
        System.out.println("The Palindrome Numbers  ");
        int count=0;
        for (int i = 1; i <=1000; i++) {
            int originalNumber=i;
            int reverseNumber=0;
            int temp=i;

            while (temp!=0) {
                int digit=temp%10;
                reverseNumber=reverseNumber*10+digit;
                temp=temp/10;
                
            }
            if (originalNumber==reverseNumber) {
                if(reverseNumber%2==0){
                    count++;
                }
                
            }
            
        }
        System.out.println("count"+count);
    }
}


//armstrong  Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
        System.out.println("The Palindrome Numbers  ");
        for (int i = 1; i <= 1000; i++) {
            int originalNumber = i;
            int sum = 0;
            int temp = i;
            int count = 0;

            while (temp != 0) {
                int digit = temp % 10;
                count++;
                temp = temp / 10;

            }
            temp = originalNumber;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                count--;
                temp = temp / 10;

            }
            if (sum == originalNumber) {
                if(originalNumber>=10&&originalNumber<=99){ 
                System.out.print( originalNumber+" ");
            }

        }

    }
}
}
//strong  Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {

            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {

                if (number % i == 0) {
                    sum += i;

                }
            }
            if (number == sum) {
                System.out.println(number + " ");
            }
        }
    }
}

//strong  Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {

            int number = i;

            int sum = 0;
            for (int temp = number; temp > 0; temp /= 10) {
                int digit = temp % 10;
                int factorial = 1;
                for (int j = 1; j <= digit; j++) {
                    factorial *= j;
                }
                sum += factorial;

                if (sum == number) {
                    System.out.println("strong number" +sum);
                } else {
                    continue;
                }

            }
        }
    }
}

//octol to decimal
public class Main {

    public static void main(String[] args) {
        int octol = 101;
        int temp = octol;
        int decimal = 0;
        int power = 0;

        while (temp != 0) {
            int digit = temp % 10;
            decimal += digit * Math.pow(8, power);

            power++;

            temp /= 10;

        }
        System.out.println("decimal number is" + decimal);

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int Number = input.nextInt();
        int temp = Number;

        while (temp != 0) {
            int digit = temp % 10;
            boolean isprime = true;
            if (digit <= 1) {
                 isprime = false;
             } else {
                for (int i = 2; i < digit; i++) {
                    if (digit % i == 0) {
                        isprime = false;
                        break;
                    }
                }
            }
            if (isprime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
            temp /= 10;
        }
    }
}

///****Method 
import java.util.Scanner;

public class Main {
    public static void print() {// Method declaretion
        System.out.println("hello world");// Method definition
    }

    public static void main(String[] args) {
        print();// Method calling
    }
}


public class Main {
    public static void print(String subject) {// Method declaretion
        System.out.println("Hello world" + subject);// Method definition
    }

    public static void main(String[] args) {
        String subject = "java";
        print(subject);// Method calling
        System.out.println("And teacher name is : Amit");
    }
}

//name alag hone se koi farak nahi hoga
public class Main {
    public static void print(String subject1) {// Method declaretion
        System.out.println("Hello world" + subject1);// Method definition
    }

    public static void main(String[] args) {
        String subject = "java";
        print(subject);// Method calling
    }
}


public class Main {
    public static void print() {
      String subject="java";
      System.out.println("hello world"+subject);
    }

    public static void main(String[] args) {
    print();
        
    }
}



public class Main {
    public static void print(String subject) {
        System.out.println("hello world" + subject);
    }

    public static void main(String[] args) {
        String subject = "java";

        print(subject);

    }
}



public class Main {
    public static void print(String name) {
        System.out.println("hello world" + name);
    }

    public static void main(String[] args) {
        String name = "menika";

        print(name);

    }
}



public class Main {
    public static String print(String name) {
        return name;
    }

    public static void main(String[] args) {
        String name = "menika";

        print(name);

    }
}


public class Main {
    public static void square() {
        int num = 2;
        int square = num * num;
        System.out.println(square);
    }

    public static void main(String[] args) {
        square();

    }
}

public class Main {
    public static void square(int num) {
        int square = num * num;
        System.out.println(square);
    }

    public static void main(String[] args) {
        int num = 2;

        square(num);

    }
}

public class Main {
    public static int square(int num) {
        int square = num * num;
        return square;
    }

    public static void main(String[] args) {
        int num = 5;

        int result = square(num);
        System.out.println("square is:" + result);
    }
}

//even or odd using method

public class Main {
    public static void isEven() {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        isEven();
    }
}

//even or odd using method

public class Main {
    public static void isEven(int num) {

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        int num = 10;

        isEven(num);
    }
}


//even or odd using method



//divisibily by 5 or 11

public class Main {
    public static void isDivisible() {
        int num = 15;
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("not divisible");
        }
    }

    public static void main(String[] args) {
        isDivisible();
    }
}

//divisibily by 5 or 11

public class Main {
    public static void isDivisible(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("not divisible");
        }
    }

    public static void main(String[] args) {
        int num = 55;

        isDivisible(num);
    }
}

//divisibily by 5 or 11

public class Main {
    public static boolean isDivisible(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 55;

        boolean result = isDivisible(num);
        if (result) {
            System.out.println("Divisible");
        } else {
            System.out.println("not Divisible");
        }
    }
}

public class Main {
    public static boolean isEven(int num) {

        return num % 2 == 0;
    }

    public static void Display(boolean result) {
        if (result) {
            System.out.println("It is Even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        int num = 5;
        boolean result = isEven(num);
        Display(result);
    }
}
///print sumusing method
public class Main {
    public static int sumOfNumber() {
        int sum = 0;
        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenOrOdd(int sum) {
        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void Display() {

        int sum = sumOfNumber();
        boolean result = isEvenOrOdd(sum);
        if(result){ 
        System.out.println("The sum is even");
        }else{
            System.out.println( "the sum is not even");
        }
    }

    public static void main(String[] args) {
        Display();
    }
}
//***print only prime digit using method
public class Main {
    public static boolean digitIsPrime(int digit) {

        
        if (digit <= 1) {
            return  false;
        }
        for (int i = 2; i <= digit / 2; i++) {
            if (digit % i == 0) {
            
                 return false;
    
            }
        }

        return true;
    }

    public static void display() {
        int number = 123456;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;

            boolean result = digitIsPrime(digit);
            if (result) {
                System.out.println(digit);

            }
            temp /= 10;

        }
    }

    public static void main(String[] args) {
        display();
    }

}

public class Main {
    public static int countOfDigit(int temp) {
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        int count = countOfDigit(temp);
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
           // count--;
            temp /= 10;

        }
        return sum == number;

    }

    public static void display() {
int number=153;
            if (isArmstrong(number)) {
                System.out.println("it is armstromg");
            } else {
                System.out.println("it is not armstrong");
            }
        }
    

    public static void main(String[] args) {
        display();
    }
}

//diseriam number
public class Main {
    public static int countOfDigit(int temp) {
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static boolean isDiseriam(int number) {
        int temp = number;
        int sum = 0;
        int count = countOfDigit(temp);
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            count--;
            temp /= 10;

        }
        return sum == number;

    }

    public static void display() {

        int number = 147;
        if (isDiseriam(number)) {
            System.out.println("it is diseriam");
        } else {
            System.out.println("it is not diseriam");
        }
    }

    public static void main(String[] args) {
        display();
    }
}

//Armstrong Number or Narcisist Number by Method

public class Main {
    public static int noOfDigits(int temp) {
        int noOfDigits = 0;
        while (temp != 0) {
            temp = temp / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    public static int armstrong(int num, int count) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num = num / 10;
        }
        return sum;
    }

    public static String check(int number) {
        int count = noOfDigits(number);
        int sum = armstrong(number, count);
        // if (sum == number) {
        //     return "Armstrong Number";
        // } else {
        //     return "Not Armstrong Number";
        // }
         return (sum == number) ? "Armstrong Number" : "Not Armstrong Number";
    }

    public static void main(String[] args) {
        int number = 1634;
        String str=check(number);
        System.out.println(str);

    }
}
public class Main {
    public static String isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (sum == number) ? "perfect Number"  :  "Not Perfect Number";
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println(isPerfect(number));
    }
}

//strong number
public class Main {
    public static int strong(int n, int sum) {
        while (n != 0) {
            int digit = n % 10;
            int fact = factorial(digit);

            sum = sum + fact;
            n = n / 10;
        }
        return sum;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void isStrong(int original, int sum) {
        if (original == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }

    public static void main(String[] args) {
        int original = 145;
        int n = original;
        int sum = 0;

        int result = strong(n, sum);
        isStrong(original, result);
    }
}
public class Mains {
    public static boolean checkSpy(int number) {
        int sum = 0;
        int multiple = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            multiple *= digit;
            number/=10;
        }
        return sum == multiple;
    }
public static String isSpy(int number){
    return  (checkSpy(number))? "spy" : "not spy";
   
}
    public static void main(String[] args) {
int number=123;
System.out.println(isSpy(number));
    }
}

//print 1 to 100 using recursion

public class Mains {

    public static void print(int num) {
        if (num > 10) {
            return;
        }
        System.out.println(num + "");
        print(num + 1);
       // System.out.println(num + "");
    }

    public static void main(String[] args) {
        print(1);
    }
}
//print 1 to 100   using recursion without parameter

public class Mains {
static int num;
    public static void print() {
        if (num > 10) {
            return;
        }
        System.out.println(num + "");
        num++;
        print();
       // System.out.println(num + "");
    }

    public static void main(String[] args) {
        print();
    }
}
//print 1 to 100   using recursion without parameter

public class Mains {

    public static int factorial(int num) {
        if (num ==0||num==1) {
            return 1;
        }
        int factorial = 1;
        factorial *= num;

        return num*factorial(num-1);

    }

    public static void main(String[] args) {
      System.out.println(factorial(1));  
    }
}

//print 1 to 100   using recursion without parameter

public class Mains {

    public static int factorial(int start, int num) {
        if (start>num) {
            return 1;
        }
        
        return start*factorial(start+1,num);

    }

    public static void main(String[] args) {
        int num=5;
      System.out.println(factorial(1,num));  
    }
}

//find hcf with rec
public class Mains {
    public static int HCF(int number, int hcf, int a, int b) {
        
        if (b < number) {
            return hcf;
        }

        return (a % number == 0 && b % number == 0) ? HCF(number + 1, hcf = number, a, b)
                : HCF(number + 1, hcf, a, b);
    }

    public static void main(String[] args) {
        System.out.println(HCF(1, 1, 4, 12));
    }
}
///check palindrom using recursion
public class Mains {
public static int reverse(int number ,int reverse){
    if(number==0){
        return reverse;
    }
    int digit=number%10;
reverse=reverse*10+digit;
return reverse(number/10, reverse);
} 
public static String isPalindrome(int number ){
    int reverse=0;
     reverse=reverse(number, reverse);
return (reverse==number)?"is palindrome":"is not palindrome";
}
    public static void main(String[] args) {
        System.out.println(reverse(1111, 0));
        System.out.println(isPalindrome(1111));
    }

}

//perfect number
public class Mains {
    public static int sumOfFactor(int number, int i) {
        if (i == number) {
            return 0;
        }
        if (number % i == 0) {
            return i + sumOfFactor(number, i + 1);
        } else {
            return sumOfFactor(number, i + 1);
        }

    }

    public static String isPerfect(int number, int i) {
        int sum = sumOfFactor(number, i);
        return (sum == number) ? "is perfect" : "is not perfect";
    }

    public static void main(String[] args) {
        int i = 1;

        int number = 28;
        System.out.println(sumOfFactor(number, i));
        System.out.println(isPerfect(number, i));
    }
}

//strong number
public class Mains {
    public static int factorialOfDigit(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        }
        return digit * factorialOfDigit(digit - 1);
    }

    public static int sumOfFactorial(int number) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return factorialOfDigit(digit) + sumOfFactorial(number / 10);
    }

    public static String isStrong(int number) {
        int sum = sumOfFactorial(number);
        return (sum == number) ? "is strong" : "is not strong";

    }

    public static void main(String[] args) {
        System.out.println(isStrong(145));
    }
}
//Automorphic numer using Recursion
public class Mains {
    public static int squareOfnumber(int number) {
        int square = number * number;
        return square;
    }

    public static int powerOfNumber(int number) {
        if (number == 0) {
            return 1;
        }
        return 10 * powerOfNumber(number / 10);
    }

    public static boolean isAutomorphic(int number) {
        int lastdigit = squareOfnumber(number) % powerOfNumber(number);
        System.out.println(lastdigit);
        return lastdigit == number;
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(25));
        System.out.println(isAutomorphic(25));
    }
}

//Armstrong numer using Recursion
public class Mains {
    public static int countOfDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countOfDigit(number / 10);
    }

    public static int sumOfdigit(int number, int pos) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        int digits = (int) Math.pow(digit, pos);
        return digits + sumOfdigit(number / 10, pos);
    }

    public static boolean isArmstrong(int number, int pos) {
        return number == sumOfdigit(number, pos);
    }

    public static void main(String[] args) {
        int pos = countOfDigit(153);
        System.out.println(countOfDigit(153));
        System.out.println(sumOfdigit(153, pos));
        System.out.println(isArmstrong(153, pos));
    }
}

//Armstrong numer using Recursion
public class Mains {
    public static int countOfDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countOfDigit(number / 10);
    }

    public static int pow(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * pow(base, exp - 1);
    }

    public static int sum(int number, int exp) {
        if (number == 0) {
            return 0;
        }
        int base = number % 10;
        return pow(base, exp) + sum(number / 10, exp);
    }

    public static boolean isArmstrong(int number) {
        int exp=countOfDigit(number);
        int sum=sum(number, exp);
        return number == sum;
    }

    public static void main(String[] args) {
        int pos = countOfDigit(153);
        System.out.println(countOfDigit(153));
        System.out.println(sum(153, pos));
        System.out.println(isArmstrong(153));
    }
}

public class Mains {
public static int fibonacci(int number){
    if(number==0||number==1){
        return number;
    }
    return fibonacci(number-1)+fibonacci(number-2);
}
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci( i));
        }
    }
}

//when until sum is single digit
public class Main {
public static int sumOfDigit(int number){
    
    if(number==0){
    return number;
    }
    int digit =number%10;
    return digit+sumOfDigit(number/10);
}
public static int untilSumIsOne(int number){
    if(number<=9){
        return number;
    }
    int sum= sumOfDigit(number);

    return untilSumIsOne(sum);
}
    public static void main(String[] args) {
        System.out.println(sumOfDigit(2365));
        System.out.println(untilSumIsOne(2365));
    }
}

// Binary to decimal (recursion)
// Decimalpublic class Mains 
public class Mains {
public static String toBinary(int number) {
        if (number == 0) return "0";

        if (number == 1) return "1";

        return toBinary(number / 2) + (number % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(7));
    
    
}
    }

    // Binary to decimal (recursion)
// Decimal to binary (recursion)

public class Mains {
    public static String isBinary(int number, String str) {
        if (number == 0) {
            return str;
        }
        int digit = number % 2;
        str = digit + str;
        return isBinary(number / 2, str);
    }

    public static void main(String[] args) {
        int number = 8;

        System.out.println(isBinary(number, ""));

    }
}
public class Mains {

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int Decimal(int number, int count) {
        if (number == 0) return 0;

        int digit = number % 10;

        return digit * power(2, count) + Decimal(number / 10, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(Decimal(1000, 0)); // 8
    }
}

public class Mains {

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int Decimal(int number, int count) {
        if (number == 0) return 0;

        int digit = number % 10;

        return digit * power(2, count) + Decimal(number / 10, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(Decimal(1000, 0)); // 8
    }
}

public class Mains {
public static int countOfDigit(int number){
    if(number==0){
        return 0;
    }
    return 1+countOfDigit(number/10);
}
public static int powerOfDigit(int base,int exp){
    if (exp==0){
        return 1;
    }
    return base*powerOfDigit(base, exp-1);
}
public static int sumOfPowerOfDigit(int number,int count){
    if(number==0){
       return 0; 
    }
    int digit=number%10;
    return powerOfDigit(digit, count--)+sumOfPowerOfDigit(number/10, count);
}
public static String isArmstrong(int number,int count){
    int sum=sumOfPowerOfDigit(number, count);
    return (sum==number)?"It is armstrong":"It is not armstrong";
}
    public static void main(String[] args) {
        int number=89;
        int count=countOfDigit(number);
        System.out.println(isArmstrong(number, count));
    }
}


// 10101
// 10101
// 10101
// 10101
// 10101

public class Mains {
    public static void printcol(int col, int maxrow) {
        if (col > maxrow) {
            return;
        }
        if (col % 2 == 0) {
            System.out.print("0");

        } else {
            System.out.print("1");
        }
        printcol(col + 1, maxrow);
    }

    public static void printRow(int row, int maxrow) {
        if (row > maxrow) {
            return;
        }
        printcol(1, maxrow);
        System.out.println();
        printRow(row + 1, maxrow);
    }

    public static void main(String[] args) {
        int maxrow = 5;
        int row = 1;
        printRow(row, maxrow);

    }
}

// * 
// * * 
// * * * 
// * * * * 
// * * * * *

public class Mains {

    public static void main(String[] args) {
        int maxrow=5;
        for (int i = 1; i <=maxrow; i++) {
           for (int j = 1; j <=i; j++) {
            System.out.print("*"+" ");
           }
                   System.out.println();
 
        }
    }
}

// * 
// * * 
// * * * 
// * * * * 
// * * * * *

public class Mains {
    public static void printcol(int col, int maxrow,int row) {
        if (col > row) {
            return;
        }
        System.out.print("*"+" ");
        printcol(col + 1, maxrow,row);
    }

    public static void printRow(int row, int maxrow) {
        if (row > maxrow) {
            return;
        }
        printcol(1, maxrow,row);
        System.out.println();
        printRow(row + 1, maxrow);
    }

    public static void main(String[] args) {
        int maxrow = 5;
        int row = 1;
        printRow(row, maxrow);

    }
}

// * * * * * 
// * * * * 
// * * * 
// * * 
// *
public class Mains {

    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n+1-i; j++) {
               System.out.print("*"+" "); 
            }
            System.out.println();
        }
    }
}
// * * * * * 
// * * * * 
// * * * 
// * * 
// *
public class Mains {
    public static void printcol(int col, int maxrow,int row) {
        if (col > row) {
            return;
        }
        System.out.print("*"+" ");
        printcol(col + 1, maxrow,row);
    }

    public static void printRow(int row, int maxrow) {
        if (row==0) {
            return;
        }
        printcol(1, maxrow,row);
        System.out.println();
        printRow(row - 1, maxrow);
    }

    public static void main(String[] args) {
        int maxrow = 5;
        int row = 5;
        printRow(row, maxrow);

    }
}

public class Mains {

    public static void main(String[] args) {
        int noOfrow = 5;
        for (int row = 1; row <= noOfrow; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        int noOfrows = 4;
        for (int row = 1; row <= noOfrows; row++) {
            for (int col = 1; col <= noOfrows - row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

//Triangle pattern Using Recursion

/*

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
        if (row > maxRow) {
            return;

        }
        printCol(maxRow - row + 1);
        System.out.println();
        printRow(row + 1, maxRow);

    }

    public static void main(String[] args) {
        int maxRow = 5;
        printRow(1, maxRow);
    }
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */

public class Mains {

    public static void main(String[] args) {
        int noOfrow = 5;

        int num = 1;

        for (int row = 1; row <= noOfrow; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
                num++;

            }
            System.out.println();
        }

    }
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
public class Main {

    public static int colOfnumber(int col, int row, int num) {
        if (col > row) return num;

        System.out.print(num + " ");
        num++;

        return colOfnumber(col + 1, row, num);
    }

    public static void rowOfnumber(int row, int maxno, int num) {
        if (row > maxno) return;

        num = colOfnumber(1, row, num);
        System.out.println();

        rowOfnumber(row + 1, maxno, num);
    }

    public static void main(String[] args) {
        rowOfnumber(1, 5, 1);
    }
}