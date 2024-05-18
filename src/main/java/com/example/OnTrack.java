package com.example;

import java.util.ArrayList;

public class OnTrack {
   
    ArrayList<String> projectList = new ArrayList<>();


    public void createProject(String projectName){
        projectList.add(projectName);
    }

    public boolean findProject(String projectName){
        return projectList.contains(projectName);
    }
}
