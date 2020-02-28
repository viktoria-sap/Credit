public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double percent = 0.0999;
        long credit = 1_000_000;
        double periodInMonths = 12;

        double payment = service.calculate(percent, credit, 12);
        System.out.println(payment);
        double payment1 = service.calculate(percent, credit, 24);
        System.out.println(payment1);
        double payment2 = service.calculate(percent, credit, 36);
        System.out.println(payment2);
    }
}
