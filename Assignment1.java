class Assignment1 {

  public static int[] findLeapYears(int year) {

    int[] result = new int[15];
    int count = 0;
    int currentYear = year;

    while (count < 15) {

      if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
        result[count] = currentYear;
        count++;
      }

      currentYear++;
    }

    return result;
  }

  public static void main(String[] args) {

    int year = 2000;
    int[] leapYears;

    leapYears = findLeapYears(year);

    for (int index = 0; index < leapYears.length; index++) {
      System.out.println(leapYears[index]);
    }
  }
}