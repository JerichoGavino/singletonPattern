package singletonPattern;


public class OnlineMonitor implements Subscriber {
    @Override
    public void update(int queueNumber, String stationName) {
    	 System.out.println("[Online Monitor] The current queue number is: " + queueNumber + ", being served by: " + stationName);
    }
}