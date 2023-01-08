package Hw6.Ex_3;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (isLeapYear(year) && month == 2 && day == 29) {
            return true;
        } else {
            if (day > DAYS_IN_MONTH[month - 1]) {
                return false;
            }
        }
        return true;
    }

    public int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }
        int totalDays[] = {0, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        if (month < 3) {
            year -= 1;
        }
        return (year + year / 4 - year / 100 + year / 400 + totalDays[month - 1] + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.setDate(year, month, day);
        return;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        int dayMax;
        if (month == 2) {
            if (isLeapYear(year)) {
                dayMax = 29;
            } else {
                dayMax = DAYS_IN_MONTH[month - 1];
            }
            if (day < 1 || day > dayMax) {
                throw new IllegalArgumentException("Invalid day!");
            }
            this.day = day;
        }
    }

    public String toString() {
        if (!isValidDate(year, month, day)) {
            return "";
        }
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (isLeapYear(this.year) && this.month == 2) {
            if (day == 29) {
                this.day = 1;
                this.month++;
            } else {
                this.day++;
            }
        } else {
            if (this.day == DAYS_IN_MONTH[this.month - 1]) {
                this.day = 1;
                if (this.month == 12) {
                    this.month = 1;
                    this.year++;
                } else {
                    this.month++;
                }
            } else {
                this.day++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (this.month == 12) {
            this.month = 1;
            this.year++;
        } else {
            if (this.day > DAYS_IN_MONTH[this.month]) {
                this.day = DAYS_IN_MONTH[this.month];
            }
            this.month++;
        }
        return this;
    }

    public MyDate nextYear() {
        if (this.year + 1 > 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        this.year++;
        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(this.year) && this.month == 3) {
            if (day == 31) {
                this.day = 29;
                this.month--;
            } else {
                this.day--;
            }
        } else {
            if (this.day == 1) {
                this.day = DAYS_IN_MONTH[this.month - 1];
                if (this.month == 1) {
                    this.month = 12;
                    this.year--;
                } else {
                    this.month--;
                }
            } else {
                this.day--;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (this.month == 1) {
            this.month = 12;
            this.year--;
        } else {
            if (this.day > DAYS_IN_MONTH[this.month - 2]) {
                this.day = DAYS_IN_MONTH[this.month - 2];
            }
            this.month--;
        }
        return this;
    }

    public MyDate previousYear() {
        if (isLeapYear(this.year) && this.day == 29) {
            this.day = DAYS_IN_MONTH[1];
        }
        this.year--;
        return this;
    }
}
