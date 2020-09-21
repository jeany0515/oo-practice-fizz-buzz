package fizz.buzz;

public abstract class AbstractCounter {
    private AbstractCounter nextCounter;

    public void setNextCounter(AbstractCounter nextCounter){
        this.nextCounter = nextCounter;
    }

    public final AbstractCounter getNextCounter() {
        return this.nextCounter;
    }

    public abstract String count(int number);
}
