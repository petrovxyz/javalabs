import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class TariffsSystem {
    private List<Tariff> tariffs = new ArrayList<>(); // список з об'єктами типу Tariff

    // додавання нового тарифу до списку
    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    public List<Tariff> getTariffs() {
        return tariffs;
    }
    // сумування всіх клієнтів
    public int getAllClients() {
        int allClients = 0;
        for (Tariff tariff : tariffs) {
            allClients += tariff.getClients();
        }
        return allClients;
    }

    // сортування тарифів за ціною
    public void sortTariffsByPrice() {
        tariffs.sort(Comparator.comparingDouble(Tariff::getSubscriptionPrice).reversed());
    }

    // пошук тарифу за діапазоном ціни
    public void findTariffsByPriceRange(double minPrice, double maxPrice) {
        boolean found = false;
        for (Tariff tariff : tariffs) {
            if (tariff.getSubscriptionPrice() >= minPrice && tariff.getSubscriptionPrice() <= maxPrice) {
                found = true;
                tariff.pushInfo();
            }
        }
        if (!found) {
            System.out.println("No tariffs found in the given price range.");
        }
    }

    public void displayAllTariffs() {
        for (Tariff tariff : tariffs) {
            tariff.pushInfo();
        }
    }
}