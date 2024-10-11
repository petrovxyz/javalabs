public abstract class Tariff {
    private String name; // назва тарифу
    private int numberOfClients; // кількість клієнтів
    private double subscriptionPrice; // ціна за підписку

    public Tariff(String name, double subscriptionPrice, int numberOfClients) {
        if (subscriptionPrice < 0 || numberOfClients < 0) {
            throw new IllegalArgumentException("Subscription fee and number of clients must be must be equal to or greater than zero.");
        }
        this.name = name;
        this.subscriptionPrice = subscriptionPrice;
        this.numberOfClients = numberOfClients;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public int getClients() {
        return numberOfClients;
    }

    public void pushInfo() {
        System.out.println(getTariffType() + ": " + name + ", subscription price: $" + subscriptionPrice + ", clients: " + numberOfClients);
    }

    protected abstract String getTariffType();
}

class BasicTariff extends Tariff {
    public BasicTariff(String name, double subscriptionPrice, int numberOfClients) {
        super(name, subscriptionPrice, numberOfClients);
    }

    @Override
    protected String getTariffType() {
        return "Basic tariff";
    }
}

class UnlimitedTariff extends Tariff {
    public UnlimitedTariff(String name, double subscriptionPrice, int numberOfClients) {
        super(name, subscriptionPrice, numberOfClients);
    }

    @Override
    protected String getTariffType() {
        return "Unlimited tariff";
    }
}

