package app.services;

import app.data.Product;

import java.util.List;

public final class DataService {
    //Також змінила на статичний клас

    // Алгоритм лінійного пошуку
    public static int search(List<Product> list, double x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price() == x) return i;
        }
        return -1;
    }
}
