public class ShoppingCart {
    static class Cart {
        private final String cartId;
        private final int[] prices;
        private int count;
        public Cart(String cartId, int maxItems) {
            this.cartId = cartId;
            this.prices = new int[Math.max(1, maxItems)];
        }
        public void addItem(int p) {
            if (p >= 0 && count < prices.length) prices[count++] = p;
        }
        public int getTotal() {
            int tot = 0;
            for (int i = 0; i < count; i++) tot += prices[i];
            return tot;
        }
        public int getItemCount() { return count; }
    }
    public static void main(String[] args) {
        Cart c = new Cart("CART-5", 20);
        c.addItem(250); c.addItem(99); c.addItem(151);
        System.out.println("Total: " + c.getTotal());
        System.out.println("Count: " + c.getItemCount());
    }
}
