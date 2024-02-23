public class Example {
    final int a;  // Declare a final variable

    // Constructor to initialize 'a'
    public Example(int initialValue) {
        this.a = initialValue;
    }

    public static void main(String[] args) {
        Example example = new Example(42);  
        System.out.println("The valuee  off 'a': " + example.a);
    }
}



