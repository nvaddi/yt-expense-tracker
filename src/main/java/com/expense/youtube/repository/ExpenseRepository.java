package com.expense.youtube.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expense.youtube.model.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	@Override
	List<Expense> findAll();
}
