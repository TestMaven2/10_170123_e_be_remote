package de.telran._170123_e_be_remote.repository;

import de.telran._170123_e_be_remote.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}