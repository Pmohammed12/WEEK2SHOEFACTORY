public class ShoesFactory {
  
    public Shoes manufacture(String name) {
        Shoes shoes = null;
       
        if (name.equalsIgnoreCase("Boots")) {
            shoes = new BootShoes();
        }
        else if (name.equalsIgnoreCase("Sneakers")) {
            shoes = new SneakerShoes();
        }
        else if (name.equalsIgnoreCase("Earth")) {
            shoes = new EarthShoes();
        }
        else {
            System.out.println(name + " shoes are not manufactured.");
        }
        return shoes;
    }
 }
 