package de.telran._170123_e_be_remote.controller;

import de.telran._170123_e_be_remote.domain.entity.Message;
import de.telran._170123_e_be_remote.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public Message getTestMessage() {
        return service.getTestMessage();
    }

    @GetMapping("/db")
    public Message getMessageFromDB() {
        return service.getMessageFromDB();
    }
}