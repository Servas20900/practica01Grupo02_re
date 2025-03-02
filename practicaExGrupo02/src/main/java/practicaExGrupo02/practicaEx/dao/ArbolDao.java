package practicaExGrupo02.practicaEx.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practicaExGrupo02.practicaEx.domain.Arbol;

@Repository
public interface ArbolDao extends JpaRepository <Arbol,Long>{

}
