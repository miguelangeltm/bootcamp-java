package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;


@RestController
public class BusquedaController {
    public String[] nombres = {
            "Miguel",
            "Ezequiel",
            "Jader",
            "Sharon",
            "Gaspar",
            "Jairo"
    };

    @GetMapping("busqueda-usuario/{busqueda}")
    public List<String> busquedaNombre(@PathVariable String busqueda){

        List<String> resultado = new ArrayList<>();


        //logica de busqueda
        for (String nombre : nombres) {
            if (nombre.toLowerCase().equalsIgnoreCase(busqueda.toLowerCase())) {
                resultado.add("Usuario Encontrado: "+nombre);

            }

        }
        return resultado;
    }
    @GetMapping("busqueda-usuario2/{busqueda}")
    public List<String> busquedaAutocompletada(@PathVariable String busqueda){

        List<String> sugerencias = new ArrayList<>();


        //logica de busqueda
        for (String nombre : nombres) {
            if (nombre.toLowerCase().contains(busqueda.toLowerCase())) {
                sugerencias.add(nombre);
            }
        }
        return sugerencias;
    }

    @GetMapping("busqueda-usuario/")
    public String[] mostrarUsuarios(){
        return nombres;
    }
    @GetMapping("busqueda-usuario/agregar/{nombre}")
    public String[] agregarUsuario(@PathVariable String nombre){
        nombres = add(nombres, nombre);
        return nombres;
    }
    @GetMapping("busqueda-usuario/borrar/{busqueda}")
    public String[] borrarUsuario(@PathVariable String busqueda){
        for (int i=0; i<nombres.length; i++){
            if (nombres[i].toLowerCase().startsWith(busqueda.toLowerCase())) {
                nombres = delete(nombres,nombres[i]);
            }
        }
        return nombres;
    }

    public String[] add(String[] Array, String nombre) {
        String[] nuevoNombres = Arrays.copyOf(Array, Array.length + 1);
        nuevoNombres[Array.length] = nombre;
        return nuevoNombres;
    }
    public String[] delete(String[] Array, String nombre) {
        String[] nuevosNombres = new String[Array.length-1];
        int indiceNuevosNombres =0;
        for (int i=0; i<Array.length; i++){
            if(Array[i]!=nombre){
                nuevosNombres[indiceNuevosNombres] = Array[i];
                indiceNuevosNombres++;
            }
        }

        return nuevosNombres;
    }


}
