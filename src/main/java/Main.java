import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> taskArrayList = new ArrayList<>();
            taskArrayList.add("Покушать");
            taskArrayList.add("Сходить в магазин");
            taskArrayList.add("Убраться");

            while (true){
                System.out.println("Выберите действие:\n1. Добавить задачу\n2. Вывести список задач\n3. Удалить задачу\n0. Выход\n");

                int enter = scanner.nextInt();
                if (enter == 0){
                    System.out.println("Вы закончили");
                    break;
                }else if (enter == 1){

                    boolean x = true;
                    while (x){
                        System.out.println("Введите задачу:");
                        String enter2 = scanner.nextLine();

                        if (enter2.length() < 5){
                            System.out.println("Задача не может быть пустой или состоять меньше чем из 4 символов");

                        }else{
                            x = false;
                        }
                    }
                }
            }}}