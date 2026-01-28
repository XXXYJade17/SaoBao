package com.xxxyjade.saobao.controller;

import com.xxxyjade.saobao.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * 聊天管理控制层
 */
@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @RequestMapping(value = "/chat", produces = "text/html;charset=utf-8")
    public Flux<String> chat(@RequestParam("memoryId") String memoryId, @RequestParam("message") String message) {
        return chatService.chat(memoryId, message);
    }
}
