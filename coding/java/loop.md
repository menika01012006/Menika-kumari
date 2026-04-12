

1...//give number n.count how many digit are prime 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int number = input.nextInt();
        int count = 0;
        for (int i = number; number > 0; number /= 10) {
            int digit = number % 10;
            boolean isprim = true;
            for (int j = 2; j < digit; j++) {
                if (digit % j == 0) {
                    isprim = false;

                }
                
            }if (isprim) {
                    count++;
                }

        }
        System.out.println("count is=" + count);
    }
}

///using while loop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = 12345;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            boolean isprim = true;
            int j = 2;
            while (j < digit) {
                if (digit % 2 == 0) {
                    isprim = false;
                    break;
                }
                j++;

            }
            if (isprim) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }

}



2...//Check number is palindrome  .
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int number = input.nextInt();// 123
        int reverse = 0;
        
        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10;
        
            
            reverse = reverse * 10 + digit;
        }
        if (number == reverse) {
System.out.println("palindrom");
        }else{
            System.out.println("palindrom not");
        }
    }
}

//**find palindrome using method
public class Main {
    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return number == reverse;
    }

    public static void main(String[] args) {
        int number = 111;
        if (isPalindrome(number)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}

3....//find palindrom but skip middle digit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = input.nextInt();
        int count = 0;

        for (int temp = n; temp > 0; temp /= 10) {

            count++;

        }
        if (count % 2 == 0) {
            int reverse = 0;
            for (int temp = n; temp > 0; temp /= 10) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
            }
            if (n == reverse) {
                System.out.println("palindrom");
            } else {
                System.out.println("not normal palindrom");
            }
        } else {
            int mid = (count / 2) + 1;
            int position = 0;
            int number = 0;
            for (int temp = n; temp > 0; temp /= 10) {
                int digit = temp % 10;
                position++;
                if (position == mid) {

                    continue;
                }

                number = number * 10 + digit;

            }
            int reverse = 0;
            for (int temp = number; temp > 0; temp /= 10) {
                int dig2 = temp % 10;

                reverse = reverse * 10 + dig2;
            }

            if (number == reverse) {
                System.out.println("pelindrom is");

            } else {
                System.out.println("not palindrom");
            }

        }

    }
}


3****
//find palindrom but skip middle digit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = input.nextInt();
        int count = 0;
        int temp = n;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        if (count % 2 == 0) {
            int reverse = 0;
            temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if (reverse == n) {
                System.out.println("  spe palindrom");
            } else {
                System.out.println("  spe not palindrom");
            }
        } else {
            int number = 0;
            int mid = (count / 2) + 1;
            int position = 0;
            temp = n;
            while (temp > 0) {
                int digit2 = temp % 10;
                position++;
               // number = number * 10 + digit2;
                temp /= 10;

                if (mid == position) {
                    continue;
                  //  number = number * 10 + digit2;
               // temp /= 10;

                }

                number = number * 10 + digit2;
               // temp /= 10;

               System.out.println("number" + number);
            }
            int reverse = 0;
            temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
                System.out.println("revese" + reverse);
            }
            if (number == reverse) {
                System.out.println("palindrom");
            } else {
                System.out.println("not palindrom");
            }
        }

    }
}
//using method 
//find palindrom but skip middle digit;
import java.util.Scanner;

public class Mains {
    public static int countOfDigit(int number) {
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static String isNormalPalindrome(int number) {
        int temp = number;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return (number == reverse) ? "normal palindrome" : " not normal palindrome";

    }

    public static String isSpacialPalindrome(int number) {
        int temp = number;
        int newnumber = 0;

        int mid = (countOfDigit(number) / 2) + 1;
        int position = 0;
        while (temp > 0) {
            int digit2 = temp % 10;
            position++;
            temp /= 10;

            if (mid == position) {
                continue;

            }

            newnumber = newnumber * 10 + digit2;

        }
        int reverse = 0;
        temp = newnumber;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        return (newnumber == reverse) ? "spacial palindrome" : "not  spacial palindrome";

    }
public static int isAlmostPalindrom(){
    
}
    public static void main(String[] args) {
        int number = 11211;
        int count = countOfDigit(number);
        if (count % 2 == 0) {
            System.out.println(isNormalPalindrome(number));

        } else {
            System.out.println(isSpacialPalindrome(number));
        }

    }
}


4....//Find sum of digits until single digit remains.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = 9875;
        int sum = 0;

