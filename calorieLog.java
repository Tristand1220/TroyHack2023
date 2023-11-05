import java.util.TreeMap;

public class calorieLog {
    private TreeMap<String, day> dataStore;

    public calorieLog() {
        dataStore = new TreeMap<>();
    }

    public void addDay(day Day) {
        dataStore.put(Day.getDate(), Day);
    }

    public day getDay(String date) {
        return dataStore.get(date);
    }

    public void removeDay(String date) {
        dataStore.remove(date);
    }

    public boolean containsDay(String date) {
        return dataStore.containsKey(date);
    }
}