package com.expense.youtube.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.expense.youtube.model.Expense;
import com.expense.youtube.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		List<Expense> exp = new ArrayList<>();
		exp = expenseRepository.findAll();
		System.out.println("******************************************");
		System.out.println(exp);
		System.out.println("******************************************");
		return exp;
	}

	@Override
	public void save(Expense expense) {
		expense.setCreated_at(System.currentTimeMillis());
		expenseRepository.save(expense);
		
	}

}
