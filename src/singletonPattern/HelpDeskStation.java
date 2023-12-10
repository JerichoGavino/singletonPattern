package singletonPattern;

public class HelpDeskStation {
    private QueueSystem queueSystem;
    private String name;

    public HelpDeskStation(QueueSystem queueSystem, String name) {
        this.queueSystem = queueSystem;
        this.name = name;
    }

    public void serveNext() {
        int queueNumber = queueSystem.getQueueNumber(name);
        System.out.println(name + " is serving number: " + queueNumber);
    }

    public void resetQueue(int n) {
        queueSystem.resetQueue(n, name);
        System.out.println("[Update]" + name + " reset number to: " + n);
    }
}
