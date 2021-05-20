package greet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetTest {

    @Test
    public void shouldReturnHowManyTimesAPersonHasBeenGreeted(){
        Greet greet = new Greet();

        greet.greetPerson("Matt",2);
        greet.greetPerson("Mark",2);
        greet.greetPerson("Merk",2);
        greet.greetPerson("Mark",2);

        assertEquals(2,greet.greeted("Mark"));
    }

    @Test
    public void shouldReturnCountOfHowManyUniqueNamesHaveBeenGreeted(){
        Greet greet = new Greet();

        greet.greetPerson("Matt",2);
        greet.greetPerson("Mark",2);
        greet.greetPerson("Merk",2);
        greet.greetPerson("Mark",2);

        assertEquals(3,greet.counter());
    }

    @Test
    public void shouldBeAbleToDeleteAPersonFromTheList(){
        Greet greet = new Greet();

        greet.greetPerson("Matt",2);
        greet.greetPerson("Mark",2);
        greet.greetPerson("Merk",2);
        greet.greetPerson("Mark",2);

        greet.greeted();
        greet.clear("Mark");
        greet.greeted();

        assertEquals(2, greet.counter());
    }

    @Test
    public void shouldBeAbleToClearList(){
        Greet greet = new Greet();

        greet.greetPerson("Matt",2);
        greet.greetPerson("Mark",2);
        greet.greetPerson("Merk",2);
        greet.greetPerson("Mark",2);

        greet.greeted();
        greet.clear();
        greet.greeted();

        assertEquals(0, greet.counter());
    }

}
