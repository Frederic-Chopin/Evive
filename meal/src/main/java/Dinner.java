public class Dinner extends Meal {
    public Dinner() {
        this.totDish = 4;
        this.offering = new String[totDish];
        this.orders = new int[totDish];
        this.changeOffering(1,"Steak");
        this.changeOffering(2,"Potatoes");
        this.changeOffering(3,"Wine");
        this.changeOffering(4,"Cake");
    }

    //At dinner, no dish can be ordered more than once
    @Override
    public boolean multipleMealViolation() {
        if (orders[0] > 1) {
            System.out.println("Steak cannot be ordered more than once");
            return true;
        } else if (orders[1] > 1) {
            System.out.println("Potatoes cannot be ordered more than once");
            return true;
        } else if (orders[2] > 1) {
            System.out.println("Wine cannot be ordered more than once");
            return true;
        } else if (orders[3] > 1) {
            System.out.println("Cake cannot be ordered more than once");
            return true;
        }
        return false;
    }


    // Check if main and side are present
    @Override
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
        } else if (orders[3] == 0) {
            System.out.println("Unable to process: Dessert is missing");
            return true;
        }
        return false;
    }

    @Override
    public String output() {
        String message;
        if (orders[2]>0) {
            message = "Steak, Potatoes, Wine, Water, Cake";
        } else {
            message = "Steak, Potatoes, Water, Cake";
        }
        return message;
    }
}