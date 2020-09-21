package fizz.buzz;

public class FizzBuzz {
    AbstractCounter counter;
    public FizzBuzz() {
        DefaultFizzCounter defaultFizzCounter = new DefaultFizzCounter();
        FizzBuzzCounter fizzBuzzCounter = new FizzBuzzCounter();
        FizzCounter fizzCounter = new FizzCounter();
        BuzzCounter buzzCounter = new BuzzCounter();

        defaultFizzCounter.setNextCounter(fizzBuzzCounter);
        fizzBuzzCounter.setNextCounter(fizzCounter);
        fizzCounter.setNextCounter(buzzCounter);

        this.counter = defaultFizzCounter;
    }

    public String count(int number) {
        return counter.count(number);
    }
}
