public class PrimeChecker{
    static class Prime{
        static boolean isPrime(int num){
            if(num==1){
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args){
        int numberToCheck=17;
    
    if (Prime.isPrime(numberToCheck)) {
        System.out.println(numberToCheck + " is a prime number.");
    } else {
        if (numberToCheck % 2 == 0) {
            System.out.println(numberToCheck + " is not a prime number, it is even.");
        } else {
            System.out.println(numberToCheck + " is not a prime number, it is odd.");
        }
    }
}
}

// public static void main(String[] args){
//     int numberToCheck=17;
//     if(Prime.isPrime(numberToCheck)){
//         System.out.println(null);
//     }
// }
