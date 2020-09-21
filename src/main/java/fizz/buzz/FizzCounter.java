package fizz.buzz;

public class FizzCounter extends AbstractCounter {

    @Override
    public String count(int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        if(number % fizzNumber == 0) {
           result = "Fizz" ;
        } else if(getNextCounter() != null) {
            result = getNextCounter().count(number);
        }

        return result;
    }
}