        // for (int i = n; i > 0; i /= 10) {//whitout this
        //     int digit = i % 10;
        //     sum += digit;
        // }

        // n = sum;

        // for (; n > 9; n=sum) {
        //     sum = 0;

        //     for (int j = n; j > 0; j /= 10) {

        //         int dig = j % 10;
        //         sum += dig;
        //     }

        // }
       // n=sum;
        while(n>9){
            sum=0;
            int j=n;
            while(j>0){
                int dig=j%10;
                sum+=dig;
                j/=10;
            }
            n=sum;
        }
        System.out.println("sum" + n);

    }

}



5*****//Count how many even digits before first 7 appears.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");//1234567
        int n = 1234567;
        int count = 0;
                    int reverse=0;

int temp=n;
        while (temp > 0) {
            int digit = temp % 10;
            reverse=reverse*10+digit;
            temp /= 10;}
int tem=reverse;
        while(tem>0){ 
            int digit=tem%10;
            tem/=10;
            if(digit==7){
                break;
            }if(digit%2==0){
                count++;
            }
        }
        System.out.println("count"+count);
    }
}


6****//Print largest digit of number.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");// 1234567
        int n = 1239567;
        int largest = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (largest <= digit) {
                largest = digit;
            }
            temp /= 10;

        }

        System.out.println(largest);

    }
}


7**//Print smallest non-zero digit.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");// 1234567
        int n = 120309567;
        int smallest = 9;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            if (digit == 0) {
                continue;
            }
            if (smallest >= digit) {
                smallest = digit;
            }
        }
        System.out.println(smallest);

    }
}


8***//Replace all 0 with 5 in a number..
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");// 1234567
        int n = 12003450;

        int temp = n;
        int reverse = 0;
int replaceno=0;
        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            if (digit == 0) {
                digit = 5;
            }
            reverse = reverse * 10 + digit;

        }while(reverse>0){
            int digit=reverse%10;
            replaceno=replaceno*10+digit;
            reverse/=10;
        }
System.out.println("number"+n+"replaceno="+replaceno);
    }

}


9***//Count frequency of each digit (0–9)...
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");//
        int n = 2276767;
        int count = 0;
        for (int temp = 0; temp <= 9; temp++) {
            count = 0;
            for (int tem = n; tem > 0; tem /= 10) {

                int dig = tem % 10;
                if (temp == dig) {
                    count++;
                }
            }
            System.out.println(temp + "count" + count);
        }

    }

}


10****//Check if number contains consecutive duplicate digits.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = 2276200;
        int previous = n % 10;
        n = n / 10;
      //  int digit = 0;
    
        boolean found = false;
        for (int temp = n; temp > 0; temp /= 10) {
          int  digit = temp % 10;

            if (previous == digit) {
                found = true;
            break;
            }
            previous=digit;
        }
        if (found) {
            System.out.println("consecutive");
        } else {
            System.out.println("not consecutive");
        }
    }

}


10 a****//Check if number contains consecutive duplicate digits.
//and count how many consecutive duplicate.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n =1116200;
        int previous = n % 10;
        n = n / 10;
      int count=0;
    
        boolean found = false;
        for (int temp = n; temp > 0; temp /= 10) {
          int  digit = temp % 10;

            if (previous == digit) {
                found = true;
            count++;
            }
            previous=digit;
        }
        if (found) {
            System.out.println(count+"consecutive");
        } else {
            System.out.println("not consecutive");
        }
    }

}



11****//Print digits in ascending order....

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        int n = 95773512;
    
        for (int temp = 0; temp <= 9; temp++) {
            for (int i = n; i > 0; i/= 10) {
                int digit = i % 10;

                if (digit == temp) {
                    System.out.println(temp);

                }
            }
        }
    }
}


// strong Number between 1 to 1000

public class Main {

    public static void main(String[] args) {
         for (int i = 1; i < 10000; i++) {

        int number = i;
        int sum = 0;

        int temp = i;
        while (temp != 0) {
            int fact = 1;
            int digit = temp % 10;

            int j = 1;
            while (j <= digit) {
                fact *= j;
                j++;
            }
            sum += fact;
temp/=10;
        }
        if (sum == number) {
            System.out.println(number);
        }
    }
}
}

