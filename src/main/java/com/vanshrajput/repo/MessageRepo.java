package com.vanshrajput.repo;

import com.vanshrajput.models.Message;

import java.util.List;

public interface MessageRepo{
    List<Message> findBySenderAndReceiver(String receiverId, String senderId);

    void save(Message message);

    Message getLastMessage(String id, String id1);
}
