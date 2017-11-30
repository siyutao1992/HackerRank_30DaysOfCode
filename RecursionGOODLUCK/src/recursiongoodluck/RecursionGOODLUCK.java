
package recursiongoodluck;


public class RecursionGOODLUCK {

    // f(f(f(x)))
    
    public static int Summation(int n) {
        // Base case: we are at the end
        if (n <= 0) {
            return 0;
        } 
        // Recursive Case: keep going
        else {
            return n + Summation(n-1);
        }
    }
    
    public static int Factorial (int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
        }
        // Recursive case:
        else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponentiation(int n, int p) {
        // Base case:
        if (p <= 0) {
            return 1;
        }
        // Recursive case:
        else {
            return n * Exponentiation(n, p-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 4));
        System.out.println(10/3);
    }
    
}
