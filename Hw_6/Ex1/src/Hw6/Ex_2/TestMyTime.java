package Hw6.Ex_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime_1 = new MyTime(18, 01, 20);
        System.out.println("myTime_1 is " + myTime_1);

        myTime_1.setTime(10, 01, 18);
        myTime_1.setHour(8);
        myTime_1.setMinute(20);
        myTime_1.setSecond(59);

        System.out.println(myTime_1.getHour() + ":" + myTime_1.getMinute() + ":" + myTime_1.getSecond());
        System.out.println(myTime_1.getMinute());
        System.out.println(myTime_1.getSecond());
        System.out.println(myTime_1.getHour());
        System.out.println(myTime_1.nextSecond());
        System.out.println(myTime_1.previousSecond());
        System.out.println(myTime_1.nextMinute());
        System.out.println(myTime_1.previousMinute());
        System.out.println(myTime_1.nextHour());
        System.out.println(myTime_1.previousHour());

    }
}
