class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

public class demo {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 9;
        
        // Create an instance of Calculator
        Calculator calc = new Calculator();
        
        // Call the add method and store the result
        int result = calc.add(num1, num2);
        
        // Print the result
        System.out.println(result);
    }
}