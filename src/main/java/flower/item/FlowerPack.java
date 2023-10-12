package flower.item;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public double getPrice(){
        double one = flower.getPrice();
        return one * quantity;

    }
    public FlowerPack(Flower flower, int quantity){
        this.quantity = quantity;
        this.flower = flower;
    }
}
