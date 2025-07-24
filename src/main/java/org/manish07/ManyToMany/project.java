package org.manish07.ManyToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class project {
    @Id
    private int projectId;
    
    @Column(name = "project_name")
    private String projectName;
    
    @ManyToMany(mappedBy = "projectList")
    private List<emp> empList;
    
    public project () {
    }
    
    public int getProjectId () {
        return projectId;
    }
    
    public void setProjectId (int projectId) {
        this.projectId = projectId;
    }
    
    public String getProjectName () {
        return projectName;
    }
    
    public void setProjectName (String projectName) {
        this.projectName = projectName;
    }
    
    public List<emp> getEmpList () {
        return empList;
    }
    
    public void setEmpList (List<emp> empList) {
        this.empList = empList;
    }
}