public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 52; // вес
        double heightM = 1.72; // рост
        int bmi = service.calculate((int) weightKg, heightM); // Должно получиться 28
        System.out.println(bmi);
    }
}
