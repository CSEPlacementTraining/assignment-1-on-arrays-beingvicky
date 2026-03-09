class Assignment1 {
  public static int[] findLeapYears(int year) {
    int[] result = new int[15];
    int count = 0;
    int currentYear = year;
    while (count < 15) {
      if (isLeapYear(currentYear)) {
        result[count] = currentYear;
        count++;
      }
      currentYear++;
    }
    return result;
  }
  private static boolean isLeapYear(int year) {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        return year % 400 == 0;
      } else {
        return true;
      }
    } else {
      return false;
    }
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
