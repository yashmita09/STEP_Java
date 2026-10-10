/**
 * Week 1 - Assignment Problem 4: The Warehouse Inventory Balancer
 * Suggested method signature: void analyzeInventory(int[] sectionA, int[] sectionB)
 */
public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null) {
            System.out.println("Invalid input arrays.");
            return;
        }

        int totalA = 0, totalB = 0;
        int highestQty = Integer.MIN_VALUE;
        String highestSection = "";
        int highestItemNumber = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highestQty) {
                highestQty = sectionA[i];
                highestSection = "Section A";
                highestItemNumber = i + 1;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highestQty) {
                highestQty = sectionB[i];
                highestSection = "Section B";
                highestItemNumber = i + 1;
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        System.out.println(String.format(
            "Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)",
            totalA, totalB, status, highestQty, highestSection, highestItemNumber
        ));
    }

    public static void main(String[] args) {
        int[] secA = {20, 15, 30};
        int[] secB = {25, 10, 30};
        analyzeInventory(secA, secB);
    }
}