public class Main {
    public static int factorial(int digit) {
        int factorial = 1;
        for (int i = 1; i <= digit; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static int sumOfFactorial(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            int factorial = factorial(digit);
            sum += factorial;
            number /= 10;
        }
        return sum;
    }

    public static String isStrong(int number) {
        int sum = sumOfFactorial(number);

        return (sum == number) ? "strong Number" : "Not strong Number";
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println(isStrong(number));
    }
}

//Multiply digits until result < 10.
public class Main {

    public static void main(String[] args) {
        int number = 39;
        int multiple = 1;

        while (number >= 10) {
            multiple = 1;

            int temp = number;

            while (temp != 0) {
                int digit = temp % 10;
                multiple *= digit;
                temp /= 10;
            }
            number = multiple;
        }
        System.out.println(multiple);
    }
}


//***first and lasst digit print and all midile digit add 
public class Main {

    public static void main(String[] args) {
        int n = 12345678;
        int totalcount = 0;
        int first = 0;
        int last = 0;

        int count = 0;
        int midledigitsum = 0;
        int temp = n;
        while (temp > 0) {
            totalcount++;
            temp /= 10;
        }
        while (n > 0) {
            int digit = n % 10;
            count++;

            if (count == 1) {
                last = digit;
            } else if (totalcount == count) {
                first = digit;
            } else {
                midledigitsum += digit;
            }
            n /= 10;

            
        }
        System.out.println(midledigitsum);
            System.out.println(last);
            System.out.println(first);
    }
}

//Ek number diya hai. First aur last digit swap karo.
public class Main {

    public static void main(String[] args) {
        int n = 1234567;
        int first = 0;
        int last = 0;
        int totalcount = 0;
        int temp = n;
        while (temp > 0) {
            totalcount++;
            temp /= 10;
        }
        int tem = n;
        int reverse = 0;
        int count = 0;
        while (tem > 0) {
            int digit = tem % 10;
            count++;
            if (totalcount == count) {
                first = digit;

            }
            if (count == 1) {
                last = digit;
            }
            tem /= 10;
        }
        int te=n;
        while (te > 0) {
            int digit = te % 10;
            if (last == digit) {
                digit = first;
            }
            else if (first == digit) {
                digit = last;
            }
            reverse = reverse * 10 + digit;
            te/= 10;
        }

int number=0;
while(reverse>0){
    int digit=reverse%10;
number=number*10+digit;
reverse/=10;
}
System.out.println( n+" "+number);
    }
}


//Ek number diya hai. First aur last digit swap karo.
public class Main {
    public static void main(String[] args) {

        int n = 1234567;

        int last = n % 10;

        int temp = n;
        int first = 0;
        int power = 1;

        while(temp >= 10){
            temp /= 10;
            power *= 10;
        }

        first = temp;

        int middle = (n % power) / 10;

        int result = last * power + middle * 10 + first;

        System.out.println(result);
    }
}

//Ek number diya hai. find First aur last digit and add midle digit.
public class Main {
    public static void main(String[] args) {

        int n = 1234567;
        int last = n % 10;
        int first = 0;
        int power = 1;
        int temp = n;
        while (temp >= 10) {
            temp /= 10;
            power *= 10;
        }
        first = temp;
        int midle = (n % power) / 10;
        int sum = 0;
        while (midle > 0) {
            int digit = midle % 10;
            sum += digit;
            midle /= 10;
        }

        // int result=last*power+midle*10+first;
        System.out.println(sum);
        System.out.println(first);
        System.out.println(last);
    }
}

//strong number
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n = i;
            int factsum = 0;
            int temp = n;
            while (temp > 0) {
               int fact=1;
               int digit=temp%10;
             int  tem=1;
                while(tem<=digit){
                    fact*=tem;
                    tem++;

                }
                factsum+=fact;
                temp/=10;
            }
            if(n==factsum){
                System.out.println(n+"strong");
            }
        }
        

    }
}

//** strong number using method
public class Main {
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int factorial = 1;

            int digit = temp % 10;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        return sum == number;

    }

    public static void main(String[] args) {
        for (int number = 1; number < 10000; number++) {

            boolean result = isStrong(number);
            if (result) {
                System.out.println(number);
            } 
        }

    }
}

//Calculate HCM using for loop.
public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int HCM = 1;
        for (int i = 1; i <= b / 2; i++) {

            if (a % i == 0 && b % i == 0) {
                HCM = i;

            }
        }
        System.out.println(HCM);
    }
}

