public class Main {
    public static void main(String[] args) {
        calorieLog tracker = new calorieLog();

        // Adding calorie entries
        tracker.addCalories("2023-11-03", 1800);
        tracker.addCalories("2023-11-01", 2000);
        tracker.addCalories("2023-11-02", 2500);


        // Retrieving and printing calorie entries
        System.out.println("Calories on 2023-11-02: " + tracker.getCalories("2023-11-02"));
        System.out.println("Calories on 2023-11-03: " + tracker.getCalories("2023-11-03"));

        // Printing all calorie entries
        //tracker.printCalories();

        //Calculate BMR and display
        calculateBMR BMR = new calculateBMR();
        System.out.println("Base metabolic rate; "+ BMR.calculateBMR(177,21,5,8,'m'));

        double workingBMT=BMR.calculateBMR(177,21,5,8,'m');

        //find deficit or surplus and display it
        calculateDefOrSur find = new calculateDefOrSur(tracker,workingBMT,"2023-11-02","2023-11-03");
        System.out.println("The diff is: "+ find.difference);
    }
}
//4300
//3785.6
//514.4