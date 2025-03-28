package com.logworld.service;


import com.logworld.dto.MessageDto;
import com.logworld.entity.Message;
import com.logworld.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageDto save(String content) {
        Message message = new Message();
        message.setContent(content);
        return new MessageDto(messageRepository.save(message));
    }

}
