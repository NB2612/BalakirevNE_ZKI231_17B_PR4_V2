public class Main {

  public static void main(String[] args) {
    int choise, insertNum;
    do {
      System.out.print("""
          1 - Ввести число
          0 - Завершение работы
          -->\s""");
      choise = Valid.getNextInt();
      if (choise == 1) {
        NumCharact numCharact;
        System.out.print("Введите число: ");
        insertNum = Valid.getNextInt();
        numCharact = new DecimalCharact();
        System.out.println("Количсетво символов в десятичной записи числа " + insertNum +
            " равно " + numCharact.count(insertNum));
        numCharact = new PrimalCharact();
        System.out.println("Количсетво различных простых множителей числа " + insertNum +
            " равно " + numCharact.count(insertNum));
      } else if (choise == 0) {
        System.out.println("Завершение работы");
      } else {
        System.out.println("Пункт меню не найден");
      }
    } while (choise != 0);
    Valid.close();
  }
}

