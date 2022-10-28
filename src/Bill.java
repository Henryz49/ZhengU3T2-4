public class Bill {
    private double totalCost;
    private int customers;
    private boolean tipAdded;

    /* Constructor
        PRECONDITION: costOfMeal >= 0, customers > 0
     */
    public Bill(double costOfMeal, int customers) {
        totalCost = costOfMeal;
        this.customers = customers;
        tipAdded = false;
    }

    public boolean addTip() {
        if (tipAdded = true){
            return false;
        }
        if (customers > 7) {
            totalCost = totalCost*1.30;
            }
        else if (customers > 3){
            totalCost = totalCost*1.27;
            }
        else if (customers>1){
            totalCost=totalCost*1.25;
        }
        else totalCost = totalCost *1.2;
        tipAdded = true;
        return true;
        }

    /* Returns String with info about the bill */
    public String billInfo() {
        // Round the bill to two decimal places
        double roundedBill = Math.round(totalCost * 100.0) / 100.0;
        return "Total cost for " + customers + " customers is $" + roundedBill;
    }
}