package com.springprojeto.repositories;

public class ClienteRepository {

    import com.springprojeto.model.Cliente;
	import org.springframework.data.jpa.repository.JpaRepository;
	 import org.springframework.stereotype.Repository;
	
	 @Repository
	public interface ClienteRepository extends JpaRepository<Cliente, long> {
	    
	}
}
