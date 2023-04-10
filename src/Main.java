public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1000000;
        int termInMonths = 12;
        double percent = 9.99;
        int monthlyPay = (int) service.calculate(creditAmount, termInMonths, percent);
        System.out.println("Ежемесячный платеж составляет: " + monthlyPay);

    }
}