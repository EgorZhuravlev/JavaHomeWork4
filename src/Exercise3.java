import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Заполняем список элементами
        list.add(25);
        list.add(33);
        list.add(75);
        list.add(42);
        list.add(1);

        // Создаем итератор для списка
        ListIterator<Integer> iterator = list.listIterator();

        // Суммируем все элементы списка
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        // Выводим сумму на экран
        System.out.println("Сумма всех элементов списка: " + sum);
    }
}
