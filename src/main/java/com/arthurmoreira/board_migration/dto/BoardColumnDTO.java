package com.arthurmoreira.board_migration.dto;

import com.arthurmoreira.board_migration.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
        String name,
        BoardColumnKindEnum kind,
        int cardsAmount) {
}
