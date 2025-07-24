package org.manish07.ManyToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class emp {
    @Id
    private int eid;
    @Column(name = "employee_name")
    private String employeeName;
    
    @ManyToMany
    private List<project> projectList;
    
    public emp () {
    }
    
    public int getEid () {
        return eid;
    }
    
    public void setEid (int eid) {
        this.eid = eid;
    }
    
    public String getEmployeeName () {
        return employeeName;
    }
    
    public void setEmployeeName (String employeeName) {
        this.employeeName = employeeName;
    }
    
    public List<project> getProjectList () {
        return projectList;
    }
    
    public void setProjectList (List<project> projectList) {
        this.projectList = projectList;
    }
}
