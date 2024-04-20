package lab2_v1;

public interface Ring<T> extends Group<T> {
    T multiply(T a, T b); // Бинарная операция умножения
}

/*
 * 1. Исправлено наследование Ringa. Теперь наследуется от lab2_v1.Group, которая наследуется от lab2_v1.Monoid 13.04.2024 - DONE
 * */