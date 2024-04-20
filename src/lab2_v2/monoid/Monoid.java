package lab2_v2.monoid;

public interface Monoid<T> {
    T identity(); // Нейтральный элемент

    T operate(T a, T b); // Бинарная операция
}
