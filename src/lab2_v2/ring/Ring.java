package lab2_v2.ring;

public class Ring<T> {
    private T zero;
    private T one;

    public Ring(T zero, T one)
    {
        this.zero = zero;
        this.one = one;
    }

    public T addition(T a, T b)
    {
        if (a instanceof Integer && b instanceof Integer)
        {
            return (T) (Integer) (((Integer) a) + ((Integer) b));
        }
        return null;
    }

    public T multiplication(T a, T b)
    {
        if (a instanceof Integer && b instanceof Integer) {
            return (T) (Integer) (((Integer) a) * ((Integer) b));
        }
        return null;
    }

    public T negation(T a) {
        if (a instanceof Integer)
        {
            return (T) (Integer) (-(Integer) a);
        }
        return null;
    }

    public T getZero() {
        return zero;
    }

    public T getOne() {
        return one;
    }
}
