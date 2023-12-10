package singletonPattern;

public class UserApp {
    public static void main(String[] args) {
        QueueSystem queueSystem = QueueSystem.getInstance();
        OnlineMonitor monitor = new OnlineMonitor();
        queueSystem.subscribe(monitor);

        HelpDeskStation station1 = new HelpDeskStation(queueSystem, "Counter 1");
        HelpDeskStation station2 = new HelpDeskStation(queueSystem, "Counter 2");
        HelpDeskStation station3 = new HelpDeskStation(queueSystem, "Counter 3");

        station1.serveNext();
        station2.serveNext();
        station3.serveNext();

        station1.resetQueue(10);
    }
}