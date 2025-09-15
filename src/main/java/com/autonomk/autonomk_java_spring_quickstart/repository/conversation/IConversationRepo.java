package com.autonomk.autonomk_java_spring_quickstart.repository.conversation;

import com.autonomk.autonomk_java_spring_quickstart.model.Conversation;

import java.util.List;

// TODO IMPLEMENT
public interface IConversationRepo {

    List<Conversation> findAll();
    Conversation findById(Long id);
    Conversation save(Conversation conversation);
    void deleteById(Long id);

}
