import java.io.IOException;
import java.util.Scanner;

public class LoaderCat {
    static String name;
    static int age = 0;
    static double weight = 3.0;
    static byte hunger = 0;
    static byte needgames = 0;

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        boolean program = true;
        char menu = '0';
        System.out.println("Добро пожаловать в CatLive!");
        System.out.println("Давайте создадим вашего первого питомца");
//        Создаем кота:
        System.out.print("Введите имя вашего питомца: ");
        name = scanner.nextLine();

//        Кота создали.
//        Меню состояния кота
        while (program) {
            for (int variants = 0; variants < 500; variants++) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                if (variants < 1) {
                    System.out.println("Мы создали нашего кота! Давайте посмотрим на его состояние");
                }
                System.out.println("Выберите и введите пункт меню, для обзора действий с котом:");
                System.out.println("1. Состояние кота");
                System.out.println("2. Кормление кота");
                System.out.println("3. Поиграть с котом");
                System.out.println("\"S\" - для выключения программы");
                menu = scanner.next().charAt(0);
                switch (menu) {
                    case '1':
                        System.out.println("Возраст кота: " + age);
                        System.out.println("Вес: " + weight + " кг");
                        System.out.println("Голод: " + hunger);
                        System.out.println("Игры: " + needgames);
                        System.out.println("Введите любую клавишу, что бы выйти из меню");
                        menu = scanner.next().charAt(0);
                        break;
                    case '2':
                        cateating();
                        break;
                    case '3':
                        catgames();
                        break;
                    case 'S':
                        variants = 501;
                        program = false;
                        break;
                    default:
                        System.out.println("Неверная команда, повторите ввод.");
                }
                if (variants >= 20) {
                    age += 1;
                }
                hunger -= 5;
                if (hunger <= 0) {
                    hunger = 0;
                }
                weight -= 0.1;
            }
        }
    }

    public static void cateating() throws IOException, InterruptedException {
        char eatmenu;
        boolean eatHunger = true;
        Scanner scanner = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        while (eatHunger) {
            byte cycles = 0;
            while (cycles < 1) {
                cycles += 1;
                if (hunger >= 50) {
                    System.out.println("Похоже кот не голоден");
                    System.out.println("введите \"x\" для выхода");
                } else {
                    System.out.println("Выберите блюдо:");
                    System.out.println("1. Консервы с тунцом");
                    System.out.println("2. Кроличий паштет");
                    System.out.println("3. Колбаса со стола");
                    eatmenu = scanner.next().charAt(0);
                    switch (eatmenu) {
                        case '1':
                            System.out.println("Кот благодарен вам и, похоже он набрал лишние 20 грамм. Давайте поиграем с " + name);
                            System.out.println("введите \"x\" для выхода");
                            hunger += 40;
                            weight += 0.20;
                            break;
                        case '2':
                            System.out.println("Кот благодарен вам и, похоже он набрал лишние 40 грамм. Давайте поиграем с " + name);
                            System.out.println("введите \"x\" для выхода");
                            hunger += 60;
                            weight += 0.40;
                            break;
                        case '3':
                            System.out.println("Кот благодарен вам и, похоже он набрал лишние 60 грамм. Давайте поиграем с " + name);
                            System.out.println("введите \"x\" для выхода");
                            hunger += 80;
                            weight += 0.60;
                            break;
                        default:
                            System.out.println("Неверная команда, попробуйте занового. Введите \"x\" для выхода");
                            break;
                    }
                    if (hunger >= 100) {
                        hunger = 100;
                    }
                }
                eatmenu = scanner.next().charAt(0);
                if (eatmenu == 'x') {
                    eatHunger = false;
                } else
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                System.out.println("Неверная команда, попробуйте еще раз");
            }
        }
    }

    public static void catgames() throws IOException, InterruptedException {
        char gamemenu;
        Scanner scanner = new Scanner(System.in);
        for (int game = 0; game < 100; game += 50) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            if (needgames >= 100) {
                System.out.println("Кажется кот наигрался и хочет поесть");
            } else if (hunger <= 20 || hunger >= 90) {
                System.out.println("Я не могу играть потому что голоден или много съел");
                System.out.println("Кот развернулся и ушел спать");
            } else {
                needgames += 50;
                System.out.println("Поиграли хорошо + " + needgames);
                hunger -= 60;
                weight -= 0.3;
            }
            System.out.println("Введите \"x\" для выхода");
            gamemenu = scanner.next().charAt(0);
            switch (gamemenu) {
                case 'x' -> game = 100;
                default -> System.out.println("Неверно введена команда");
            }
        }
    }
}