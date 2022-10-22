public class Main {
    public static void main(String[] args) {
        String[] temp = {"b", "1","2","3", "3", "1", "1"};
        Meal meal = new Meal();
        meal.changeOffering(1,"Eggs");
        meal.changeOffering(2,"Toast");
        meal.changeOffering(3,"Coffee");

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
