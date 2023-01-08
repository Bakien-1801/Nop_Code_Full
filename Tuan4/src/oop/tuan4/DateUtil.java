package oop.tuan4;

public class DateUtil {
   public static String[] MONTHS = { "Jan", "Feb", "Mar", "Apr",
         "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

   public static int[] DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

   public static boolean isLeapYear(int year) {
      if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
         return true;
      }
      return false;
   }

   public static boolean isValidDate(int year, int month, int day) {
      if (isLeapYear(year) && month == 2) {
         if (year > 9999 || year < 1 || day > 29 || day < 1) {
            return false;
         }
      } else {
         if (year > 9999 || year < 1 || month > 12 ||
               month < 1 || day > DAYS_IN_MONTHS[month - 1] || day < 1) {
            return false;
         }
      }
      return true;
   }

   public static int getDayOfWeek(int year, int month, int day) {
      if (isValidDate(year, month, day)) {
         int[] array = { 4, 2, 0, 6 };
         int lastTwoDigit = year % 100;
         int centuryNumber;
         if ((year - lastTwoDigit) % 400 == 100) {
            centuryNumber = array[0];
         }
         if ((year - lastTwoDigit) % 400 == 200) {
            centuryNumber = array[1];
         }
         if ((year - lastTwoDigit) % 400 == 300) {
            centuryNumber = array[2];
         } else {
            centuryNumber = array[3];
         }

         int[] nonLeapYear = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
         int[] leapYear = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
         int monthNumber;
         if (isLeapYear(year)) {
            monthNumber = leapYear[month - 1];
         } else {
            monthNumber = nonLeapYear[month - 1];
         }
         return (centuryNumber + lastTwoDigit + lastTwoDigit / 4 + monthNumber + day) % 7;
      } else {
         throw new IllegalArgumentException("Invalid year, month or day!");
      }

   }

   public static String toString(int year, int month, int day) {
      String result = "";
      int dayOfWeek = getDayOfWeek(year, month, day);

      switch (dayOfWeek) {
         case 0:
            result += "Sunday ";
            break;
         case 1:
            result += "Monday ";
            break;
         case 2:
            result += "Tuesday ";
            break;
         case 3:
            result += "Wednesday ";
            break;
         case 4:
            result += "Thursday ";
            break;
         case 5:
            result += "Friday ";
            break;
         case 6:
            result += "Saturday ";
            break;
      }
      result += day + " " + MONTHS[month - 1] + " " + year;

      return result;
   }

   public static void main(String[] args) {
      System.out.println(isLeapYear(1900));
      System.out.println(isLeapYear(2000));
      System.out.println(isLeapYear(2011));
      System.out.println(isLeapYear(2012));

      System.out.println(isValidDate(2012, 2, 29));
      System.out.println(isValidDate(2011, 2, 29));
      System.out.println(isValidDate(2099, 12, 31));
      System.out.println(isValidDate(2099, 12, 32));

      System.out.println(getDayOfWeek(1982, 4, 24));
      System.out.println(getDayOfWeek(2000, 1, 1));
      System.out.println(getDayOfWeek(2054, 6, 19));
      System.out.println(getDayOfWeek(2012, 2, 17));

      System.out.println(toString(2012, 12, 21));
   }

}
