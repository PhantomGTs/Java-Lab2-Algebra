import java.util.ArrayList;
import java.util.List;

public class Polynomial<T> {
    private List<T> coefficients;
    private Ring<T> ring;

    public Polynomial(List<T> coefficients, Ring<T> ring) {
        this.coefficients = coefficients;
        this.ring = ring;
    }

    public List<T> getCoefficients() {
        return coefficients;
    }

    public Polynomial<T> multiply(Polynomial<T> other) {
        int m = this.coefficients.size();
        int n = other.coefficients.size();

        List<T> resultCoefficients = new ArrayList<>(m + n - 1);

        for (int i = 0; i < m + n - 1; i++) {
            resultCoefficients.add(ring.identity());
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                T product = ring.multiply(this.coefficients.get(i), other.coefficients.get(j));
                T current = resultCoefficients.get(i + j);
                resultCoefficients.set(i + j, ring.operate(current, product));
            }
        }

        return new Polynomial<>(resultCoefficients, ring);
    }
}