//find duck number
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {

            int temp = i;

            int power = 1;
            while (temp >= 10) {
                power *= 10;
                temp /= 10;
            }
            boolean isfound = false;
            int tem = i;
            while (tem > 0) {

                int digit = tem % 10;
                if (digit == 0) {
                    isfound = true;
                    break;
                }

                tem /= 10;
            }
            if (i / power != 0) {
                if (isfound) {
                    System.out.print(i + "duck number" + " ");
        

            }
        }
    }
}
}

//find nion number

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            int square = i * i;
            int sum = 0;
            int temp = square;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i + " neon number");
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int n=i;
        int square=i*i;
int temp=i;
    int power=1;

while(temp>0){
    power*=10;
    temp/=10;
}int squarelast=square%power;
if(squarelast==square){
    System.out.println(i+"automorphic");
}

        }
    }
}
//Automorphic Number

public class Main {

    public static void main(String[] args) {
        int num=76;
        int square=num*num;
        int temp=num;
        int digits=0;
        while (temp!=0) {
            digits++;
            temp/=10;
            
        }
        int modulous=(int)Math.pow(10, digits);
        int lastDigits=square%modulous;
        if (lastDigits==num) {
            System.out.println("It is automorphic");
            
        }else{
             System.out.println("It is not automorphic");
        }
        
    }
}



//***Strong + Perfect Check Together
public class Main {

    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {

            int temp = number;
            int sumfactor = 0;
            int sumfactorial = 0;
            while (temp != 0) {
                int digit = temp % 10;

                int factorial = 1;
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                sumfactorial += factorial;
                temp /= 10;
                int factor = 0;

                for (int i = 1; i <= number / 2; i++) {
                    if (number % i == 0) {
                        factor = i;
                    }
                }
                sumfactor += factor;
            }
            if (sumfactor == number) {
                System.out.print("perfect" + number + " ");
            }
            if (sumfactorial == number) {
                System.out.print("strong" + number + " ");
                // } else {
                // System.out.println("dono nahi"+" ");
            }
        }

    }
}

***//Add only prime digit;
public class Main {

    public static void main(String[] args) {
        int number = 123456789;
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            boolean isprime = true;
            for (int i = 2; i < digit; i++) {
                if (digit % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                sum += digit;
            }

            temp /= 10;

        }
        System.out.println("sum=" + sum);
    }
}


//**** Check karo number automorphic hai ya nahi.

//  Automorphic:
// Number ka square ka last part same hota hai number se.
public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
          //  int num = number;
            int square = number * number;
            int temp = number;
            int digit = 0;

            while (temp != 0) {
                digit++;
                temp /= 10;
            }
            int power = (int) Math.pow(10, digit);
            int lastdigit = square % power;
            if (lastdigit == number) {
                System.out.print(number + " ");
            }
        }
    }
}

// Check karo number spy number hai ya nahi.

// 👉 Spy number:
// Digits ka sum = digits ka product
public class Main {
    public static void main(String[] args) {
        for (int number = 0; number < 10000; number++) {
            int temp = number;
            int sum = 0;
            int multiple = 1;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                multiple *= digit;

                temp /= 10;
            }
            if(sum==multiple){
                System.out.print(number+" ");
            }
        }
    }

}

***// Check karo number neon number hai ya nahi.

// 👉 Neon number:
// Square ke digits ka sum = original number
public class Main {
    public static void main(String[] args) {
        for (int number = 1; number < 1000; number++) {
            int square = number * number;
            int sum = 0;
            int temp = square;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            if (sum % number == 0) {
                System.out.println(number);
            }
        }
    }
}

//****Number prime hai aur reverse bhi prime hai to twisted prime

public class Main {
    public static void main(String[] args) {
        for (int number = 0; number < 10000; number++) {
            // int temp = number;
            boolean isprime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isprime = false;
                    break;
                }
            }

            if (isprime) {
                int reverse = 0;
                int temp = number;
                while (temp != 0) {
                    int digit = temp % 10;
                    reverse = reverse * 10 + digit;
                    temp /= 10;
                }
                if (number == reverse) {
                    boolean isreprime = true;
                    for (int i = 2; i < reverse; i++) {
                        if (reverse % i == 0) {
                            isreprime = false;
                            break;
                        }
                    }
                    if (isreprime) {
                        System.out.print(reverse + " ");
                    }

                }

            }

        }
    }
}

// Question: Duck Number
// Number me 0 present ho but first digit 0 na ho.
public class Main {

