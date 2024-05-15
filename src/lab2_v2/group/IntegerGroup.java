package lab2_v2.group;


public class IntegerGroup extends AbstractGroup<Integer> {
    private int value;

    public IntegerGroup(int value) {
        this.value = value;
    }

    @Override
    public Integer binaryOperation(Integer other) {
        return this.value + other;
    }

    @Override
    public Integer neutralElement() {
        return 0;
    }

    @Override
    public Integer inverseElement() {
        return -this.value;
    }
}
