import java.util.Map;
import java.util.TreeMap;

public class calorieLog {
    private Map<String, Integer>  calorieData;

    public calorieLog() {
        calorieData = new TreeMap<>();
    }

    // Add or update a calorie entry for a specific date
    public void addCalories(String date, int calories) {
        calorieData.put(date, calories);
    }

    // Remove a calorie entry for a specific date
    public void removeCalories(String date) {
        calorieData.remove(date);
    }

    // Retrieve the calorie count for a specific date
    public int getCalories(String date) {
        Integer calories = calorieData.get(date);
        return (calories != null) ? calories : 0;
    }

    // Print all calorie entries
    public void printCalories() {
        System.out.println("Calorie Entries:");
        for (String date : calorieData.keySet()) {
            int calories = calorieData.get(date);
            System.out.println(date + ": " + calories + " calories");
        }
    }
}
