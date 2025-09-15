package com.autonomk.autonomk_java_spring_quickstart.controller.conversations;



import com.autonomk.autonomk_java_spring_quickstart.dto.createConversation.CreateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.getConversations.GetConversationsResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.insertChat.InsertChatRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationRequestDto;
import com.autonomk.autonomk_java_spring_quickstart.dto.updateConversation.UpdateConversationResponseDto;
import com.autonomk.autonomk_java_spring_quickstart.model.Conversation;
import com.autonomk.autonomk_java_spring_quickstart.service.conversationService.ConversationServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/conversations")
public class ConversationsController {

    private final ConversationServiceImpl conversationService;

    public ConversationsController(ConversationServiceImpl conversationsService) {
        this.conversationService = conversationsService;
    }


   // ok
    @GetMapping
    public ResponseEntity<List<GetConversationsResponseDto>> getConversations(){

        var conversationList = conversationService.getConversations().stream()
                .map(conversation ->
                        new GetConversationsResponseDto(
                            conversation.getId(),
                            conversation.getCreatedAt(),
                            conversation.getUpdatedAt(),
                            conversation.getName(),
                            conversation.getIsStarred()
        )).toList();

        return ResponseEntity.status(HttpStatus.OK).body(conversationList);
    }

    // ok
    @GetMapping("/{id}")
    public ResponseEntity<Conversation>  getConversation(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(conversationService.getConversation(id));
    }

    // ok
    @PostMapping
    public ResponseEntity<Conversation> createConversation(@RequestBody CreateConversationRequestDto createConversation){
         var createdConversation =  conversationService.createConversation(createConversation);
         return ResponseEntity.status(HttpStatus.CREATED).body(createdConversation);
    }

    // ok
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteConversation(@PathVariable String id){
        //ResponseEntity.status
        var deleted =  conversationService.deleteConversation(id);
        if(deleted){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

    // ok
    @PatchMapping
    public ResponseEntity<UpdateConversationResponseDto> updateConversation(@RequestBody UpdateConversationRequestDto updateConversation){
        var updatedConversation =  conversationService.updateConversation(updateConversation);
        return ResponseEntity.status(HttpStatus.OK).body(updatedConversation);
    }

    // ok
    @PatchMapping("/insert-chat")
        public ResponseEntity<Conversation.ChatMessages>  insertChat(@RequestBody InsertChatRequestDto insertChat){
        return ResponseEntity.status(HttpStatus.CREATED).body(conversationService.insertChat(insertChat));
    }


}
