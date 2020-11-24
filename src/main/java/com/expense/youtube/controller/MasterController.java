package com.expense.youtube.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expense.youtube.model.Expense;
import com.expense.youtube.service.ExpenseService;

@Controller
public class MasterController {
	
	@Autowired
	ExpenseService expenseService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "List of Expenses");
		List<Expense> expense = expenseService.findAll();
		mav.addObject("expense", expense);
		return mav;
	}
	
	@RequestMapping("/expense")
	public ModelAndView addexpense() {
		ModelAndView mav = new ModelAndView("expense");
		mav.addObject("expense", new Expense());
		return mav;
	}
	
	@RequestMapping(value="/expense", method = RequestMethod.POST)
	public String save(@ModelAttribute("expense") Expense expense) {
		expenseService.save(expense);
		return "redirect:/";
	}

}
