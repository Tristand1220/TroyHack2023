public class day {
    private double calories;
    private String date;
    private double protein;
    private double fat;
    private double carb;
    private double sugar;

    public day(double calories, String date, double protein, double fat, double carb, double sugar) {
        this.calories = calories;
        this.date = date;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;
        this.sugar = sugar;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarb() {
        return carb;
    }

    public void setCarb(double carb) {
        this.carb = carb;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
}
