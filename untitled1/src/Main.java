import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n = 5; // количество объектов
        Dog[] dogs = new Dog[n];
        // создание и заполнение массива объектов

        try {
            FileWriter writer = new FileWriter("output.txt");
            for (Dog dog : dogs) {
                writer.write(dog.getVladelec() + " " + dog.getAge() + "\n");
            }
            writer.close();
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Abs_ut abs_ut = new Abs_ut() {
            @Override
            int Poisk(Basovi[] arr, int n) {
                // реализация метода поиска собаки заданной породы
                return 0;
            }
        };

        // вызов метода Poisk для поиска собаки заданной породы

        Arrays.sort(dogs, (d1, d2) -> d1.getAge() - d2.getAge());
        // сортировка массива объектов по возрасту собаки с помощью лямбда-выражения
    }
}