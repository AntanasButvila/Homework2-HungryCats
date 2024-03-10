public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 20),
                new Cat("Murzik", 30),
                new Cat("Pushok", 100)
        };

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat : cats) {
            if (plate.getFood() >= cat.getAppetite()) {
                cat.eat(plate);
            } else {
                plate.addFood(20);
                cat.eat(plate);
            }
            System.out.println(cat.getName() + " is full: " + cat.isFull());
        }

        plate.info();
    }
}

