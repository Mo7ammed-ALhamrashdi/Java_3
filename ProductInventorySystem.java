import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductInventorySystem {
    public static double calculateTotalValue(List<Double> prices, List<Integer> quantities) {
        double totalValue = 0;

        for (int i = 0; i < prices.size(); i++) {
            totalValue += prices.get(i) * quantities.get(i);
        }

        return totalValue;
    }

    public static String checkStockStatus(int quantity) {
        if (quantity > 10) {
            return "High Stock";
        } else if (quantity >= 1) {
            return "Available";
        } else {
            return "Out of Stock";
        }
    }

    public static int[] countStockStatus(List<Integer> quantities) {
        int availableProducts = 0;
        int outOfStockProducts = 0;

        for (int quantity : quantities) {
            if (quantity > 0) {
                availableProducts++;
            } else {
                outOfStockProducts++;
            }
        }

        return new int[]{availableProducts, outOfStockProducts};
    }

    public static String findMostExpensiveProduct(List<String> productNames, List<Double> prices) {
        double highestPrice = prices.get(0);
        String mostExpensiveProduct = productNames.get(0);

        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) > highestPrice) {
                highestPrice = prices.get(i);
                mostExpensiveProduct = productNames.get(i);
            }
        }

        return mostExpensiveProduct;
    }

    public static void displayReport(List<String> productNames,
                                     List<Double> prices,
                                     List<Integer> quantities,
                                     double totalValue,
                                     int availableProducts,
                                     int outOfStockProducts,
                                     String mostExpensiveProduct) {

        System.out.println("\n========== Product Inventory Report ==========");

        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Product Name : " + productNames.get(i));
            System.out.println("Price        : $" + prices.get(i));
            System.out.println("Quantity     : " + quantities.get(i));
            System.out.println("Stock Status : " + checkStockStatus(quantities.get(i)));
            System.out.println("----------------------------------------");
        }

        System.out.println("Total Inventory Value      : $" + totalValue);
        System.out.println("Available Products         : " + availableProducts);
        System.out.println("Out of Stock Products      : " + outOfStockProducts);
        System.out.println("Most Expensive Product     : " + mostExpensiveProduct);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<String> productNames = new ArrayList<>();
        List<Double> productPrices = new ArrayList<>();
        List<Integer> productQuantities = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter details for Product " + i);

            System.out.print("Product Name: ");
            productNames.add(input.nextLine());

            System.out.print("Product Price: ");
            productPrices.add(input.nextDouble());

            System.out.print("Product Quantity: ");
            productQuantities.add(input.nextInt());
            input.nextLine();

            System.out.println();
        }

        double totalValue = calculateTotalValue(productPrices, productQuantities);

        int[] stockCounts = countStockStatus(productQuantities);

        String mostExpensiveProduct = findMostExpensiveProduct(productNames, productPrices);

        displayReport(productNames,
                productPrices,
                productQuantities,
                totalValue,
                stockCounts[0],
                stockCounts[1],
                mostExpensiveProduct);

        input.close();
    }
}
