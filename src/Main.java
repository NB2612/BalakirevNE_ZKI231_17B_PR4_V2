public class Main {

  public static void main(String[] args) {
    int choise, result, insertNum;
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

        //Лямбда выражение для подсчета количества символов в десятичной записи числа
        numCharact = (number) -> String.valueOf(number).length();
        result = numCharact.count(insertNum);
        System.out.println("Количсетво символов в десятичной записи числа " + insertNum +
            " равно " + result);

        //Лямбда выражение для подъсчета количества различных простых чисел, являющихся множителями данного числа.
        numCharact = (number) -> {
          int count = 0;
          //Применяем к числу модуль для избавления от знака -
          number = Math.abs(number);
          //Проверяем если число равно 0, то возвращаем количество делителей 0
          if (number == 0) {
            return count;
          }
          // Если число делится на i без остатка
          // то добавляем в счетчик чисел +1
          // уменьшаем наше число на i
          // Если число делится на i с остатком
          // то к i добавляем +1
          // Если число дошло до 1 завершаем цикл
          for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
              count++;
              number /= i;
            }
          }
          return count;
        };
        result = numCharact.count(insertNum);
        System.out.println("Количсетво различных простых множителей числа " + insertNum +
            " равно "+ result);
      } else if (choise == 0) {
        System.out.println("Завершение работы");
      } else {
        System.out.println("Пункт меню не найден");
      }
    } while (choise != 0);
    Valid.close();
  }
}