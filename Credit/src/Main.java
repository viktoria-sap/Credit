public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double percent = 9.99;
        long credit = 1_000_000;
        double periodInMonths = 36;
        double payment = service.calculate(percent, credit, periodInMonths);
        System.out.println(payment);
    }
}
