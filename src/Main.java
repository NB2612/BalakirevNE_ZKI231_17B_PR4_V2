interface NumCharact { //Интерфейс для определения характеристики числа
  int count(int number);
}

class DecimalNotation implements NumCharact {
  // Класс для подсчета количества символов в десятичной записи числа
  @Override
  public int count(int number) {
    //Преобразуем число встроку и возвращаем его длинну
    return String.valueOf(number).length();
  }
}

//Класс для подсчета количество различных простых чисел,
// являющихся множителями данного числа.
class PrimeFactors implements NumCharact {
  @Override
  public int count(int number) {
    int count = 0;
    number = Math.abs(number);
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
  }
}


public class Main {

  public static void main(String[] args) {
    int choise, number;
    do {
      System.out.print("""
          1 - Ввести число
          0 - Завершение работы
          -->\s""");
      choise = Valid.getNextInt();
      if (choise == 1) {
        System.out.print("Введите число: ");
        number = Valid.getNextInt();
        NumCharact numCharact = new DecimalNotation();
        System.out.println("Количсетво символов в десятичной записи числа " + number +
            " равно " + numCharact.count(number));
        numCharact = new PrimeFactors();
        System.out.println(" Количсетво различных простых множителей числа " + number +
            " равно " + numCharact.count(number));
      } else if (choise == 0) {
        System.out.println("Завершение работы");
      } else {
        System.out.println("Пункт меню не найден");
      }
    } while (choise != 0);
    Valid.close();
  }
}