public class Euler{
    private long count = 0;
    private long maxCount = 0;
    public long evenFunction(long i){
        i = i/2;
        //System.out.println(i);
        count++;
        if(count>maxCount){
            maxCount = count;
        }
        if(i%2 == 0){
            evenFunction(i);
        }else{
            if(i == 1){
                return count;
            }
            oddFunction(i);
        }
        return 0;
    }
    public long oddFunction(long i){
        i = (3*i) + 1;
        //System.out.println(i);
        count++;
        if(count>maxCount){
            maxCount = count;
        }
        if(i%2 == 0){
            evenFunction(i);
        }else{
            if(i == 1){
                return count;
            }
            oddFunction(i);
        }
        return 0;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getMaxCount() {
        return maxCount;
    }

    public static void main(String gg[]){
        Euler euler = new Euler();
        for(long i = 810000; i<840000; i++){
            euler.setCount(0);
            System.out.println("Number is : "+i);
            if(i%2 == 0){
                euler.evenFunction(i);
            }
            else{
                euler.oddFunction(i);
            }
            System.out.println("Count is : "+euler.getCount());
        }
        System.out.println("Maximum Count is : "+euler.getMaxCount());
    }
}