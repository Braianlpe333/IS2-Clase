package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID;

public class YearEntity {
	
	private UUID id;
	private int year;
	
	public YearEntity() {
		setId(UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public static final YearEntity create() {
		return new YearEntity();
	}
	
	public YearEntity(final UUID id, final int year) {
		setId(id);
		setYear(year);
	}
	
	public final UUID getId() {
		if(id == null) {
			setId(UtilUUID.DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}
	
	public final int getYear() {
		return year;
	}
	
	public final void setYear(final int year) {
		this.year = year;
	}
	
}
