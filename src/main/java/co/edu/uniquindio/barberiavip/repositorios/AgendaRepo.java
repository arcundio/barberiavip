package co.edu.uniquindio.barberiavip.repositorios;

import co.edu.uniquindio.barberiavip.modelo.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepo extends JpaRepository<Agenda, Integer> {
}
