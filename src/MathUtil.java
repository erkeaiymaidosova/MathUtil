import java.util.ArrayList;

public class MathUtil {
    static int c;
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        int c = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                c++;
                if (c > 1) return false;
            }
        }
        return c == 0;
    }

    private int gcd;
    public static int gcd(int a,int b){
        int gcd = 0;
        int s;
        if(a<b){
            s=a;
        }else{
            s=b;
        }
        for(int i=1;i<s;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int lcm(int a,int b){
        int lcm=(a*b)/gcd(a,b);
        return lcm;
    }
    public static int fibonacci(int a){
        int[] n =new int[a];
        n[0]=0;
        n[1]=1;
        for(int i=2;i<a;i++){
            n[i]=n[i-1]+n[i-2];
        }
        return n[a-1];
    }
    public static int factorial(int a){
        int f = 1;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        return f;
    }
    public boolean isPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }
    public int sumOfDigits(int a){
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
    public int reversedNumber(int r){
        ArrayList<Integer>num=new ArrayList<>();
        while(r!=0){
            num.add(r%10);
            r=r/10;
        }
        int reverse=0;
        for(int i=0;i<num.size();i++){
            reverse=reverse*10+ num.get(i);
        }
        return reverse;
    }
    public boolean isArmstrongNumber(int a){
        int numOfDigits=0;
        while(a!=0){
            a=a/10;
            numOfDigits+=1;
        }
        int sum=0;
        while(a!=0){
            sum+=(a%10)*numOfDigits;
            a=a/10;
        }
        if(sum==a){
            return true;
        }else{
            return false;
        }
    }
    public int nextPrime(int p){
        int nextPrime=p+1;
        while(isPrime(nextPrime)==false){
            nextPrime+=1;
        }
        return nextPrime;
    }
}
