public class primeForChallenge {
    public static void main(String[] args){
        for(int n = 1; n<=1000; n++){
            int primeCounter = 0;
            if (isPrime(n)){
                System.out.println(n + "is a prime number");
                primeCounter++;
            }
            if (primeCounter>=3){
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor<=wholeNumber/2; divisor++){
            if((wholeNumber%divisor) == 0){
                return false;
            }
        }
        return true;
    }
}
