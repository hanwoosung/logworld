package com.logworld.controller;

import com.logworld.dto.MessageDto;
import com.logworld.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping
    public MessageDto createMessage(@RequestBody MessageDto messageDto) {
        return messageService.save(messageDto.getContent());
    }

}
