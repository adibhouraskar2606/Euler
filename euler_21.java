import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Euler{
    public static void main(String gg[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Euler euler = new Euler();
        int sum = 0;
        int secondSum = 0;
        int totalSum = 0;
        for(int i = 1; i<=10000; i++){
            sum = euler.findFactorsSum(i);
            //System.out.println("sum is : "+sum);
            secondSum = euler.findFactorsSum(sum);
            if(secondSum == i && sum != secondSum){
                System.out.println("Amicable numbers are : "+sum+"," +secondSum);
                if(!numbers.contains(sum))
                    numbers.add(sum);
                if(!numbers.contains(secondSum))
                    numbers.add(secondSum);
            }
        }
        for (int i = 0; i<numbers.size(); i++){
            totalSum = totalSum + numbers.get(i);
        }
        System.out.println("total sum is : "+totalSum);
    }
    public int findFactorsSum(int n){
        int sum = 0;
        //System.out.println("number : "+n);
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0){
                //System.out.println("Factors : "+i);
                sum = sum + i;
            }
        }
        return sum;
    }
}