import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class NumberOperations {
    public static void main(String[] args) {
        // створюємо початковий список
        ArrayList<Number> values = new ArrayList<>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        // додаємо нові числа різних типів до початкового списку
        values.addAll(Arrays.asList((short) 15, (short) 45, (byte) 8, (byte) 3, 110L, 125.5f, 300.5f, new BigDecimal("1934.561"), new BigInteger("125447890")));

        // виводимо всі числа зі списку
        System.out.println("Всі числа: " + values);

        // створюємо нові списки під цілі та дробові значення
        ArrayList<Integer> intvalues = new ArrayList<>();
        ArrayList<Double> dvalues = new ArrayList<>();
        // перетворюємо кожне значення у ціле і дробове число та додаємо до відповідних списків
        for (Number value : values) {
            intvalues.add(value.intValue());
            dvalues.add(value.doubleValue());
        }

        // виводимо цілі числа
        System.out.println("У форматі цілих чисел: " + intvalues);

        // виводимо дробові числа
        System.out.print("У форматі дробових чисел з 2 знаками: [");
        for (int i = 0; i < values.size(); i++) {
            System.out.printf(Locale.US, "%.2f", values.get(i).doubleValue());
            if (i < values.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // створюємо мапу для зберігання чисел за типами
        Map<Class<?>, List<Number>> valueMap = new HashMap<>();
        valueMap.put(Integer.class, new ArrayList<>());
        valueMap.put(Double.class, new ArrayList<>());
        valueMap.put(Short.class, new ArrayList<>());
        valueMap.put(Byte.class, new ArrayList<>());
        valueMap.put(Long.class, new ArrayList<>());
        valueMap.put(Float.class, new ArrayList<>());
        valueMap.put(BigDecimal.class, new ArrayList<>());
        valueMap.put(BigInteger.class, new ArrayList<>());

        // робило розподіл значень за типами у мапу
        for (Number value : values) {
            valueMap.get(value.getClass()).add(value);
        }

        // вивід значень за типами
        valueMap.forEach((key, value) ->
                System.out.println(key.getSimpleName() + ": " + value)
        );

        // вивід найбільшого числа зі списку
        System.out.println("Найбільше число: " + findMax(values));
    }
    // метод для знаходження найбільшого числа
    private static Number findMax(List<Number> values) {
        Number maxNumber = values.getFirst(); // беремо найперше значення зі списку як максимальне
        for (Number value : values) {
            if (value.doubleValue() > maxNumber.doubleValue()) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }
}