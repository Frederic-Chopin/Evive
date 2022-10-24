public class Dinner extends Meal{
    public Dinner() {
        this.totDish = 4;
        this.offering = new String[totDish];
        this.orders = new int[totDish];
        this.changeOffering(1,"Steak");
        this.changeOffering(2,"Potatoes");
        this.changeOffering(3,"Wine");
        this.changeOffering(4,"Cake");
    }

    public String output() {
        String message = new String();
        if (orders[0] == 0 && orders[1] == 0){
            message = "Unable to process: Main is missing, side is missing";
        } else if (orders[0] == 0) {
            message = "Unable to process: Main is missing";
        } else if (orders[1] == 0) {
            message = "Unable to process: Side is missing";
        } else if (orders[3] == 0) {
            message = "Unable to process: Dessert is missing";
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
}
