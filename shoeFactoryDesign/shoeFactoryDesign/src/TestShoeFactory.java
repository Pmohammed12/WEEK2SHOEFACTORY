public class TestShoeFactory {
    public static void main(String[] args) {
        ShoesFactory shoesFactory = new ShoesFactory();
        Shoes boots = shoesFactory.manufacture("Boots");
        if (boots != null)
            boots.getShoes();
        Shoes sneakers = shoesFactory.manufacture("Sneakers");
        if (sneakers != null)
            sneakers.getShoes();
        Shoes earth = shoesFactory.manufacture("Earth");
        if (earth != null)
            earth.getShoes();
        Shoes clogs = shoesFactory.manufacture("Clogs");
        if (clogs != null)
            clogs.getShoes();
    }
 }