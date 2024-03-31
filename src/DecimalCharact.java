public class DecimalCharact implements NumCharact {

  @Override
  public int count(int number) {
    //Лямбда выражение для подсчета количества символов в десятичной записи числа
    /*
      Преобразуем число в строку
      и считаем его длинну
     */
    NumCharact numCharact = (n) -> String.valueOf(n).length();
    return numCharact.count(number);
  }
}
