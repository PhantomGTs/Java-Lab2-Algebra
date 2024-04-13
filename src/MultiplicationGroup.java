public class MultiplicationGroup implements Group<Double> {
    @Override
    public Double identity() {
        return 1.0; // Нейтральный элемент для умножения
    }

    @Override
    public Double operate(Double a, Double b) {
        return a * b; // Операция умножения
    }

    @Override
    public Double inverse(Double a) {
        if (a == 0) {
            throw new ArithmeticException("Cannot find inverse of zero");
        }
        return 1.0 / a; // Обратный элемент для умножения
    }
}

