package com.arthurmoreira.board_migration.persistence.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static com.arthurmoreira.board_migration.persistence.entity.BoardColumnKindEnum.CANCEL;
import static com.arthurmoreira.board_migration.persistence.entity.BoardColumnKindEnum.INITIAL;;

public class BoardEntity {

	private Long id;
	private String name;
	private List<BoardColumnEntity> boardColumns = new ArrayList<>();

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<BoardColumnEntity> getBoardColumns() {
        return boardColumns;
    }
	
	  public BoardColumnEntity getInitialColumn(){
	        return getFilteredColumn(bc -> bc.getKind().equals(INITIAL));
	    }

	    public BoardColumnEntity getCancelColumn(){
	        return getFilteredColumn(bc -> bc.getKind().equals(CANCEL));
	    }
	    
	private BoardColumnEntity getFilteredColumn(Predicate<BoardColumnEntity> filter){
        return boardColumns.stream()
                .filter(filter)
                .findFirst().orElseThrow();
    }
	
	public void setBoardColumns(List<BoardColumnEntity> columns) {
	    if (columns != null) {
	        this.boardColumns.clear();
	        this.boardColumns.addAll(columns);
	    }
	}

	
}
