package _1_assignment.housetypes;

public class House {

    private long price;
    private int squareMeter;
    private int numberOfRooms;
    private int numberOfSaloon;

    public House(long price, int squareMeter, int numberOfRooms, int numberOfSaloon) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSaloon = numberOfSaloon;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfSaloon() {
        return numberOfSaloon;
    }

    public void setNumberOfSaloon(int numberOfSaloon) {
        this.numberOfSaloon = numberOfSaloon;
    }
}
