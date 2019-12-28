import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void RainyTest(){
        Assert.assertEquals("Oops",FizzBuzz.fizzBuzzGame(0));
    }
    @Test
    public void numberTest(){
        Assert.assertEquals("1",FizzBuzz.fizzBuzzGame(1));
    }

    @Test
    public void FizzTest(){
        Assert.assertEquals("Fizz",FizzBuzz.fizzBuzzGame(3));
    }

    @Test
    public void BuzzTest(){
        Assert.assertEquals("Buzz",FizzBuzz.fizzBuzzGame(5));
    }

    @Test
    public void FizzBuzzTest(){
        Assert.assertEquals("FizzBuzz",FizzBuzz.fizzBuzzGame(15));
    }
}
