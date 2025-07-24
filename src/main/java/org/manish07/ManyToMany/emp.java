package org.manish07.ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class emp {
    @Id
    private int eid;
    @Column(name = "employee_name")
    private String employeeName;
    
    @ManyToMany
    @JoinTable(name = "project_assign",joinColumns = {@JoinColumn(name = "emp_id")} ,
            inverseJoinColumns = {@JoinColumn(name = "project_id")})
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
