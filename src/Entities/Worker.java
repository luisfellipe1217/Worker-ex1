package Entities;

import Entities.enums.WorkerLevel;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;        
    }

    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }
    
    
    
}
