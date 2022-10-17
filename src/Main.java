import Animals.Amphibians;
import Animals.Flightless;
import Animals.Flying;
import Animals.Herbivores;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* class ANIMALS *********");

        Herbivores gazelle = new Herbivores("Газель", 5, "степь", 20);
        gazelle.sleep();
        gazelle.eat();
        gazelle.move();
        gazelle.walk();
        gazelle.graze();


        Herbivores giraffe = new Herbivores("Жираф", 7, "равнина", 50);
        giraffe.sleep();
        giraffe.eat();
        giraffe.move();
        giraffe.walk();
        giraffe.graze();

        Herbivores horse = new Herbivores("Лошадь", 8, "равнина", 90);
        horse.sleep();
        horse.eat();
        horse.move();
        horse.walk();
        horse.graze();

        Objects.equals(horse, giraffe);

        Amphibians frog = new Amphibians("Лягушка", 7, "болото");

        frog.sleep();
        frog.eat();
        frog.move();
        frog.hunt();

        Amphibians adderFreshwater = new Amphibians("Уж пресноводный", 3, "болото");
        adderFreshwater.sleep();
        adderFreshwater.eat();
        adderFreshwater.move();
        adderFreshwater.hunt();


        Flightless peacock = new Flightless("Павлин", 6, "джунгли", "ходит");
        peacock.sleep();
        peacock.eat();
        peacock.move();
        peacock.walk();

        Flightless penguin = new Flightless("Пингвин", 6, "джунгли", "ходит");
        penguin.sleep();
        penguin.eat();
        penguin.move();
        penguin.walk();

        Flightless dodoBird = new Flightless("Птица Додо", 12, "Южная Америка", "ходит");
        dodoBird.sleep();
        dodoBird.eat();
        dodoBird.move();
        dodoBird.walk();

        Flying seagull = new Flying("Чайка", 9, "море", "летает");
        seagull.sleep();
        seagull.eat();
        seagull.move();
        seagull.fly();

        Flying albatross = new Flying("Альбатрос", 2, "море", "летает");
        albatross.sleep();
        albatross.eat();
        albatross.move();
        albatross.fly();

        Flying falcon = new Flying("Сокол", 2, "горы", "летает");
        falcon.sleep();
        falcon.eat();
        falcon.move();
        falcon.fly();




    }
}