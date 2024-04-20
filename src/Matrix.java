import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {
    private T[][] elements; // Матрица элементов
    private Ring<T> ring; // Кольцо, используемое для операций

    // Конструктор класса
    public Matrix(T[][] elements, Ring<T> ring, Class<T> clazz) {
        this.ring = ring;
        this.elements = createArray(elements.length, elements[0].length, clazz); // Создание массива элементов

        // Копирование элементов из входного массива в матрицу
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    // Создание массива заданного размера
    private T[][] createArray(int rows, int cols, Class<T> clazz) {
        return (T[][]) java.lang.reflect.Array.newInstance(clazz, rows, cols);
    }

    // Получение элементов матрицы
    public T[][] getElements() {
        return elements;
    }

    // Умножение матрицы на другую матрицу
    public Matrix<T> multiply(Matrix<T> other) {
        int m = this.elements.length; // Количество строк первой матрицы
        int n = other.elements[0].length; // Количество столбцов второй матрицы
        int p = other.elements.length; // Количество строк второй матрицы

        // Проверка соответствия размеров матриц для умножения
        if (this.elements[0].length != p) {
            System.out.println("Разные размеры матриц");
            return null;
        }

        // Создание массива для результата умножения
        T[][] result = createArray(m, n, (Class<T>) this.elements[0][0].getClass());

        // Умножение матриц
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = ring.identity(); // Инициализация элемента результата
                for (int k = 0; k < p; k++) {
                    // Вычисление элемента результата как суммы произведений элементов
                    result[i][j] = ring.operate(result[i][j], ring.multiply(this.elements[i][k], other.elements[k][j]));
                }
            }
        }

        // Возвращение результата умножения в виде новой матрицы
        return new Matrix<>(result, ring, (Class<T>) this.elements[0][0].getClass());
    }

    // Метод для преобразования полинома в матрицу
    public Polynomial<T> toPolynomial() {
        // Пункт 1
        List<T> polyCoefficients = new ArrayList<>();

        // Пункт 2
        for (int i = 0; i < elements.length; i++) {
            polyCoefficients.add(elements[i][i]); // Берем элементы с индексом i из каждой строки в качестве коэффициентов
        }

        // Пункт 3
        return new Polynomial<>(polyCoefficients, ring);
    }

    /* toPolynomial
     * 1. Создается новый список polyCoefficients, который будет содержать коэффициенты полинома.
     * 2. В цикле происходит итерация по элементам матрицы elements. При этом берется элемент с индексом i из каждой строки и добавляется в список polyCoefficients в качестве коэффициента.
     * 3. Создается новый объект полинома, используя полученные коэффициенты и кольцо ring, и возвращается в качестве результата.
     * */

}
