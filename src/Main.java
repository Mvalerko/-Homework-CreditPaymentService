public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        int term = 36;
        double payment = service.calculate(amount, percent, term);
        System.out.printf("%.3f", payment);
    }
}