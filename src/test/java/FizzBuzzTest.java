import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_throw_IAE_given_number_le_0(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Invalid Input");
        FizzBuzz.fizzBuzzGame(0, 3,5,7);
    }
    @Test
    public void numberTest(){
        Assert.assertEquals("1",FizzBuzz.fizzBuzzGame(1,3,5,7));
    }

    @Test
    public void FizzTest(){
        Assert.assertEquals("Fizz",FizzBuzz.fizzBuzzGame(3,3,5,7));
    }

    @Test
    public void BuzzTest(){
        Assert.assertEquals("Buzz",FizzBuzz.fizzBuzzGame(5,3,5,7));
    }

    @Test
    public void WhizzTest(){
        Assert.assertEquals("Whizz",FizzBuzz.fizzBuzzGame(7,3,5,7));
    }

    @Test
    public void FizzBuzzTest(){
        Assert.assertEquals("FizzBuzz",FizzBuzz.fizzBuzzGame(15,3,5,7));
    }

    @Test
    public void WhizzBuzzTest(){
        Assert.assertEquals("BuzzWhizz",FizzBuzz.fizzBuzzGame(35,3,5,7));
    }

    @Test
    public void FizzWhizzTest(){
        Assert.assertEquals("FizzWhizz",FizzBuzz.fizzBuzzGame(21,3,5,7));
    }

    @Test
    public void FizzBuzzWhizzTest(){
        Assert.assertEquals("FizzBuzzWhizz",FizzBuzz.fizzBuzzGame(105,3,5,7));
    }

}
