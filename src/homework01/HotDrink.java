package homework01;

import java.util.Objects;

public class HotDrink extends Product {
    private int temperature;
    private int volume;

    public HotDrink (String name, double cost, int temperature, int volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Горячий напиток: название = " + super.getName() +
                ", стомость = " + super.getCost() +
                "р. , объем = " + this.volume +
                "мм. , температура = " + this.temperature + "С";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDrink hotDrink = (HotDrink) o;
        return  super.getName() == hotDrink.getName() &&
                super.getCost() == hotDrink.getCost() &&
                this.temperature == hotDrink.temperature &&
                this.volume == hotDrink.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, volume);
    }
}
