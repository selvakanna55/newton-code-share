package batch_assignments;


import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumLarge {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int p1 = num1.length()-1;
        int p2 = num2.length()-1;
        int a = 0, b = 0, carry = 0;

        StringBuffer sb = new StringBuffer();

        while(p1>=0 || p2>=0 || carry>0){
            a = 0;
            b = 0;
            if(p1>=0)
                a = num1.charAt(p1--)-'0';
            if(p2>=0)
                b = num2.charAt(p2--)-'0';
            int sum = a+b+carry;
            int lastDigit = sum%10;
            carry = sum/10;
            sb.append(lastDigit);
        }
        sb.reverse();
        System.out.println(sb);
    }
}