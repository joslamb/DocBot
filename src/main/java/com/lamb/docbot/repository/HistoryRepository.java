package com.lamb.docbot.repository;

import com.lamb.docbot.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long>{
    List<History> findAll();

    List<History> findBySender(String sender);
}
