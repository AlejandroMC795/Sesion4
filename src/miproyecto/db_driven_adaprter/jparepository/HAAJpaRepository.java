package miproyecto.db_driven_adaprter.jparepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import miproyecto.db_driven_adaprter.domain.BookEntity;



public interface HAAJpaRepository extends JpaRepository<BookEntity, Long>{

	Optional<BookEntity> findById(Long id);}
