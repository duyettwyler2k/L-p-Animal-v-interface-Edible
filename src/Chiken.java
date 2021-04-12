public class Chiken extends Animal implements Ediable{

    @Override
    public String makeSound() {
        return "Chiken:cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be freid";
    }
}
