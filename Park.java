public class Park {
    private Attraction attraction;

    public Park(String name, String openingTime, double price) {
        this.attraction = new Attraction(name, openingTime, price);
    }

    public void displayAttractionInfo() {
        System.out.println(attraction);
    }

    public class Attraction {
        private String name;
        private String openingTime;
        private double price;

        public Attraction(String name, String openingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.price = price;
        }

    }
}
  