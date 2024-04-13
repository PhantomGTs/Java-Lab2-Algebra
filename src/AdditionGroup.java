public class AdditionGroup implements Group<Integer> {
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
}