    public static void main(String[] args) {
        for (int Number = 101; Number <= 150; Number++) {
            int temp = Number;
            boolean isfound = false;

            while (temp != 0) {
                int digit = temp % 10;
                if (digit == 0) {
                    isfound = true;
                    break;
                }
                temp /= 10;

            }
            if (isfound) {
                System.out.print(Number);
            }

        }
    }
}

// Question Harshad Number (Niven Number)
// Number digits ke sum se divisible ho
public class Main {
    public static void main(String[] args) {
        for (int Number = 1; Number <= 100; Number++) {
            int temp = Number;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            if (Number % sum == 0) {
                System.out.print(Number+ " ");
            }
        }
    }
}

// Sunny Number
// Question:
// Number n+1 perfect square ho.
public class Main {

    public static void main(String[] args) {
        for (int Number = 1; Number < 100; Number++) {
            int temp = Number + 1;

            int root = (int) Math.sqrt(temp);
            if (temp == (root * root)) {
                System.out.println(Number);
            }
        }
    }
}

// 1 Kaprekar Number Number
// Question:
// Number ka square nikalo → usko 2 parts me split karo → dono parts ka sum = original number.
public class Main {

    public static void main(String[] args) {
        for (int Number = 10; Number < 100; Number++) {
            int square = Number * Number;
            int temp = square;
            int count = 0;
            int sum = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            int tem = square;
            int power = (int) Math.pow(10, count/2);
            while (tem != 0) {
                int digit = tem % power;
                sum += digit;
                tem/=power;
            }
            if (sum == Number) {
                System.out.println(Number);
            }
        }
    }
}

// 1️ Kaprekar Number Number
// Question:
// Number ka square nikalo → usko 2 parts me split karo → dono parts ka sum = original number.
public class Main {

    public static void main(String[] args) {
        for (int Number = 10; Number < 1000; Number++) {
            int square = Number * Number;
            int temp = square;
            int count = 0;
            int sum = 0;
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            
            int power = (int) Math.pow(10, count/2);
            int right=square%power;
            int left=square/power;
            
            if (right+left == Number) {
                System.out.println(Number);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        for (int i = 45; i <= 1000; i++) {

            int square = i * i;
            int temp = square;
            int power = 1;

            while (temp > 0) {
                power *= 10;
                temp /= 10;
            }

            power /= 10;

            while (power > 1) {

                int right = square % power;
                int left = square / power;

                if (right + left == i) {
                    System.out.println(i + " Kaprekar");
                }

                power /= 10;
            }
        }
    }
}

// 1️⃣ Kaprekar Number Number
// Question:
// Number ka square nikalo → usko 2 parts me split karo → dono parts ka sum = original number.
public class Main {

    public static void main(String[] args) {
        for (int Number = 1; Number < 1000; Number++) {
            int square = Number * Number;
            int temp = square;
            int count = 0;
            
            while (temp != 0) {
                count++;
                temp /= 10;
            }

            int power = (int) Math.pow(10, count);
            power /= 10;
            while (power > 1) {

                int right = square % power;
                int left = square / power;

                if (right + left == Number) {
                    System.out.println(Number);
                }
                power /= 10;
            }
        }
    }
}
//using function
public class Main {
    public static boolean isKaprekar(int number) {
        int square = number * number;
        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int power = (int) Math.pow(10, count);

        int right = square % power;
        int left = square / power;

        return number == (right + left);

    }

    public static void main(String[] args) {
        for (int number = 1; number < 1000; number++) {

            if (isKaprekar(number)) {
                System.out.println(number);

            }

        }
    }
}

// 1 smith Number Number

public class Main {

    public static void main(String[] args) {
        int number = 666;
        boolean isnotprime = false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isnotprime = true;
                break;
            }
        }
        if (isnotprime) {
            int temp = number;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            int num = number;
            int sumfactor = 0;
            for (int j = 2; j <= num; j++) {
                while (num % j == 0) {
                    int factor = j;

                    while (factor != 0) {
                        int digit = factor % 10;
                        sumfactor += digit;

                    }
                    num /= 10;

                }
            }

            if (sum == sumfactor) {
                System.out.println(number);
            }
        }
    }
}



//find Armstrong number
public class Main {
    public static int countofdigit(int temp) {
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static boolean isArmstrong(int number) {
        int temp = number;
        int digits = countofdigit(temp);
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return (sum == number);
    }

    public static void main(String[] args) {

        for (int number = 0; number < 100; number++) {

            boolean result = isArmstrong(number);
            if (result) {
                System.out.println("armstrong");
            } else {
                System.out.println("not armstrong");
            }

        }
    }
}

////***perfectnumber

public class Main {
    public static boolean isperfect(int number) {

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {

                sum += i;
            }
        }
        return sum == number;

    }

