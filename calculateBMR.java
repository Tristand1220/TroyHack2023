public class calculateBMR {


    public double calculateBMR(double weight,int age, int heightFt, int heightIn, char gender){

        //Harris-Benedict equation
        //For men: 66.47 + (6.24 × weight in pounds) + (12.7 × height in inches) − (6.75 × age in years).
        //For women: BMR = 65.51 + (4.35 × weight in pounds) + (4.7 × height in inches) - (4.7 × age in years)
        double BMR;
        int height= (heightFt*12) + heightIn;
        if( gender== 'm'){
            BMR= 66.47 + (6.24 * weight) + (12.7 * height) - (6.75 * age);
        }
        else{
            BMR= 65.51 + (4.35 * weight) + (4.7 * height)- (4.7 * age);
        }
        return BMR;
    }
}
