package practicaExGrupo02.practicaEx.service;

import practicaExGrupo02.practicaEx.domain.Arbol;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ArbolService {
    List<Arbol> getArboles();

}
