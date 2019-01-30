//this takes half n hr
public class euler {
    long count = 0;
    public long getPrime(long a){
        for(long i = 2; i<a; i++){
            for(long j = 2; j<i; j++){
                if(i%j == 0){
                    break;
                }
                if(j > i/2){
                    System.out.println(i);
                    count = count+i;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String gg[]){
        euler e = new euler();
        System.out.println("count is : "+e.getPrime(2000000));
    }
}
