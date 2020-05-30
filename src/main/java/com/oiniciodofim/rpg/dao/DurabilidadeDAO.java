package com.oiniciodofim.rpg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oiniciodofim.rpg.model.DurabilidadeModel;

@Repository
public interface DurabilidadeDAO extends CrudRepository<DurabilidadeModel, String> {

	@Procedure(procedureName="listar_durabilidades")
	List<DurabilidadeModel> getDurabilidadeList();
	
}
