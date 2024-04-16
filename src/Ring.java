public interface Ring<T> extends Group<T> {
    T multiply(T a, T b); // Бинарная операция умножения
}

/*
* 1. Исправлено наследование Ringa. Теперь наследуется от Group, которая наследуется от Monoid 13.04.2024
* */