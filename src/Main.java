public class Main {
    public static void main(String[] args) {
        Animal[]animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chiken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chiken){
                Chiken a=(Chiken)animal;
                System.out.println(a.howToEat());
            }
        }
        Fruit[]fruits=new Fruit[2];
        fruits[0]=new Aplle();
        fruits[1]=new Orange();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
