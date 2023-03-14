public class primes {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int counter = 0;
        int currentNum = 2;
        while(counter < 10001){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(currentNum); i++){
                if (currentNum % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(currentNum);
                counter++;
            }
        currentNum++;

        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed + " millisecond");
    }
}
