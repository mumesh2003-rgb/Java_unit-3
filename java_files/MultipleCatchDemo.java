public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("General exception occurred");
        }
    }
}
