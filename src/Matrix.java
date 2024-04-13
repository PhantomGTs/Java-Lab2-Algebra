import java.lang.reflect.Array;

public class Matrix<T> {
    private T[][] elements;
    private Ring<T> ring;

    public Matrix(T[][] elements, Ring<T> ring, Class<T> clazz) {
        this.ring = ring;
        this.elements = createArray(elements.length, elements[0].length, clazz);

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    private T[][] createArray(int rows, int cols, Class<T> clazz) {
        return (T[][]) Array.newInstance(clazz, rows, cols);
    }

    public T[][] getElements() {
        return elements;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        int m = this.elements.length;
        int n = other.elements[0].length;
        int p = other.elements.length;

        if (this.elements[0].length != p) {
            throw new IllegalArgumentException("Разные размеры матриц");
        }

        T[][] result = createArray(m, n, (Class<T>) this.elements[0][0].getClass());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = ring.identity();
                for (int k = 0; k < p; k++) {
                    result[i][j] = ring.operate(result[i][j], ring.multiply(this.elements[i][k], other.elements[k][j]));
                }
            }
        }

        return new Matrix<>(result, ring, (Class<T>) this.elements[0][0].getClass());
    }
}
