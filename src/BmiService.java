public class BmiService {
    public float calculate(int massKg, float heightCm) {

        float bmi;

        bmi = heightCm / 100;
        bmi = bmi * bmi;
        bmi = massKg / bmi;

        return bmi;
    }
}
