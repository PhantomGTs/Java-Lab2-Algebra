package lab2_v2;
import lab2_v2.monoid.*;
import lab2_v2.group.*;
import lab2_v2.ring.*;
import lab2_v2.matrix.*;
public class main {
    public static void main(String[] args)
    {
        // Группа с умножением
        MultiplicativeIntegerGroup multiplicativeGroup = new MultiplicativeIntegerGroup(5);
        System.out.println("Группа с умножением:");
        System.out.println("Бинарная операция 5 * 3 = " + multiplicativeGroup.binaryOperation(new IntegerMonoid(3)).getValue());
        System.out.println("Нейтральный элемент: " + multiplicativeGroup.neutralElement().getValue());
        System.out.println("Обратный элемент: " + multiplicativeGroup.inverseElement().getValue());

        System.out.println();

        // Группа со сложением
        AdditiveIntegerGroup additiveGroup = new AdditiveIntegerGroup(5);
        System.out.println("Группа со сложением:");
        System.out.println("Бинарная операция 5 + 3 = " + additiveGroup.binaryOperation(new IntegerMonoid(3)).getValue());
        System.out.println("Нейтральный элемент: " + additiveGroup.neutralElement().getValue());
        System.out.println("Обратный элемент: " + additiveGroup.inverseElement().getValue());

        Ring<Integer> ring = new Ring<>(0, 1);
        Matrix<Integer> matrix1 = new Matrix<>(ring, 2, 2);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix<Integer> matrix2 = new Matrix<>(ring, 2, 2);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        Matrix<Integer> resultAddition = matrix1.add(matrix2);
        System.out.println("Matrix Addition:");
        resultAddition.printMatrix();

        Matrix<Integer> resultMultiplication = matrix1.multiply(matrix2);
        System.out.println("\nMatrix Multiplication:");
        resultMultiplication.printMatrix();
    }
}
