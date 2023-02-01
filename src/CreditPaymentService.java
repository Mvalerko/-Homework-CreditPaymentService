public class CreditPaymentService {


    public double calculate (int amount, double percent, int term) {


        double result;
        double pM = percent / 100;
        double cof = pM / 12;

        double multiplier = 1 + cof;
        double multiplierM = Math.pow(multiplier,term);
        double divider = multiplierM - 1;

        double stepOne = amount * cof * multiplierM;

        double stepTwo = stepOne / divider;

        return result = stepTwo;

    }
}