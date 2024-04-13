public class BooleanRing implements Ring<Boolean> {
    @Override
    public Boolean identity() {
        return true; // Логическая истина как нейтральный элемент
    }

    @Override
    public Boolean operate(Boolean a, Boolean b) {
        return a && b; // Логическое И как операция сложения
    }

    @Override
    public Boolean inverse(Boolean a) {
        return !a; // Отрицание как операция взятия обратного элемента
    }

    @Override
    public Boolean multiply(Boolean a, Boolean b) {
        return a && b; // Логическое И как операция умножения
    }
}
