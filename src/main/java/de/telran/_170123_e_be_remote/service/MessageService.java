package de.telran._170123_e_be_remote.service;

import de.telran._170123_e_be_remote.domain.entity.Message;
import de.telran._170123_e_be_remote.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message getTestMessage() {
        Message message = new Message();
        message.setText("Hello from application!");
        return message;
    }

    public Message getMessageFromDB() {
        return repository.findById(1).orElse(null);
    }
}