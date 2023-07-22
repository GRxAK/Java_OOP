package homework02;

public interface QueueBehavior {
    void takeInQueue(Actor actor);

    void takeOrder();

    void giveOrder();

    void releaseFromQueue();
}
