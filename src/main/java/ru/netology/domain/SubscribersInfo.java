package ru.netology.domain;

public class SubscribersInfo {
    private String id;
    private String allSubscribers;
    private int numberOfSubscribers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAllSubscribers() {
        return allSubscribers;
    }

    public void setAllSubscribers(String allSubscribers) {
        this.allSubscribers = allSubscribers;
    }

    public int getNumberOfSubscribers() {
        return numberOfSubscribers;
    }

    public void setNumberOfSubscribers(int numberOfSubscribers) {
        this.numberOfSubscribers = numberOfSubscribers;
    }
}
