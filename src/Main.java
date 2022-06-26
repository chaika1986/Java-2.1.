public class Main {
    public static void main(String[] args) {
        int price = 500_000;
        int oneMilePrice = 20;

        int miles = price / oneMilePrice;
        System.out.println("Бонусные мили:" + miles);
    }
}
