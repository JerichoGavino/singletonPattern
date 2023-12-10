package singletonPattern;

import java.util.ArrayList;
import java.util.List;

public class QueueSystem {
    private int queueNumber;
    private static QueueSystem instance;
    private List<Subscriber> subscribers = new ArrayList<>();

    private QueueSystem() {
        this.queueNumber = 0;
    }

    public static QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public void resetQueue(int n, String stationName) {
        this.queueNumber = n;
        notifySubscribers(stationName);
    }

    public int getQueueNumber(String stationName) {
        int currentNumber = this.queueNumber++;
        notifySubscribers(stationName);
        return currentNumber;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    private void notifySubscribers(String stationName) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(queueNumber, stationName);
        }
    }
}