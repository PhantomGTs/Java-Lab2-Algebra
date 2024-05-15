package lab2_v2.group;

import lab2_v2.monoid.*;
public class AdditiveIntegerGroup extends AbstractGroup<IntegerMonoid> {
    private IntegerMonoid value;

    public AdditiveIntegerGroup(int value) {
        this.value = new IntegerMonoid(value);
    }

    @Override
    public IntegerMonoid binaryOperation(IntegerMonoid other) {
        return new IntegerMonoid(this.value.getValue() + other.getValue());
    }

    @Override
    public IntegerMonoid neutralElement() {
        return new IntegerMonoid(0);
    }

    @Override
    public IntegerMonoid inverseElement() {
        return new IntegerMonoid(-this.value.getValue());
    }
}
