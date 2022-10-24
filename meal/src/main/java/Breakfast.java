public class Breakfast extends Meal{
    public Breakfast() {
        super();
        this.changeOffering(1,"Eggs");
        this.changeOffering(2,"Toast");
        this.changeOffering(3,"Coffee");
    }

    // At breakfast, multiple cups of coffee can be ordered
    @Override
    public boolean multipleMealViolation() {
        if (orders[0] > 1) {
            System.out.println("Eggs cannot be ordered more than once");
            return true;
        } else if (orders[1] > 1) {
            System.out.println("Toast cannot be ordered more than once");
            return true;
        }
        return false;
    }
}