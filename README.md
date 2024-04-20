## Моноиды и их приложения: моноидальные вычисления в деревьях
https://habr.com/ru/articles/112394/

**Документация и пояснение по коду**
> https://mysummaries.notion.site/Java-QuadraticEquation-with-root-from-BinaryTree-3269954fc24b447fa0846cec26d96458?pvs=4

## Выбор между ***lab2_v1.FastOperation*** и ***lab2_v1.FastPowerBigInteger***
1. Если вам нужно работать с обычными числами (например, `int` или `long`), используйте **lab2_v1.FastOperation**.

2. Если вам нужно работать с очень большими числами, используйте **lab2_v1.FastPowerBigInteger**.

### Сложность алгоритмоов 

**lab2_v1.FastOperation**
- Временная сложность алгоритма быстрого возведения числа в степень с помощью бинарного метода для целых чисел равна `(log n)`, где n - значение экспоненты. Это потому, что количество итераций цикла зависит от количества бит в экспоненте.

**lab2_v1.FastPowerBigInteger**
- Также временная сложность алгоритма быстрого возведения числа в степень с использованием BigInteger также составляет `(log n)`, где n - значение экспоненты. Это также связано с количеством итераций цикла, которое зависит от битовой длины экспоненты.