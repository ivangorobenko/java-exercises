package staticFactoryBuilder;

public class VipCustomer {
    private final String name;
    private final int creditLimit;
    private final String emailAddress;

    private VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    private VipCustomer(Builder builder) {
        this.name = builder.name;
        this.creditLimit = builder.creditLimit;
        this.emailAddress = builder.emailAddress;
    }

    public static VipCustomer createVipCustomer(String name, int creditLimit, String emailAddress) {
        return new VipCustomer(name, creditLimit, emailAddress);
    }

    public static VipCustomer createVipCustomerWithoutEmail(String name, int creditLimit) {
        return new VipCustomer(name, creditLimit, "default@email.com");
    }

    public static VipCustomer createDefaultVipCustomer() {
        return new VipCustomer("Default name", 300000, "default@email.com");
    }

    public static class Builder {
        private final String name;
        private int creditLimit = 0;
        private String emailAddress = "default@email.com";

        public Builder(String name) {
            this.name = name;
        }

        public Builder withCreditLimit(int creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        public Builder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public VipCustomer build() {
            return new VipCustomer(this);
        }

    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
