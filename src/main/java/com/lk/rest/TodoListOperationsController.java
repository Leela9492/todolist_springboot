package com.lk.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lk.service.TaskService;

@Controller
public class TodoListOperationsController {
	@Autowired
	private TaskService service;
	@GetMapping("/")
	public String getTasks(Model model) {
		model.addAttribute("tasks",service.getAllTasks());
		return "Tasks";
	}
	@PostMapping("/")
	public String postTasks(@RequestParam String title) {
		service.insertTask(title);
		return "redirect:/";
	}
	
	@GetMapping("/{id}/delete")
	public String deleteTask(@PathVariable Long id) {
		service.deleteTask(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}/toggle")
	public String toggleTask(@PathVariable Long id) {
		service.toggleTask(id);
		return "redirect:/";
	}
}
