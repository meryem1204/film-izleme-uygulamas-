package com.example.filmservices.controller;

import com.example.filmservices.model.Film;
import com.example.filmservices.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/films")
public class Film_Controller {

    @Autowired
    private FilmService filmService;

    @GetMapping("/findall")
    public List<Film> getAllFilms() {

        return filmService.getAllFilms();
    }

    @GetMapping("/get/{id}")
    public Film getFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }

    @PostMapping("/save")
    public Film createFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFilm(@PathVariable Long id) {

        filmService.deleteFilm(id);
    }
}

