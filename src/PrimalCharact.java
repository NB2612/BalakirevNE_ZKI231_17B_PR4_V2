public class PrimalCharact implements NumCharact {

  @Override
  public int count(int number) {
    /*
    Лямбда выражение для подъсчета
    количества различных простых чисел, являющихся множителями данного числа.
     */
    NumCharact numCharact = n -> {
      int count = 0;
      //Применяем к числу модуль для избавления от знака -
      n = Math.abs(n);
      //Проверяем если число равно 0, то возвращаем количество делителей 0
      if (n == 0) {
        return count;
      }
      /*
        Если число делится на i без остатка
        то добавляем в счетчик чисел +1
        уменьшаем наше число на i
        Если число делится на i с остатком
        то к i добавляем +1
        Если число дошло до 1 завершаем цикл
      */
      for (int i = 2; i <= n; i++) {
        while (n % i == 0) {
          count++;
          n /= i;
        }
      }
      return count;
    };
    return numCharact.count(number);
  }
}
