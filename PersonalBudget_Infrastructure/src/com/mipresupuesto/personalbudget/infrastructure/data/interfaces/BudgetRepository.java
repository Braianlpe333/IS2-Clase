package com.mipresupuesto.personalbudget.infrastructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mipresupuesto.personalbudget.entity.BudgetEntity;

public interface BudgetRepository extends JpaRepository<BudgetEntity, UUID>{

}
