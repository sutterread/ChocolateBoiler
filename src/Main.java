
public class Main {
    public static void main(String[] args) {
      Boiler boiler = Boiler.getInstance();
      
      boiler.fillBoiler();
      boiler.mix();
      boiler.emptyBoiler();
    }
}
