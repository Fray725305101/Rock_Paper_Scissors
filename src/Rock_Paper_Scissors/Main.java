package Rock_Paper_Scissors;

import java.util.Scanner; //test
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int vasya = choose("Вася");
        int petya = choose("Петя");

        if (vasya != petya) {
            int[] result = {vasya, petya};
            if (!(result[0] + result[1] == 2 && Math.abs(result[0] - result[1]) == 2)) {

            }
        } else {
            System.out.print("Ничья!");
        }

    };

    public static Integer choose(String name) {
        Random randomChoose = new Random();
        int choose = randomChoose.nextInt(3);
        if (choose == 0) {
            System.out.println(name+" выкинул камень");
        } else if (choose == 1) {
            System.out.println(name+" выкинул ножницы");
        } else {
            System.out.println(name+" выкинул бумагу");
        }
        return choose;
    }
}
