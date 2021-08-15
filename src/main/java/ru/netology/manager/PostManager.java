package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
private Post[] posts;
//
//    public Post[]search(){
////        TODO: add logic
//        return null;
//    }
//    public void delete(){
//        // TODO: add logic
//    }
    private int ownerId;  // идентификатор пользователя или сообщества
    private String address; // адрес пользователя или сообщества
    private String query; // поисковый запрос
    private boolean ownersOnlyId;  // записи только данного пользователя
    private int count;  // количество записей, соответствующих запросу
    private int postId;  // идентификатор записи

    public Post[] searchOwnerId(){
//        TODO: add logic
        return null;
    }
    public Post[] searchAddress() {
//        TODO: add logic
        return null;
    }
    public Post[] searchQuery() {
//        TODO: add logic
        return null;
    }
    public Post[] searchOwnersOnlyId() {
//        TODO: add logic
        return null;
    }
    public Post[] searchCount() {
//        TODO: add logic
        return null;
    }
    public Post[] searchPostId() {
//        TODO: add logic
        return null;
    }
    public void deleteOwnersOnlyId() {
//        TODO: add logic
    }
}
