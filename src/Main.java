public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.isPrime(23));
        System.out.println(MathUtil.gcd(25,105));
        System.out.println(MathUtil.lcm(25,105));
        System.out.println(MathUtil.fibonacci(6));
        System.out.println(MathUtil.factorial(6));
        MathUtil num=new MathUtil();
        System.out.println(num.isPerfectNumber(6));
        System.out.println(num.sumOfDigits(1234));
        System.out.println(num.reversedNumber(1234));
        System.out.println(num.isArmstrongNumber(153));
        System.out.println(num.nextPrime(7));
    }
}