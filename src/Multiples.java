public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i<1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5){
                count += 1;
            }
            else if (divisibleBy3) {
                count += 1;
            }
            else if (divisibleBy5) {
                count +=1;
            }
            i += 1;
        }
        System.out.println(count);


    }
}