package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int projectId;
	private String projeName;
	@ManyToMany(mappedBy = "projects")
	private List<Employee> emps;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjeName() {
		return projeName;
	}
	public void setProjeName(String projeName) {
		this.projeName = projeName;
	}
	public List<Employee> getEmps() {
		return emps;
	}
	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

}
