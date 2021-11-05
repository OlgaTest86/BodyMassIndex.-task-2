public class BmiService {

    public double calculate (double weight) {
        double height = 1.72;
        double bodyMassIndex = weight / Math. pow(height,2);

        return bodyMassIndex;
    }
}
