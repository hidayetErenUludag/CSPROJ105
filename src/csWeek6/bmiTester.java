package csWeek6;

public class bmiTester {
    public static void main(String[] args) {
        BMI şişko = new BMI();
        System.out.println(şişko.bmiCalc("Eren Uludağ", 38,188,100));
        System.out.println(şişko.getBmiStatus());
    }
}
