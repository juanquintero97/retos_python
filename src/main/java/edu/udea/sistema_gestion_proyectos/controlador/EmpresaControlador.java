package edu.udea.sistema_gestion_proyectos.controlador;

import edu.udea.sistema_gestion_proyectos.business.GestorEmpresa;
import edu.udea.sistema_gestion_proyectos.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpresaControlador {

    @Autowired
    private GestorEmpresa gestorEmpresa;

    @GetMapping("/empresas")
    public ResponseEntity<ArrayList<Empresa>> getEmpresas(){
        return new ResponseEntity<>(gestorEmpresa.getEmpresas(), HttpStatus.OK);
    }

    @GetMapping("/empresa")
    public ResponseEntity<Object> getUsuario(@RequestParam String name){
        try {
            Empresa empresa = gestorEmpresa.getEmpresa(name);
            return new ResponseEntity<>(empresa,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/empresa")
    public ResponseEntity<String> postEmpresa(@RequestBody Empresa empresaParametro){
        try {
            String mensaje = gestorEmpresa.setEmpresa(empresaParametro);
            return new ResponseEntity<>(mensaje,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
