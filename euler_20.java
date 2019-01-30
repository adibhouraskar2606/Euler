//get the value of !100 by below python program
//n = 1
//for i in range(1,101):
//    n = n * i
//print(n)

public class Euler{
    public static void main(String gg[]) {
        int a = 0;
        String m = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
        char [] numbers = m.toCharArray();
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            a = a + Character.getNumericValue(numbers[i]);
            System.out.println("value of a : "+a);
        }
        System.out.println("sum is : "+ a);
    }
}