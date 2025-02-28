package com.arthurmoreira.board_migration.dto;

import java.util.List;

public record BoardDetailsDTO(Long id,
        String name,
        List<BoardColumnDTO> columns) {
}
