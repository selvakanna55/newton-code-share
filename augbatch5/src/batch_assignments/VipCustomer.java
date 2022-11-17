package batch_assignments;

class VipCustomer {
    String name;
    double creditLimit;
    String email;

    VipCustomer() {
        this("XYZ", 10.0, "xyz@abc.com");
    }

    VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "xyz@abc.com");
    }

    VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    String getEmail() {
        return email;
    }

    String getName() {
        return name;
    }

    double getCreditLimit() {
        return creditLimit;
    }
}