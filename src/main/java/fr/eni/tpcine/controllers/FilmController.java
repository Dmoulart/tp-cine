package fr.eni.tpcine.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tpcine.bo.AppUser;
import fr.eni.tpcine.bo.Avis;
import fr.eni.tpcine.bo.Film;
import fr.eni.tpcine.services.AvisServiceInterface;
import fr.eni.tpcine.services.FilmServiceInterface;
import fr.eni.tpcine.services.GenreServiceInterface;
import fr.eni.tpcine.services.PersonneServiceInterface;
import fr.eni.tpcine.services.UserServiceInterface;

@Controller

public class FilmController {

	private FilmServiceInterface filmService;
	private PersonneServiceInterface personneService;
	private GenreServiceInterface genreService;
	private AvisServiceInterface avisService;
	private UserServiceInterface userService;

	@Autowired
	private void setService(FilmServiceInterface service, PersonneServiceInterface personneService,
			GenreServiceInterface genreService, AvisServiceInterface avisService,UserServiceInterface userService) {
		this.filmService = service;
		this.personneService = personneService;
		this.genreService = genreService;
		this.avisService = avisService;
		this.userService = userService;
	}

	@GetMapping("/film/{id}")
	public String detail(@PathVariable Integer id, Model model) {

		if (id == null)
			return "redirect:/listFilms";

		var film = this.filmService.find(id);

		if (film.isEmpty())
			return "redirect:/listFilms";

		model.addAttribute("film", film.get());

		if (film.get().getAvis().size() > 0) {
			var avis = film.get().getAvis().get(0);
			System.out.println(avis.getComment());
			System.out.println(avis.getUser().getUsername());
		}

		// Franglish is killing me...
		var userAvis = new Avis();

		// Authentication authentication =
		// SecurityContextHolder.getContext().getAuthentication();

		userAvis.setFilm(film.get());

		model.addAttribute("newAvis", userAvis);

		return "pages/detail";
	}

	@GetMapping("/film/ajouter")
	public String add(Model model) {

		Film film = null;
		if (model.getAttribute("film") != null) {
			film = (Film) model.getAttribute("film");
		} else {
			film = new Film();
		}

		model.addAttribute("film", film);
		model.addAttribute("personnes", this.personneService.findAll());
		model.addAttribute("genres", this.genreService.findAll());
		return "pages/add";
	}

	@PostMapping("/film/ajouter")
	public String add(@Valid @ModelAttribute("film") Film film, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("personnes", this.personneService.findAll());
			model.addAttribute("genres", this.genreService.findAll());
			return "pages/add";
		}
		this.filmService.create(film);
		return "redirect:/";
	}

	@PostMapping("/avis/ajouter")
	public String addAvis(@Valid @ModelAttribute("avis") Avis avis, BindingResult result, Model model) {
		// Todo: find a way to map the default spring user to AppUser
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		var user = this.userService.loadCustomUserByUsername(authentication.getName());
		avis.setUser(user);
		
		if (result.hasErrors()) return "redirect:/";
		
		this.avisService.create(avis);
		
		return "redirect:/";
	}

	@GetMapping({ "/listFilms", "/", "/home" })
	public String listFilms(Model model) {

		model.addAttribute("films", filmService.findAll());

		return "pages/list-films";
	}

}
