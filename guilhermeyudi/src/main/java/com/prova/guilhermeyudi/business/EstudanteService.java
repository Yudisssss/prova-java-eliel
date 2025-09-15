package com.prova.guilhermeyudi.business;

import com.prova.guilhermeyudi.infrastructure.entity.Estudante;
import com.prova.guilhermeyudi.infrastructure.repository.EstudanteRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepositoy estudanteRepositoy;

    public Estudante createEstudante(Estudante estudante){
        return estudanteRepositoy.save(estudante);
    }

    public List<Estudante> getAllEstudante(){
        return estudanteRepositoy.findAll();
    }

    public Optional<Estudante> getByIdEstudante(Long id){
        try {
            return estudanteRepositoy.findById(id);
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage() + "Id não encontrado");
        }
    }

    public void deleteByIdEstudante(Long id){
        estudanteRepositoy.deleteById(id);
    }

}
