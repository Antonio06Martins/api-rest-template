package br.com.antonio.apirest.repository;

import br.com.antonio.apirest.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
