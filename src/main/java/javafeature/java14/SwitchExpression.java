package javafeature.java14;

import java.time.Month;

public class SwitchExpression {

    public static void main(String[] args) {
        int days = 0;
        Month month = Month.APRIL;

        days = oldWay(month);
        System.out.println(days);
        
        days = newWay(month);
        System.out.println(days);
       
        
    }

	private static int newWay(Month month) {
		return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> {
            	System.out.println(month);
            	yield 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> throw new IllegalStateException();
        };
	}
	
	private static int oldWay(Month month) {
		int days = 0;
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER :
                days = 31;
                break;
            case FEBRUARY :
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER :
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }
        return days;
	}
}