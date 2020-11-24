package com.expense.youtube.service;

import java.util.List;

import com.expense.youtube.model.Expense;

public interface ExpenseService {
List<Expense> findAll();
void save(Expense expemse);
}
