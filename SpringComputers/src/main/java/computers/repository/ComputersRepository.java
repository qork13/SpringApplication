package computers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import computers.beans.Computers;

@Repository
public interface ComputersRepository extends JpaRepository<Computers, Long> { }

	
