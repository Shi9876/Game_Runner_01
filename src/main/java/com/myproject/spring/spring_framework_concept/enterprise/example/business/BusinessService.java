package com.myproject.spring.spring_framework_concept.enterprise.example.business;
import com.myproject.spring.spring_framework_concept.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{

    @Autowired
    public BusinessService(DataService dataService) {
        super();
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

    private final DataService dataService;

    //1. setter Injection
    /*@Autowired
    public void setDataService(DataService dataService){
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
    */

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();      //sum of values in a list using functional programming
    }
}
