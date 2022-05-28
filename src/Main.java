public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initialAmount = 2000; // начальная сумма на счете
        int replenishmentAmount = 1234; // сумма пополнения
        int countOfBonus; // количество бонусов

        if (replenishmentAmount > 1000) {
            countOfBonus = replenishmentAmount / 100;
        } else {
            countOfBonus = 0;
        }

        int totalAmount = initialAmount + replenishmentAmount + countOfBonus; // Итоговая сумма


        System.out.println("Ваш счет: " + totalAmount + " рублей." + " Количество бонусов: " + countOfBonus + " рублей.");


    }


}
