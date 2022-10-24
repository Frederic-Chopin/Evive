import java.util.ArrayList;

public class Meal {
    protected String[] offering;
    protected int[] orders;
    protected int totDish;

    public Meal() {
        this.totDish = 3;
        this.offering = new String[totDish];
        this.orders = new int[totDish];
        this.offering[2] = "Water";
    }

    public String takeOrder(ArrayList<Integer> orders) {
        for (int order : orders) {
            try {
                this.orders[order - 1] += 1;
            } catch (Exception e) {
                System.out.println("Please enter number in the range 1 ~ " + getTotDish());
            }
        }
        if (missingDish()) return "";
        if (multipleMealViolation()) return "";
        return output();
    }

    // Check if main and side are present
    public boolean missingDish() {
        String message;
        if (orders[0] == 0 && orders[1] == 0){
            System.out.println("Unable to process: Main is missing, side is missing");
            return true;
        } else if (orders[0] == 0) {
            System.out.println("Unable to process: Main is missing");
            return true;
        } else if (orders[1] == 0) {
            System.out.println("Unable to process: Side is missing");
            return true;
        }
        return false;
    }

    //Check multiple order requirement
    //Overridden by children
    public boolean multipleMealViolation() {
        return false;
    }

    public String output() {
        String message = new String();
        for (int i=0; i<totDish; i++) {
            if (orders[i] >= 1) {
                message += offering[i];
            }
            if (orders[i] > 1) {
                message += "(" + orders[i] + ")";
            }
            if (i < totDish-1) {
                message += ", ";
            }
            if (i==2 && orders[i] == 0) {
                message += "Water";         //If no drink is ordered, water should be returned
            }
        }
        return message;
    }

    public void changeOffering(int meal, String newOffering) {
        this.offering[meal-1] = newOffering;
    }

    public int getTotDish() {
        return this.totDish;
    }

    public String getOrders() {
        String res = new String();
        for (int val:orders){
            res += val + " ";
        }
        return res;
    }
}
