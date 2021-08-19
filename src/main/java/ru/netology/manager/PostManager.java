package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;
    private int ownerId;
    private String address;
    private String query;
    private boolean ownersOnlyId;
    private int count;
    private int postId;


    public Post[] WallSearch(int ownerId, String address, String query, boolean ownersOnlyId, int count) {
//        add logic
        return null;
    }
    public void WallDelete(int ownerId, int postId){

    }
}