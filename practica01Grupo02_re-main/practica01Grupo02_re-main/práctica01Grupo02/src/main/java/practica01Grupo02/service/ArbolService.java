package practica01Grupo02.service;

import practica01Grupo02.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    // Se obtiene un listado de categorias en un List
    public List<Arbol> getArboles(boolean activos);
}
