public class Euler{
    public static void main(String gg[]) {
        long count = 0;
        Euler euler = new Euler();
        for(int i = 1; i<=999; i++){
            String word = euler.convertToWord(i);
            System.out.println(word);
            count = count + euler.wordCount(word);
            System.out.println("word count is : "+count);
        }
    }
    public int wordCount(String word){
        word = word.replaceAll("\\s+","");
        return word.length();
    }
    public String convertToWord(int i){
        String num = Integer.toString(i);
        int len = num.length();
        String [] firstDigit = new String[]{ "zero", "one",
                "two", "three", "four",
                "five", "six", "seven",
                "eight", "nine"};
        String [] twoDigit = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String [] secondDigit = new String[]{"twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        String [] thirdDigit = new String[] {"hundred", "and"};
        if(len == 1){
            return firstDigit[i];
        }
        if(len == 2){
            if(i>9 && i<20){
                int a = i%10;
                return twoDigit[a];
            }
            else{
                if(i%10 == 0){
                    int a = (i/10) - 2;
                    return secondDigit[a];
                }else{
                    String temp = Integer.toString(i);
                    //System.out.println("temp value : "+temp);
                    int[] newGuess = new int[temp.length()];
                    for (int j = 0; j < temp.length(); j++)
                    {
                        newGuess[j] = temp.charAt(j) - '0';
                    }
                    String formedWord = "";
                    formedWord = formedWord.concat(secondDigit[newGuess[0] - 2]);
                    formedWord = formedWord.concat(firstDigit[newGuess[1]]);
                    return formedWord;
                }
            }
        }
        if(len == 3){
            if(i%100 == 0){
                String temp = Integer.toString(i);
                //System.out.println("temp value : "+temp);
                int[] newGuess = new int[temp.length()];
                for (int j = 0; j < temp.length(); j++)
                {
                    newGuess[j] = temp.charAt(j) - '0';
                }
                String formedWord = "";
                formedWord = formedWord.concat(firstDigit[newGuess[0]]);
                formedWord = formedWord.concat(thirdDigit[newGuess[2]]);
                return formedWord;
            }
            else{
                String temp = Integer.toString(i);
                //System.out.println("temp value : "+temp);
                int[] newGuess = new int[temp.length()];
                for (int j = 0; j < temp.length(); j++)
                {
                    newGuess[j] = temp.charAt(j) - '0';
                }
                if(newGuess[1] == 0) {
                    String formedWord = "";
                    formedWord = formedWord.concat(firstDigit[newGuess[0]]);
                    formedWord = formedWord.concat(thirdDigit[0]);
                    formedWord = formedWord.concat(thirdDigit[1]);
                    formedWord = formedWord.concat(firstDigit[newGuess[2]]);
                    return formedWord;
                }
                if(newGuess[1] == 1){
                    String formedWord = "";
                    formedWord = formedWord.concat(firstDigit[newGuess[0]]);
                    formedWord = formedWord.concat(thirdDigit[0]);
                    formedWord = formedWord.concat(thirdDigit[1]);
                    formedWord = formedWord.concat(twoDigit[newGuess[2]]);
                    return formedWord;
                }
                else {
                    String formedWord = "";
                    formedWord = formedWord.concat(firstDigit[newGuess[0]]);
                    formedWord = formedWord.concat(thirdDigit[0]);
                    formedWord = formedWord.concat(thirdDigit[1]);
                    formedWord = formedWord.concat(secondDigit[newGuess[1] - 2]);
                    if(newGuess[2] == 0){
                        formedWord = formedWord.concat("");
                    }
                    else {
                        formedWord = formedWord.concat(firstDigit[newGuess[2]]);
                    }
                    return formedWord;
                }
            }
        }
        return null;
    }
}