package Bird;

public class Client {
    
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        Pigeon.increaseCount();
        System.out.println(Pigeon.count);
      bird.fly();
        
    }
}
