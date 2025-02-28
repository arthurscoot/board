package com.arthurmoreira.board_migration.dto;

import com.arthurmoreira.board_migration.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
