package marqdisc.mrqs.repositories;

import marqdisc.mrqs.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
