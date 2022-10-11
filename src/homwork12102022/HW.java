package homwork12102022;

public class HW {

    public static class MarketConstructor {


        String subMarket;
        String product;
        boolean online;
        boolean margin;
        int allProdukt = 128;
        String cuntry;

        Hwpart2 hwPart2;


        public MarketConstructor(String subMarket, String product, boolean online, boolean margin, int allProdukt, String cuntry) {
            this.subMarket = subMarket;
            this.product = product;
            this.online = online;
            this.margin = margin;
            this.allProdukt = allProdukt;
            this.cuntry = cuntry;
            this.hwPart2 = new Hwpart2();
        }

        public Hwpart2 getHwPart2() {
            return hwPart2;
        }

        public String getSubMarket() {
            return subMarket;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public static void main(String[] args) {
            MarketConstructor nyse = new MarketConstructor("futures", "s&p", true, true, 36, "usa");

            System.out.println(nyse.getSubMarket());

            nyse.setProduct("7e");

            System.out.println(nyse.getProduct());

            System.out.println(nyse.getHwPart2().getForMonth());


        }

    }

}
