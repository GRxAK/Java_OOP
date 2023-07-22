package homework02;

public class Main {
    public static void main(String[] args) {

        Market market = new Market();

        Human human01 = new Human("Василий");
        Human human02 = new Human("Ульяна");

        market.acceptToMarket(human01);
        market.acceptToMarket(human02);

        market.update();

    }
}
