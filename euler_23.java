import java.util.*;

public class Euler{
    static long max = 28123;
    public static void main(String gg[]){
        long total = 0;
        ArrayList<Long> abundantNumbers = new ArrayList<Long>();
        Set<Long> sumOfNumbers = new HashSet<Long>();
        Euler euler = new Euler();
        for(long i = 1; i<max; i++){
            if(euler.checkAbundant(i))
                //System.out.println(i);
                abundantNumbers.add(i);
        }
        sumOfNumbers = euler.sumOfAbundantNumbers(abundantNumbers);
        //Iterator iter = sumOfNumbers.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
        for(long i = 1; i<max; i++){
            if(!sumOfNumbers.contains(i)){
                //System.out.println(i);
                total = total + i;
            }
        }
        System.out.println("Total is : "+total);
    }
    public Set<Long> sumOfAbundantNumbers(ArrayList<Long> abundantNumbers){
        Set<Long> sumOfNumbers = new HashSet<Long>();
        for(int i = 0; i<abundantNumbers.size(); i++){
            for(int j = i; j<abundantNumbers.size(); j++){
                long l = abundantNumbers.get(j) + abundantNumbers.get(i);
                if(l<max)
                    sumOfNumbers.add(l);
            }
        }
        return sumOfNumbers;
    }
    public boolean checkAbundant(long n){
        long count = 0;
        for(long i = 1; i<=n/2; i++){
            if(n%i == 0){
                count = count + i;
            }
        }
        if(count > n){
            return true;
        }
        return false;
    }
}