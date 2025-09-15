package com.autonomk.autonomk_java_spring_quickstart.service.conversationService;

import com.autonomk.autonomk_java_spring_quickstart.dto.createConversation.CreateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.insertChat.InsertChatRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.model.Conversation;

import java.util.List;

public interface IConversationService {

    List<Conversation> getConversations();

    Conversation getConversation(String conversationId);

    Conversation createConversation(CreateConversationRequestDto createConversationDto);

    Conversation.ChatMessages insertChat(InsertChatRequestDto insertChat);

    boolean deleteConversation(String conversationId);

    UpdateConversationResponseDto updateConversation(UpdateConversationRequestDto updateConversation);

}
