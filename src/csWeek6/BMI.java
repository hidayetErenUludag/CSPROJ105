package csWeek6;

public class BMI {
    private final  double obese = 30;
    private final  double overweight = 25;
    private final  double normal = 18.5;
    private String bmiStatus;
    public double bmiCalc(String name ,int age, double height, double weight){

        double bmi = weight/(height/100.0*height/100.0);
        if (bmi<normal){
            bmiStatus = "underweight";
        }
        else if (bmi<overweight){
            bmiStatus = "Normal";
        }
        else if (bmi<obese) {
            bmiStatus =  "overweight";
        }
        else{
            bmiStatus = "Obese";
        }
        return bmi;
    }
    public String getBmiStatus() {
        return bmiStatus;
    }
}
