package com.springprojeto.repositories;

public class DestinoRepository {

	import com.springprojeto.model.Cliente;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	
	@Repository
	public interface DestinoRepository extends JpaRepository<Destino, long> {
	   }
	
}
