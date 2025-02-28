package com.arthurmoreira.board_migration.dto;

import java.time.OffsetDateTime;

public record CardDetailsDTO(Long id,
        String title,
        String description,
        boolean blocked,
        OffsetDateTime blockedAt,
        String blockReason,
        int blocksAmount,
        Long columnId,
        String columnName
) {
}