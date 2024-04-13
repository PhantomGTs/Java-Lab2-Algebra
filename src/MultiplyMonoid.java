public class MultiplyMonoid implements Monoid<Integer> {
    public Integer identity() {
        return 1;
    }

    public Integer operate(Integer a, Integer b) {
        return a * b;
    }
}
