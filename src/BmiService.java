public class BmiService {
    public double calculate(double height, int weight) {
        double Bmi = weight / (height * height);
        return Bmi;
    }
}
