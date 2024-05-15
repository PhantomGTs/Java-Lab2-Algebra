package lab2_v2.monoid;


public class IntegerMonoid extends AbstractMonoid<Integer> {
    private int value;

    public IntegerMonoid(int value) {
        this.value = value;
    }

    public Integer binaryOperation(Integer other) {
        return this.value * other;
    }

    public Integer neutralElement() {
        return 1;
    }
    public int getValue() {
        return value;
    }
}

