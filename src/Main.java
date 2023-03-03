public class Main {
    public static int calcPayment(int start, int amount, int years){
        int monthlyPayment = (amount - start) / (years * 12);
        return monthlyPayment;
    }

    public static void main(String[] args) {
        int first = 200_000;
        int cost = 2600_000;
        int creditPeriod = 2;

        int result = calcPayment(first, cost, creditPeriod);

        System.out.println(result);

    }
}
