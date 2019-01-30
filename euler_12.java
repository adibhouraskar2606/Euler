public class Euler{
    public int numberOfDivisors(long number) {
        int nod = 0;
        int sqrt = (int)Math.sqrt(number);
        for(int i = 1; i<= sqrt; i++){
            if(number % i == 0){
                nod += 2;
            }
        }
        //Correction if the number is a perfect square
        if (sqrt * sqrt == number) {
            nod--;
        }
        return nod;
    }
    public long triangleNumber(long n){
        long triangleNumber = 0;
        for(long i = 0; i<=n; i++){
            triangleNumber = triangleNumber+i;
        }
        return triangleNumber;
    }
    public static void main(String gg[]){
        Euler euler = new Euler();
        int divisors=0;
        long triangleNumber = 0;
        for(long i =10000; i<100000; i++){
            triangleNumber = euler.triangleNumber(i);
            divisors = euler.numberOfDivisors(triangleNumber);
            System.out.println(triangleNumber+" : "+divisors);
            if(divisors >= 500){
                System.out.println("triangle Number with over 500 divisors is : "+triangleNumber);
                break;
            }
        }
    }
}