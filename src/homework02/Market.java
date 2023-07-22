package homework02;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior {

    private final List<Actor> queue;

    public Market () {
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("   Входит в очередь: " + actor.getName());
        this.queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor : this.queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println("   Сделал заказ: " + actor.getName());
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : this.queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("   Получил заказ: " + actor.getName());
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : this.queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println("   Выходит из очереди: " + actor.getName());
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел/шла в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " покидает магазин");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
