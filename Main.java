public class Main {
    public static void main(String[] args) {
        calorieLog tracker = new calorieLog();


        day day1 = new day(2000, "2023-11-01", 100, 50, 150, 30);
        day day2 = new day(2500, "2023-11-02", 120, 60, 180, 35);
        day day3 = new day(2000, "2023-11-03", 100, 60, 150, 30);
        day day4 = new day(1,"2023-11-04",1,1,1,1);
        day day5 = new day(1,"2023-11-05",1,1,1,1);
        day day6 = new day(1,"2023-11-06",1,1,1,1);
        day day7 = new day(1,"2023-11-07",1,1,1,1);
        day day8 = new day(1,"2023-11-08",1,1,1,1);

        tracker.addDay(day1);
        tracker.addDay(day2);
        tracker.addDay(day3);
        tracker.addDay(day4);
        tracker.addDay(day5);
        tracker.addDay(day6);
        tracker.addDay(day7);
        tracker.addDay(day8);


        //Calculate BMR and display
        calculateBMR BMR = new calculateBMR();
        System.out.println("Base metabolic rate; "+ BMR.calculateBMR(177,21,5,8,'m'));

        double workingBMT=BMR.calculateBMR(177,21,5,8,'m');

        //find deficit or surplus and display it
        calculateDefOrSur find = new calculateDefOrSur(tracker,workingBMT,"2023-11-01","2023-11-08");
        System.out.println("The diff is: "+ find.difference);
    }
}
//using 2 days cal total =4300
//total cals at BMR=3785.6
//diff=514.4

//using 3 days cal total=6500
//total cals at BMR=5678.4
//diff= 821.6

//using 6 days cal total=6503
//total cals at BMR= 11356.88
//diff= -4853.79

