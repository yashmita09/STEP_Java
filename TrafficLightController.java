public class TrafficLightController {
    static class TrafficLight {
        private final String id;
        private static final String[] CYCLE = {"RED", "GREEN", "YELLOW"};
        private int index = 0;
        public TrafficLight(String id) { this.id = id; }
        public String getColor() { return CYCLE[index]; }
        public String next() {
            index = (index + 1) % CYCLE.length;
            return CYCLE[index];
        }
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor());
        System.out.println(t.next());
        System.out.println(t.next());
        System.out.println(t.next());
    }
}
