package sms;

import java.util.List;

public class PremiumCustomer extends Customer {

    //fields
    private String currentType;
    private int loyaltyPoints;

    //cons
    public PremiumCustomer(String name, String phone, String address) {
        super(name, phone, address);
        this.currentType = "PREMIUM";
        this.loyaltyPoints = 0;
    }

    //getter&&setter
    public String getCurrentType() {
        return currentType;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints < 0) {
            System.out.println("Points cant be negative");
            return;
        }
        this.loyaltyPoints = loyaltyPoints;
    }


    //check for discount amount
    public double calculateDiscountAmount(double billAmount) {
        if (billAmount < 0) {
            return 0.0;
        }
        return billAmount * 0.10; // Giảm giá 10%
    }


    public static void upgradeAndReplace(Customer oldCustomer, List<Customer> customerList) {
        // check the validation
        if (oldCustomer == null || customerList == null) {
            System.out.println("Invalid statistics.There are no customer!");
            return;
        }

        // find the index of customer in old list
        int index = customerList.indexOf(oldCustomer);
        if (index == -1) {
            System.out.println("After searching, find no customer.");
            return;
        }

        // if vip alr then skip
        if (oldCustomer instanceof PremiumCustomer) {
            System.out.println("Status ís already premium.");
            return;
        }

        // Declare a new premium customer
        PremiumCustomer vipCustomer = new PremiumCustomer(
                oldCustomer.getName(),
                oldCustomer.getPhone(),
                oldCustomer.getAddress()
        );

        // keep the totalpurchases the same
        vipCustomer.setTotalPurchase(oldCustomer.getTotalPurchase());

        //10_000 = 1 point
        int calculatedPoints = (int) (oldCustomer.getTotalPurchase() / 10000);
        //ghi lai so diem tich duoc
        vipCustomer.setLoyaltyPoints(calculatedPoints);

        //replace the old index - regular customer, with the new status premium after changing into the customer list
        customerList.set(index, vipCustomer);

        System.out.println("==Update==");
        System.out.println("Replace customer name: " + vipCustomer.getName());
        System.out.println("Position: Index " + index);
        System.out.println("New status: " + vipCustomer.getCurrentType());
        System.out.println("Loyalty points: " + vipCustomer.getLoyaltyPoints() + " points.");
    }
}