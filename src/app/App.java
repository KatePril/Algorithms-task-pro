package app;

import app.data.DataProvider;
import app.data.Product;
import app.services.DataService;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    public static void main(String[] args) {
        double priceSearch = getSearchValue();
        List<Product> list = DataProvider.getData();
        getOutput(list);
        DataService service = new DataService();
        int index = service.search(list, priceSearch);
        getOutput(list, priceSearch, index);
    }

    private static double getSearchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price value to search (x.xx): ");
        return Double.parseDouble(scanner.next());
    }

    private static void getOutput(List<Product> list) {
        System.out.print("Initial data:\n");

        AtomicInteger count = new AtomicInteger(1);

        for (Product product : list)
            System.out.println(count.getAndIncrement() + ") " +
                    product.name() + ", USD " + product.price());
    }

    private static void getOutput(List<Product> list, double priceSearch, int index) {
        System.out.println("------------------------");
        if (index == -1)
            System.out.print("No data.\n");
        else
            System.out.print("Product: " + list.get(index).name() +
                    ", USD " + priceSearch + "\n");
    }
}
