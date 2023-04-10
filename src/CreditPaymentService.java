public class CreditPaymentService {
        public double calculate(double creditAmount, double termInMonths, double percent) {
            double monthlyPercent = percent / 100 / 12;
            double result = (creditAmount * monthlyPercent) / ( 1 - Math.pow ( 1 + monthlyPercent, - termInMonths)) ;
            return (int) result;
        }
    }

