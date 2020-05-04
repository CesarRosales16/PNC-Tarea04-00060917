package com.uca.capas.tareas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ucas.capas.tareas.domain.Producto;

@Controller
public class Tarea4Controller {

	@RequestMapping("/producto")
	public ModelAndView tarea4() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("tareas/tarea4/index");
		return mav;
	}

	@RequestMapping("/resultado")
	public ModelAndView resultado(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();

		if (result.hasErrors()) {
			mav.setViewName("tareas/tarea4/index");
		} else {
			mav.addObject("nombreProducto", producto.getNombre());
			mav.setViewName("tareas/tarea4/resultado");
		}
		return mav;
	}

}
