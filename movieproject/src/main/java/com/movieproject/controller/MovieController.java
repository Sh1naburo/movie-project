package com.movieproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.movieproject.domain.Criteria;
import com.movieproject.domain.MovieVO;
import com.movieproject.domain.PageDTO;
import com.movieproject.service.MovieService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/movie/*")
@AllArgsConstructor
public class MovieController {
	
	private MovieService service;
	
	@GetMapping("/register")
	public void register() {

	}
	
	/*
	 * @PostMapping("/register") public String register(MovieVO movie,
	 * RedirectAttributes rttr) {
	 * 
	 * log.info("register: " + movie);
	 * 
	 * service.register(movie);
	 * 
	 * rttr.addFlashAttribute("result", movie.getMember_id());
	 * 
	 * return "redirect:/board/list"; }
	 */
	
	@GetMapping("/get")
	public void get(@RequestParam("movie_id") int movie_id, Model model) {

		log.info("/get");
		model.addAttribute("movie", service.get(movie_id));
	}

	
	/*
	 * @GetMapping("/list") public void list(Criteria cri, Model model) {
	 * 
	 * log.info("list: " + cri); model.addAttribute("list",
	 * MovieService.getList(cri)); // model.addAttribute("pageMaker", new
	 * PageDTO(cri, 123));
	 * 
	 * int total = service.getTotal(cri);
	 * 
	 * log.info("total: " + total);
	 * 
	 * model.addAttribute("pageMaker", new PageDTO(cri, total));
	 * 
	 * }
	 */
	
	
}
