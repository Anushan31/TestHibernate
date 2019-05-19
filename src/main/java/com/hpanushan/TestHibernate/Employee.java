package com.hpanushan.TestHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/* There are three names as
 * Table name
 * Entity name and
 * Class name 
 * 
 * we can specify any name to table by using annotations but usually class name = table name
 */

@Table (name="bowen")
@Entity
public class Employee {
	
	@Id
	private int id;
	@Transient // To avoid adding name to database table
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
