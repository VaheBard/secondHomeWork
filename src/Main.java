import ru.netology.finances.Finances;

public class Main {
    public static void main(String[] args) {
        int first = 200_000;
        int cost = 2600_000;
        int creditPeriod = 2;

        int result = Finances.calcPayment(first, cost, creditPeriod);

        System.out.println(result);

    }
}
