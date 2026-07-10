package com.cognizant.orm_learn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="country")
public class Country {
	


	    @Id
	    @Column(name="code")
	    private String code;

	    @Column(name="name")
	    private String name;

	    // Getters
	    public String getCode() {
	        return code;
	    }

	    public String getName() {
	        return name;
	    }

	    // Setters
	    public void setCode(String code) {
	        this.code = code;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // toString method for easy logging
	    @Override
	    public String toString() {
	        return "Country [code=" + code + ", name=" + name + "]";
	    }
	}
}
