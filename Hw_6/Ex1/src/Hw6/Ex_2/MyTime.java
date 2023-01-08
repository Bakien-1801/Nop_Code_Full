package Hw6.Ex_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59) | (second < 0 || second > 59)) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour < 0 || hour > 23) || (minute < 0 || minute > 59) | (second < 0 || second > 59)) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        String hour = Integer.toString(this.hour);
        String minute = Integer.toString(this.minute);
        String second = Integer.toString(this.second);
        if (this.hour < 10) {
            hour = "0" + this.hour;
        }
        if (this.minute < 10) {
            minute = "0" + this.minute;
        }
        if (this.second < 10) {
            second = "0" + this.second;
        }
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        if (this.second == 59) {
            this.second = 0;
            if (this.minute == 59) {
                this.minute = 0;
                if (this.hour == 23) {
                    this.hour = 0;
                } else {
                    this.hour++;
                }
            } else {
                this.minute++;
            }
        } else {
            this.second++;
        }
        return this;
    }

    public MyTime nextMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            if (this.hour == 23) {
                this.hour = 0;
            } else {
                this.hour++;
            }
        } else {
            this.minute++;
        }
        return this;
    }

    public MyTime nextHour() {
        if (this.hour == 23) {
            this.hour = 0;
        } else {
            this.hour++;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (this.second == 0) {
            this.second = 59;
            if (this.minute == 0) {
                this.minute = 59;
                if (this.hour == 0) {
                    this.hour = 23;
                } else {
                    this.hour--;
                }
            } else {
                this.minute--;
            }
        } else {
            this.second--;
        }

        return this;
    }

    public MyTime previousMinute() {
        if (this.minute == 0) {
            this.minute = 59;
            if (this.hour == 0) {
                this.hour = 23;
            } else {
                this.hour--;
            }
        } else {
            this.minute--;
        }

        return this;
    }

    public MyTime previousHour() {
        if (this.hour == 0) {
            this.hour = 23;
        } else {
            this.hour--;
        }

        return this;
    }
}
