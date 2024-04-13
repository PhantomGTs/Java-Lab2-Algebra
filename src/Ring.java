public interface Ring<T> extends Monoid<T>, Group<T> {
    T multiply(T a, T b); // Бинарная операция умножения
}
