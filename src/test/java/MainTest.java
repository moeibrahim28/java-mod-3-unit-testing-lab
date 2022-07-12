import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FizzBuzzTest {
    @Test
    public void fizzTest(){
        FizzBuzz fizz= new FizzBuzz();
        assertEquals("Fizz",fizz.fizzBuzzString("fun"),"Printed Fizz");

    }

    @Test
    public void buzzTest(){
        FizzBuzz buzz=new FizzBuzz();
        assertEquals("Buzz", buzz.fizzBuzzString("club"), "Printed Buzz");
    }

    @Test
    public void fizzBuzzTest(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzzString("flab"), "Printed fizzBuzz");
    }

    @Test
    public void nonFizzBuzzWordTest(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertEquals("clear", fizzBuzz.fizzBuzzString("clear"), "Printed same word back");
    }

    @Test
    public void nullTest(){
        FizzBuzz fizzBuzz=new FizzBuzz();
        assertThrows(IllegalArgumentException.class,() -> fizzBuzz.fizzBuzzString(null));
    }
}