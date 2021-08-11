package ru.netology.domain;

public class CommentsInfo {
    private int countComments; // колличество комментариев
    private boolean canPost; // возможность отправить комментарии
    private int dateComments; // время и дата комментария
    private String textComments; // текст комментария
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getDateComments() {
        return dateComments;
    }

    public void setDateComments(int dateComments) {
        this.dateComments = dateComments;
    }

    public String getTextComments() {
        return textComments;
    }

    public void setTextComments(String textComments) {
        this.textComments = textComments;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
