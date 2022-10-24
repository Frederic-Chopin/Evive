public class Lunch extends Meal{
    public Lunch() {
        super();
        this.changeOffering(1,"Sandwich");
        this.changeOffering(2,"Chips");
        this.changeOffering(3,"Soda");
    }

    //At lunch, multiple sides can be ordered
    @Override
    public boolean multipleMealViolation() {
        if (orders[0] > 1) {
            System.out.println("Eggs cannot be ordered more than once");
            return true;
        } else if (orders[2] > 1) {
            System.out.println("Soda cannot be ordered more than once");
            return true;
        }
        return false;
    }
}