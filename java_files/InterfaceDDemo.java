interface Payment {
    void pay(double amount) throws Exception;
}

class UPI implements Payment {
    public void pay(double amount) throws Exception {
        if (amount > 50000)
            throw new Exception("UPI limit exceeded");
        System.out.println("Payment successful");
    }
}

public class InterfaceDDemo {
    public static void main(String[] args) {
        try {
            Payment p = new UPI();
            p.pay(60000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
