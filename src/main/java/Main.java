public class Main {
            public static void main(String[] args) {
            Box<Apple> appleBox = new Box<>();
            appleBox.addFruit(new Apple());
            System.out.println(appleBox.getTotalWeight());

            Box<Fruit> fruitBox = new Box<>();

            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            System.out.println(orangeBox.getTotalWeight());
        }
}
