package com.logworld.dto;

import com.logworld.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private Long id;
    private String content;
    private LocalDateTime createDt;

    public MessageDto(Message message){
        this.id = message.getId();
        this.content = message.getContent();
        this.createDt = message.getCreateDt();
    }
}
