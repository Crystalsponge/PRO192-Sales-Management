package sms;

public class CustomerType extends Customer {
    //types of customer
    public static final String REGULAR = "Regular";
    public static final String PREMIUM = "Premium";
    //fields
    private String currentType;
    private int loyaltyPoints;

    //cons
    public CustomerType(String name, String phone, String address) {
        super(name, phone, address);
        this.currentType = REGULAR; // Starts as Regular
        this.loyaltyPoints = 0;
    }

    //calculate point && update status
    @Override
    public void addTotalPurchase(double amount) {
        super.addTotalPurchase(amount);

        //alr premium, dont update
        if (this.currentType.equals(PREMIUM)) {
            return;
        }

        //1point = 10_000
        int earned = (int) (amount / 10000);
        this.loyaltyPoints += earned;
        System.out.println(getName() + " earned " + earned + " loyalty points. Total: " + this.loyaltyPoints);

        //update status when hit 1000points
        if (this.loyaltyPoints >= 1000) {
            this.currentType = PREMIUM;
            System.out.println("Milestone reached. Upgraded from Regular to Premium Type!");
        }
    }

    //Discount
    public double calculateDiscountAmount(double billAmount) {
        if (this.currentType.equals(PREMIUM)) {
            return billAmount * 0.10; // 10% discount
        }
        return 0.0; //regular
    }

    // getters for new type
    public String getTypeName() {
        return this.currentType;
    }

    public int getLoyaltyPoints() {
        return this.loyaltyPoints;
    }
}