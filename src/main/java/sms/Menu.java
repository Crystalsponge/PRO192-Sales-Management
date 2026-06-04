package sms;

import java.util.Scanner;


public class Menu {

    private final Inventory inventory;
    private final Scanner scanner;

    public Menu() {
        this.inventory = new Inventory();
        this.scanner = new Scanner(System.in);
    }

    // Main loop
    public void run() {
        int choice = -1;
        do {
            showMenu();
            String input = scanner.nextLine();
            if (!input.matches("\\d+")) {
                System.out.println("Please enter a valid number.");
                continue;
            }
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1: addCustomer(); break;
                case 2: inventory.showAllCustomer(); break;
                case 3: searchCustomer(); break;
                case 4: updateCustomer(); break;
                case 5: deleteCustomer(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);
    }

    private void showMenu() {
        System.out.println();
        System.out.println("===== CUSTOMER MANAGEMENT =====");
        System.out.println("1. Add Customer");
        System.out.println("2. View All Customers");
        System.out.println("3. Search Customer");
        System.out.println("4. Update Customer");
        System.out.println("5. Delete Customer");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // CREATE
    private void addCustomer() {
        System.out.println("----------- ADD CUSTOMER -----------");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        if (!utils.validateName(name)) return;

        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        if (!utils.validatePhone(phone)) return;

        if (inventory.customerExists(phone)) {
            System.out.println("A customer with this phone already exists.");
            return;
        }

        System.out.print("Address: ");
        String address = scanner.nextLine();
        if (!utils.notEmpty(address)) {
            System.out.println("Address cannot be empty");
            return;
        }

        Customer c = new Customer(name, phone, address);
        if (inventory.addCustomer(c)) {
            System.out.println("Customer added successfully.");
        } else {
            System.out.println("Failed to add customer.");
        }
    }

    // READ (search by phone)
    private void searchCustomer() {
        System.out.print("Enter phone to search: ");
        String phone = scanner.nextLine();
        Customer c = inventory.getCustomerByPhone(phone);
        if (c != null) {
            System.out.println("Found: " + c.getName()
                    + " | " + c.getPhone()
                    + " | " + c.getAddress());
        }
    }

    // UPDATE
    private void updateCustomer() {
        System.out.print("Enter phone of customer to update: ");
        String oldPhone = scanner.nextLine();
        Customer existing = inventory.getCustomerByPhone(oldPhone);
        if (existing == null) return;

        System.out.print("New Name: ");
        String name = scanner.nextLine();
        if (!utils.validateName(name)) return;

        System.out.print("New Phone: ");
        String phone = scanner.nextLine();
        if (!utils.validatePhone(phone)) return;

        System.out.print("New Address: ");
        String address = scanner.nextLine();
        if (!utils.notEmpty(address)) {
            System.out.println("Address cannot be empty");
            return;
        }

        Customer updated = new Customer(name, phone, address);
        if (inventory.updateCustomer(oldPhone, updated)) {
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Failed to update customer.");
        }
    }

    // DELETE
    private void deleteCustomer() {
        System.out.print("Enter phone of customer to delete: ");
        String phone = scanner.nextLine();
        Customer c = inventory.getCustomerByPhone(phone);
        if (c == null) return;
        if (inventory.deleteCustomer(c)) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Failed to delete customer.");
        }
    }
}
