public class CreditPaymentService {

    // Метод calculate выполняет только расчет ежемесячного платежа исходя из данных о сумме займа, процентной ставке
    // и сроке займа по формуле, представленной
    // на сайте банка https://sovcombank.ru/blog/krediti/kak-rasschitat-annuitetnii-platezh
    public double calculate (int amount, double percent, int term) {

        // расчет, который происходит дальше сложно объяснить без иллюстраций :) Обращайтесь к автору
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