    public static void main(String[] args) {
        int number = 28;
        boolean result = isperfect(number);
        if (result) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }
    }
    
}
Disarium number using method
public class Main {
    public static int digitofcount(int temp) {

        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;

        }
        return count;
    }

    public static boolean isDisarium(int number) {
        int count = digitofcount(number);
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            count--;
            temp /= 10;
        }
        return number == sum;
    }

    public static void main(String[] args) {
        int number = 135;
        if (isDisarium(number)) {
            System.out.println("It is Disarium");
        } else {
            System.out.println("It is not Disarium");
        }
    }
}

//find maximum and minumum
public class Main {
    public static int findMaximum() {
        int largest = Integer.MIN_VALUE;

        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 0) {
        if(largest<i){
            largest=i;
        }

            }
        }
        return largest;

    }

    public static int findMinimum() {
        int minimum = Integer.MAX_VALUE;

        for (int i = 300; i <= 600; i++) {
            if (i % 5 == 3 && i % 8 == 0) {
                if(minimum>i){
                    minimum=i;
                }

            }
        }
        return minimum;
    }

    public static void display() {

        int largest = findMaximum();
        int minimum = findMinimum();
        System.out.println("Maximum is: "+largest);
        System.out.println("minimum is:"+minimum);
    }

    public static void main(String[] args) {
        display();
    }
}

//find  second  maximum and minumum
public class Main {
    public static int findMaximum() {
        int largest = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                if (largest < i) {

                    secondmax = largest;
                    largest = i;

                } else if (i > secondmax && i < largest) {
                    secondmax = i;
                }
            }

        }
        return secondmax;

    }

    public static int findMinimum() {
        int minimum = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                if (minimum > i) {
                    secondmin = minimum;

                    minimum = i;

                } else if (i < secondmin && i > minimum) {
                    secondmin = i;
                }
            }

        }

        return secondmin;
    }

    public static void display() {

        int largest = findMaximum();
        int minimum = findMinimum();
        System.out.println("Maximum is: " + largest);
        System.out.println("minimum is:" + minimum);
    }

    public static void main(String[] args) {
        display();
    }
}


public class Main {
    public static boolean digitIsPrime(int digit) {

        if (digit <= 1) {
            return false;
        }
        for (int i = 2; i <= digit / 2; i++) {
            if (digit % i == 0) {

                return false;

            }
        }

        return true;
    }

    public static int MaxOfPrimeDigit(int number) {
        
        int temp = number;
        int largest=-1;
        while (temp != 0) {
            int digit = temp % 10;
            boolean result = digitIsPrime(digit);
            if (result) {
               if(largest<digit){
                largest=digit;
               } 
            }
            temp /= 10;

        }
        return largest;
    }

    public static void display() {
        int number = 12345679;
        System.out.println("count of digit is: " + MaxOfPrimeDigit(number));
    }

    public static void main(String[] args) {
        display();
    }

}

public class Mains {
    public static void print(int col, int max, int row) {
        if (col > max + 1 - row) {
            return;
        }

        print(col + 1, max, row);
        System.out.print(col);
    }

    public static void pattern(int row, int max) {
        if (row > max) {
            return;
        }
        print(1, max, row);
        System.out.println();
        pattern(row + 1, max);
    }

    public static void main(String[] args) {
        int max = 4;
        int row = 1;
        pattern(row, max);
    }
}

//print paramid

public class Mains {
    public static void space(int num, int r, int s) {
        if (s > num - r) {
            return;
        }

        space(num, r, s + 1);
        System.out.print(" ");

    }

    public static void col(int num, int r, int c) {
        if (c > 2 * r - 1) {
            return;
        }

        col(num, r, c + 1);
        System.out.print("*");

    }

    public static void row(int num, int r) {
        if (r >num) {
            return;
        }
        space(num, r, 1);
        col(num, r, 1);
        System.out.println();

        row(num, r + 1);
    }

    public static void main(String[] args) {
        int num = 4;
        int row = 1;

        row(num, row);
        // for (int r = 1; r <= num; r++) {
        // for (int s = 1; s <= num - r; s++) {
        // System.out.print(" ");
        // }
        // for (int c = 1; c <= 2 * r - 1; c++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

    }
}