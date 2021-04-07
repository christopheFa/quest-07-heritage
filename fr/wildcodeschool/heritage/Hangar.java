package fr.wildcodeschool.heritage;

public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 175);
        Boat titanic = new Boat("Titanic", 60);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
