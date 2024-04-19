import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int length;
        System.out.println("Введите размер массива");
        length = console.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + i + " элемент массива");
            numbers[i] = console.nextInt();
        }

        int x = 7;
        int y = 19;
        int z = 85;
        int[] constants = {x, y, z};

        for (int i = 0; i < length; i++) {
          for (int j: constants) {
              if (numbers[i] == j) {
                  System.out.println(i + " элемент массива равен " + j);
                  System.out.println("Данное значение имеется в константах");
              }
          }
        }
    }
}