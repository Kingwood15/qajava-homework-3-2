public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi1 = service.calculate(80, 175);
        System.out.println("Ожидаемый результат: 26,12. Фактический результат: " + bmi1);

        float bmi2 = service.calculate(55, 175);
        System.out.println("Ожидаемый результат: 17,95. Фактический результат: " + bmi2);

        float bmi3 = service.calculate(45, 155);
        System.out.println("Ожидаемый результат: 18,73. Фактический результат: " + bmi3);

        float bmi4 = service.calculate(125, 140);
        System.out.println("Ожидаемый результат: 63,77. Фактический результат: " + bmi4);
    }
}
