public class Euler{
    public static void main(String gg[]){
        int sundayCount = 0;
        String year = "";
        String day = "tuesday";
        String month = "";
        int [] noOfDaysInNonLeapYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int [] noOfDaysInLeapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String [] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};
        int l = 1;
        for(int i = 1901;i<=2000; i++){
            year = "non leap year";
            if(i%4 == 0){
                year = "leap year";
            }
            int j = 0;
            if(year.equals("non leap year")){
            for(String m : months){
                System.out.println(m);
                for(int k = 1; k<=noOfDaysInNonLeapYear[j]; k++){
                    if(l == 7){
                        l = 0;
                    }
                    System.out.println("Date : "+k+" Day : "+days[l]);
                    if(k ==1 && days[l].equals("sunday")){
                        sundayCount++;
                    }
                    l++;
                }
                j++;
            }
                System.out.println("sunday count is : "+sundayCount);
            }
            else{
                for(String m : months){
                    System.out.println(m);
                    for(int k = 1; k<=noOfDaysInLeapYear[j]; k++){
                        if(l == 7){
                            l = 0;
                        }
                        System.out.println("Date : "+k+" Day : "+days[l]);
                        if(k ==1 && days[l].equals("sunday")){
                            sundayCount++;
                        }
                        l++;
                    }
                    j++;
                }
                System.out.println("sunday count is : "+sundayCount);
            }
        }
    }
}