package pe.edu.uni.demopersistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRepuesto extends JpaRepository<Repuesto, Integer> {

    public List<Repuesto> findByNombreIgnoreCase(String nombre);

    public List<Repuesto> findByMarcaContainingIgnoreCase(String marca);

    public List<Repuesto> findByNombreContainingIgnoreCaseOrMarcaContainingIgnoreCase(String nombre, String marca);
}
