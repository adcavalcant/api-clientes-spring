package io.github.adcavalcant.model.repository;

import io.github.adcavalcant.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
