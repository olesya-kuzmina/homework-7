import java.util.Arrays;
import java.util.Comparator;

public class Task03 {
    private String[] array;

    public Task03(String[] array) {
        this.array = array;
    }

    // Вывод содержимого массива в строку через пробел
    public String arrayToString() {
        return String.join(" ", array);
    }

    // Сортировка массива в обратном порядке (без учета регистра) от z до a
    public void sortReverseOrder() {
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER.reversed());
    }

    // Сортировка массива по количеству слов в строке
    public void sortByWordCount() {
        Arrays.sort(array, Comparator.comparingInt(this::countWords));
    }

    // Метод для подсчета количества слов в строке
    private int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println("Задание №3:");

        String[] array = {"Hello World", "Java is fun", "Programming is awesome"};
        Task03 utils = new Task03(array);

        // Вывод содержимого массива в начальном порядке
        System.out.println("Исходный массив: " + utils.arrayToString());

        // Сортировка массива в обратном порядке
        utils.sortReverseOrder();
        System.out.println("Массив в обратном порядке: " + utils.arrayToString());

        // Сортировка массива по количеству слов в строке
        utils.sortByWordCount();
        System.out.println("Массив, отсортированный по количеству слов: " + utils.arrayToString());
    }
}
