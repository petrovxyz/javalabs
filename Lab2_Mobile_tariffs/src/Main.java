import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TariffsSystem company = getTariffsSystem();

        System.out.println("All tariffs:");
        company.displayAllTariffs();

        System.out.println("\nTotal amount of clients: " + company.getAllClients());

        company.sortTariffsByPrice();
        System.out.println("\nTariffs sorted by subscription price in descending order:");
        company.displayAllTariffs();

        System.out.println("\nTariffs between $5 and $10:");
        company.findTariffsByPriceRange(5, 10);
    }

    private static TariffsSystem getTariffsSystem() {
        TariffsSystem company = new TariffsSystem();
        company.getTariffs().addAll(Arrays.asList(
                createBasicTariff("Standard Plan", 5.50, 500),
                createBasicTariff("Plus Plan", 7.50, 400),
                createUnlimitedTariff("Flex Plan", 17.50, 300),
                createUnlimitedTariff("Starter Plan", 22.50, 150),
                createUnlimitedTariff("Premium Plan", 32.50, 50)
        ));
        return company;
    }

    private static BasicTariff createBasicTariff(String name, double price, int clients) {
        return new BasicTariff(name, price, clients);
    }

    private static UnlimitedTariff createUnlimitedTariff(String name, double price, int clients) {
        return new UnlimitedTariff(name, price, clients);
    }
}
