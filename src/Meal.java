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

    public void takeOrder(int[] orders) {
        for (int order : orders) {
            try {
                this.orders[order - 1] += 1;
            } catch (Exception e) {
                System.out.println("Please enter number in the range 1 ~ " + getTotDish());
            }
        }
    }

    public String output() {
        String message = new String();
        if (orders[0] == 0 && orders[1] == 0){
            message = "Unable to process: Main is missing, side is missing";
        } else if (orders[0] == 0) {
            message = "Unable to process: Main is missing";
        } else if (orders[1] == 0) {
            message = "Unable to process: Side is missing";
        } else {
            for (int i=0; i<totDish; i++) {
                message += offering[i];
                if (orders[i] > 1) {
                    message += "(" + orders[i] + ")";
                }
                if (i < totDish-1) {
                    message += ", ";
                }
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