public class IntegerRing implements Ring<Integer> {
    @Override
    public Integer identity() {
        return 0;
    }

    @Override
    public Integer operate(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer inverse(Integer a) {
        return -a;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}
