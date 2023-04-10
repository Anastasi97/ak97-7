public class CreditPaymentService {
        public double calculate(double a, double b, double c) {
            double monthlyPercent = c / 100 / 12;
            double result = (a * monthlyPercent) / ( 1 - Math.pow ( 1 + monthlyPercent, - b)) ;
            return (int) result;
        }
    }

