import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] temp = {"Dinner","2","1","3","1","1","3","4"};
        Meal meal;
        String mealType = temp[0].toLowerCase();
        if (mealType.equals("breakfast")) {
            meal = new Breakfast();
        } else if (mealType.equals("lunch")) {
            meal = new Lunch();
        } else if (mealType.equals("dinner")) {
            meal = new Dinner();
        } else {
            System.out.println("Meal has to be a Breakfast, Lunch, or Dinner");
            return;
        }


        int len = temp.length-1;
        int[] orders = new int[len];
        for(int i=1; i< temp.length; i++) {
            String arg = temp[i];
            int dish_index = Integer.parseInt(arg);
            orders[i-1] = dish_index;
        }
        meal.takeOrder(orders);

        System.out.println(meal.output());
    }
}
