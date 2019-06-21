package info.luckydog.tools.utils;

import org.junit.Test;

import java.math.BigDecimal;

public class Tools {

    public void calculateCompoundInterest(double inPerMonth, double ratePerYear, int year) {

        double capital = 0.0;
        double benefit = 0.0;
        double sum;
        int monthCount = year * 12;

        double ratePerMonth = ratePerYear / 12;

        ratePerMonth = new BigDecimal(ratePerMonth).setScale(6, BigDecimal.ROUND_HALF_EVEN).doubleValue();

        System.out.println("ratePerMonth : " + ratePerMonth);

        for (int i = 1; i <= monthCount; i++) {
            capital += inPerMonth;
            benefit += capital * ratePerMonth;

            if (capital * ratePerMonth > 5000.00) {
                System.out.println("this month benefit : " + capital * ratePerMonth);
            }

            capital = new BigDecimal(capital).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
            benefit = new BigDecimal(benefit).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();

            System.out.println("month : " + i + " -> capital : " + capital + "; benefit : " + benefit);
            if (i % 12 == 0) {
                double yearSum = new BigDecimal(capital + benefit).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
                System.out.println("========= " + (i / 12) + " year sum : " + yearSum + "=========");
            }
        }
        sum = capital + benefit;

        sum = new BigDecimal(sum).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();

        System.out.println("capital : " + capital + "\nbenefit : " + benefit + "\nsum : " + sum);
    }

    @Test
    public void test() {
        calculateCompoundInterest(300, 0.08, 10);
    }
}
