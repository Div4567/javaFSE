package Algorithm;
import java.util.Arrays;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Required for sorting the array before a binary search
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }

    @Override
    public String toString() {
        return "ID: " + productId + " | Name: " + productName + " | Category: " + category;
    }
}

public class EcommerceSearch {

    // --- Linear Search Implementation ---
    // Works on both sorted and unsorted arrays
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product; // Best case: found early. Worst case: found at end / not found.
            }
        }
        return null;
    }

    // --- Binary Search Implementation ---
    // REQUIRES the array to be sorted beforehand
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }
            
            if (products[mid].productId < targetId) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Setup: Array of products (currently unsorted)
        Product[] inventory = {
            new Product(105, "Wireless Headphones", "Electronics"),
            new Product(101, "Running Shoes", "Apparel"),
            new Product(108, "Coffee Maker", "Home & Kitchen"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(107, "Yoga Mat", "Fitness")
        };

        int searchId = 108;

        // 1. Linear Search (No sorting required)
        System.out.println("--- Linear Search ---");
        Product foundLinear = linearSearch(inventory, searchId);
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Product not found.");

        // 2. Binary Search (Sorting strictly required)
        System.out.println("\n--- Binary Search ---");
        Arrays.sort(inventory); // Sorts based on compareTo (productId)
        Product foundBinary = binarySearch(inventory, searchId);
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Product not found.");
    }
}
