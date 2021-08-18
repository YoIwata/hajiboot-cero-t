package com.example.hajibootcerot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ninja.cero.sqltemplate.core.SqlTemplate;

@Component
public class PlanDao {

    @Autowired
    protected SqlTemplate sqlTemplate;

    public PlanDao(SqlTemplate sqlTemplate) {
        this.sqlTemplate = sqlTemplate;
    }
    
    public Plan getPlan() {
    	Plan plan = sqlTemplate.forObject("SQL/getPlan.sql", Plan.class);
    	return plan;
    }
	
}
