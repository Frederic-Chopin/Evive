import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            //Not Junit test
            if (args.length!=3) {
                System.out.println("Input meal orders. e.g. Breakfast 1,2,3");
            }
            String mealType;
            Meal meal;

            //Take input from args or stin
            if (args.length == 0) {
                mealType = scan.next().toLowerCase();
            } else {
                mealType = args[0].toLowerCase();
            }

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


            ArrayList<Integer> orders = new ArrayList<>();
            //take input from stin
            if (args.length == 0 ) {
                String[] indexes = scan.next().split(",");
                for (String i : indexes)
                    try {
                        int dish_index = Integer.parseInt(i);
                        orders.add(dish_index);
                    } catch (Exception e) {
                        System.out.println("Please input integers after the meal type");
                        return;
                    }
            } else {
                String[] indexes = args[1].split(",");
                for (int i = 0; i < indexes.length; i++) {
                    try {
                        int dish_index = Integer.parseInt(indexes[i]);
                        orders.add(dish_index);
                    } catch (Exception e) {
                        System.out.println("Please input integers after the meal type");
                        return;
                    }

                }
            }

            System.out.println(meal.takeOrder(orders));

            //For Junit Test
            if (args.length==3 && args[2]=="n") {
                return;
            }

            //Continue adding meals
            System.out.println("Continue? (y/n)");
            while (true) {
                String input = scan.next();
                if (input.equals("y")) {
                    break;
                } else if (input.equals("n")) {
                    return;
                } else {
                    System.out.println("Please input y or n");
                }
            }
            args = new String[0];
        }
    }

}