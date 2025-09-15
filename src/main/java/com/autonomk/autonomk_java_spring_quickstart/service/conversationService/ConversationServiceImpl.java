package com.autonomk.autonomk_java_spring_quickstart.service.conversationService;

import com.autonomk.autonomk_java_spring_quickstart.dto.createConversation.CreateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.insertChat.InsertChatRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.model.Conversation;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.*;

@Service
public class ConversationServiceImpl implements IConversationService {

    private final Map<String, Conversation> conversations = new HashMap<>();
    public ConversationServiceImpl() {}

    @Override
    public List<Conversation> getConversations() {
        return new ArrayList<>(conversations.values());
    }

    @Override
    public Conversation getConversation(String conversationId) {
        return conversations.get(conversationId);
    }


    @Override
    public Conversation createConversation(CreateConversationRequestDto createConversationDto) {
        Instant now = Instant.now();
        var chatId = UUID.randomUUID().toString();
        long timestamp = now.toEpochMilli();

        var name = createConversationDto.getName();
        var type = createConversationDto.getType();
        var text = createConversationDto.getText();
        var sender = createConversationDto.getSender();

        var chatContent = new Conversation.ChatContent(type, text, sender);

        var chatMessages = new Conversation.ChatMessages(chatId, chatContent, timestamp, timestamp, null);

        var conversationID = UUID.randomUUID().toString();

        var arrayOfChatMessages =  new ArrayList<Conversation.ChatMessages>();
        arrayOfChatMessages.add(chatMessages);

        var conversation =  new Conversation(conversationID, name, timestamp, timestamp, false, arrayOfChatMessages);

         conversations.put(conversationID, conversation);

         return conversation;

    }

    @Override
    public Conversation.ChatMessages insertChat(InsertChatRequestDto insertChat) {
            Instant now = Instant.now();

            // find the conversation and insert chat into the chatMessages List

            var conversationsId = insertChat.getConversationId();
            var text = insertChat.getText();
            var sender = insertChat.getSender();
            var type = insertChat.getType();
            var parentId = insertChat.getParentId();

            var conversation = conversations.get(conversationsId);

            // construct a new chat Message object

        long time = now.toEpochMilli();

        var chatId = UUID.randomUUID().toString();

        var chatContent = new Conversation.ChatContent(type, text, sender);

        var chatMessage = new Conversation.ChatMessages(chatId, chatContent, time, time, parentId);

        conversation.chatMessages.add(chatMessage);

        return chatMessage;
    }

    @Override
    public boolean deleteConversation(String conversationId) {
        conversations.remove(conversationId);
        // check conversation no longer exists in the conversations map
        return conversations.get(conversationId) == null;
    }

    @Override
    public UpdateConversationResponseDto updateConversation(UpdateConversationRequestDto updateConversation) {

        var name = updateConversation.getName();
        var id = updateConversation.getConversationId();
        var isStarred = updateConversation.isStarred();

        var conversation = conversations.get(id);

        conversation.setName(name);
        conversation.setIsStarred(isStarred);

        var now  = Instant.now();

        long updatedTime = now.toEpochMilli();

        // update the time this was updated
        conversation.setUpdatedAt(updatedTime);

        return new UpdateConversationResponseDto(id, name, conversation.getCreatedAt(), updatedTime, isStarred);
    }
}
