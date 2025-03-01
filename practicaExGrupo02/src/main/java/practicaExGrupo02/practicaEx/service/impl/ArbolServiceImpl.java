package practicaExGrupo02.practicaEx.service.impl;

import practicaExGrupo02.practicaEx.dao.ArbolDao;
import practicaExGrupo02.practicaEx.domain.Arbol;
import practicaExGrupo02.practicaEx.service.ArbolService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolServiceImpl implements ArbolService {
    
    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles() {
        return arbolDao.findAll();
    }
}