import java.time.LocalDate;
import java.time.Period;

public class calculateDefOrSur {
    public double difference;
    private double totalCals;

    public calculateDefOrSur(calorieLog tracker, double BMR, String startDate, String endDate){

        int [] startDateComponents= stringToInt(startDate);
        int [] endDateComponents= stringToInt(endDate);

        LocalDate firstDate = LocalDate.of(startDateComponents[0],startDateComponents[1],startDateComponents[2]);
        LocalDate lastDate = LocalDate.of(endDateComponents[0],endDateComponents[1],endDateComponents[2]);
        Period period = Period.between(firstDate, lastDate);

        int daysBetween = period.getDays();

        totalCals= totalCals + tracker.getCalories(startDate);
        totalCals= totalCals + tracker.getCalories(endDate);

        for(int i=1;i<daysBetween;i++){

            String searchDateString = String.format("%04d-%02d-%02d", startDateComponents[0], startDateComponents[1], startDateComponents[2]);

            int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (startDateComponents[1] > daysOfMonth[startDateComponents[2]]) {
                startDateComponents[2] = startDateComponents[2] + 1;
                startDateComponents[1] = 1;
                searchDateString = String.format("%04d-%02d-%02d", startDateComponents[0], startDateComponents[1], startDateComponents[2]);
            }
            totalCals+=tracker.getCalories(searchDateString);
            startDateComponents[1]= startDateComponents[1]+1;
        }

        double CalsBasedBMR=(1+ daysBetween) * BMR;
        difference= totalCals-CalsBasedBMR;

    }

    public double getDifference(){
        return difference;
    }


    //convert the string into ints inorder to increment the value of the day
    public int[] stringToInt(String dateString) {
        int[] dateComponents = new int[3];
            LocalDate date = LocalDate.parse(dateString);
            dateComponents[0] = date.getYear();
            dateComponents[1] = date.getMonthValue();
            dateComponents[2] = date.getDayOfMonth();
            return dateComponents;
    }
}

