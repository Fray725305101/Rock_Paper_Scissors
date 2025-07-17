package Rock_Paper_Scissors;

import java.util.Scanner;
import java.util.Random; // Импортируем библиотеку для генерации случайных чисел

public class Main {
    public static void main(String[] args) {
        int vasya = choose("Вася"); // Определяем выбор Васи
        int petya = choose("Петя"); // Определяем выбор Пети

        if (vasya != petya) { // Если Вася и Петя выкинули не одно и то же
            if (!((vasya + petya == 2) && Math.abs(vasya - petya) == 2)) { // И это не камень и бумага
                if (vasya < petya) { // В типовых случаях побеждает меньшее значение
                    System.out.println("Вася победил!");
                } else {
                    System.out.println("Петя победил!");
                }
            } else { // Случай с камнем и бумагой. Здесь побеждаем большее
                if (vasya > petya) {
                    System.out.println("Вася победил!");
                } else {
                    System.out.println("Петя победил!");
                }
            }
        } else { // А если Вася и Петя выкинули одно и то же
            System.out.print("Ничья!"); // То ничья
        }
    };

    public static Integer choose(String name) { // Метод генерации значений для Васи или Пети
//        Random randomChoose = new Random(); // Создаём объект randomChoose
        Scanner scanner = new Scanner(System.in);
//        int choose = randomChoose.nextInt(3); // Генерим в переменную число от 0 до 2
        System.out.print("Введите выбор "+name+": ");
        int choose = scanner.nextInt();
        if (choose == 0) { // Здесь и ниже описание того или иного результата
            System.out.println(name+" выкинул камень");
        } else if (choose == 1) {
            System.out.println(name+" выкинул ножницы");
        } else {
            System.out.println(name+" выкинул бумагу");
        }
        return choose; // Возвращаем значение выбора
    }
}
