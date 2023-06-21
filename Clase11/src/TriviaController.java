package com.miguelangeltm.bootcampJava;

import com.miguelangeltm.bootcampJava.entities.Categorias;
import com.miguelangeltm.bootcampJava.entities.Pregunta;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriviaController {


    @GetMapping("/categories")
    public Categorias[] getCategories() {

        Categorias catCultura = new Categorias();
        catCultura.setCategory("Cultura");
        catCultura.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categorias catDeportes = new Categorias();
        catDeportes.setCategory("Deportes");
        catDeportes.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categorias catArte = new Categorias();
        catArte.setCategory("Arte");
        catArte.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categorias catCine = new Categorias();
        catCine.setCategory("Cine");
        catCine.setDescription("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categorias catHistoria= new Categorias();
        catHistoria.setCategory("Historia");
        catHistoria.setDescription("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categorias catCiencia = new Categorias();
        catCiencia.setCategory("Ciencia");
        catCiencia.setDescription("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        Categorias[] categorias = {catCiencia, catArte, catDeportes, catHistoria, catCine, catCultura};

        return categorias;
    }

    @GetMapping("/question/{categoria}")
    public Pregunta getQuestions(@PathVariable String categoria) {

        Pregunta pregCultura = new Pregunta();
        pregCultura.setCategory("Cultura");
        pregCultura.setQuestion("¿Qué ingredintes se necesitan para hacer una michelada?");
        pregCultura.setAnswer(0);
        String[] options = {"Cerveza, lima/limón, sal, chile en polvo, salsa tipo inglesa, picante", "Cerveza, lima/limón y limon", "Cerveza, lima/limón y limon"};
        pregCultura.setOptions(options);
        pregCultura.setExplanation("La michelada, originaria de México, nacida de la creatividad y el deseo de refrescar, se convirtió en una popular bebida que cautivó a los amantes de la cerveza con su combinación única de sabores y su espíritu festivo.");


        Pregunta pregDeportes = new Pregunta();
        pregDeportes.setCategory("Deportes");
        pregDeportes.setQuestion("¿Cuál es el deporte más popular en el mundo?");
        pregDeportes.setAnswer(2);
        String[] optionsDeportes = {"Baloncesto", "Cricket", "Fútbol"};
        pregDeportes.setOptions(optionsDeportes);
        pregDeportes.setExplanation("El fútbol es ampliamente considerado como el deporte más popular en el mundo, con una gran base de seguidores y una larga historia en diferentes culturas.");

        Pregunta pregArte = new Pregunta();
        pregArte.setCategory("Arte");
        pregArte.setQuestion("¿Quién pintó La Mona Lisa?");
        pregArte.setAnswer(1);
        String[] optionsArte = {"Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh"};
        pregArte.setOptions(optionsArte);
        pregArte.setExplanation("La Mona Lisa fue pintada por Leonardo da Vinci, uno de los grandes artistas renacentistas conocido por su maestría en diversas disciplinas.");

        Pregunta pregCine = new Pregunta();
        pregCine.setCategory("Cine");
        pregCine.setQuestion("¿Cuál es la película con la mayor recaudación de la historia?");
        pregCine.setAnswer(0);
        String[] optionsCine = {"Avengers: Endgame", "Avatar", "Titanic"};
        pregCine.setOptions(optionsCine);
        pregCine.setExplanation("Actualmente, Avengers: Endgame es la película con la mayor recaudación de la historia, superando a otras producciones exitosas.");

        Pregunta pregHistoria = new Pregunta();
        pregHistoria.setCategory("Historia");
        pregHistoria.setQuestion("¿En qué año tuvo lugar la Revolución Francesa?");
        pregHistoria.setAnswer(1);
        String[] optionsHistoria = {"1776", "1789", "1812"};
        pregHistoria.setOptions(optionsHistoria);
        pregHistoria.setExplanation("La Revolución Francesa tuvo lugar en el año 1789, marcando un momento crucial en la historia de Francia y teniendo un impacto significativo en el desarrollo político y social de Europa.");

        Pregunta pregCiencia = new Pregunta();
        pregCiencia.setCategory("Ciencia");
        pregCiencia.setQuestion("¿Cuál es la ley de la física que establece que la energía no se crea ni se destruye, solo se transforma?");
        pregCiencia.setAnswer(2);
        String[] optionsCiencia = {"Ley de la gravitación universal", "Ley de Ohm", "Principio de conservación de la energía"};
        pregCiencia.setOptions(optionsCiencia);
        pregCiencia.setExplanation("El principio de conservación de la energía, también conocido como la primera ley de la termodinámica, establece que la energía total de un sistema aislado se mantiene constante a lo largo del tiempo.");

        switch (categoria) {
            case "Ciencia":
                return pregCiencia;

            case "Historia":
                return pregHistoria;

            case "Cine":
                return pregCine;

            case "Arte":
                return pregArte;

            case "Deportes":
                return pregDeportes;

            case "Cultura":
                return pregCultura;

            default:
                return pregCultura;
        }


    }
}
