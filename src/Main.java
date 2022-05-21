public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.55;
        int weight = 54;
        double Bmi = service.calculate(height, weight);
        System.out.printf("%.1f",Bmi);
    }
}