public class Main {
    public static void main(String[] args) {
        // Создаем переменную типа CreditPaymentService и указываем, что ее значением будет класс CreditPaymentService
        CreditPaymentService service = new CreditPaymentService();
        /*
        Отладочные данные

        int amount = 2_367_000;
        double percent = 9.1;
        int term = 240;
        */

        //Вызываем метод calculate класса CreditPaymentService и сразу указываем параметры переменных, которые обозначены внутри CreditPaymentService
        System.out.println ("При оформлении 1 миллиона рублей в займ под 9.99% сроком на один год ");
        System.out.println ("Сумма ежемесячного платежа составит " + Math.round(service.calculate(1_000_000, 9.99, 12)) + " руб.");
        System.out.println ("При оформлении 1 миллиона рублей в займ под 9.99% сроком на два года ");
        System.out.println ("Сумма ежемесячного платежа составит " + Math.round(service.calculate(1_000_000, 9.99, 24)) + " руб.");
        System.out.println ("При оформлении 1 миллиона рублей в займ под 9.99% сроком на три года ");
        System.out.println ("Сумма ежемесячного платежа составит " + Math.round(service.calculate(1_000_000, 9.99, 36)) + " руб.");
    }
}