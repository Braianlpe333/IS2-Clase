package com.mipresupuesto.personalbudget.infrastructure.data.interfaces;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mipresupuesto.personalbudget.entity.YearEntity;

public interface YearRepository extends JpaRepository<YearEntity, UUID>{

	
}
