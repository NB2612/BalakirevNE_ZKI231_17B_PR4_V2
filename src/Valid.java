import java.util.Scanner;

public class Valid {

  private final static Scanner input = new Scanner(System.in);

  //Проверка на ввеление числового символа
  public static int getNextInt() {
    int i;
    while (true) {
      if (input.hasNextInt()) {
        i = input.nextInt();
        input.nextLine();
        break;
      }
      System.out.print("Пожалуйста введите число\n-->");
      input.nextLine();
    }
    return i;
  }

  public static void close() {
    input.close();
  }
}