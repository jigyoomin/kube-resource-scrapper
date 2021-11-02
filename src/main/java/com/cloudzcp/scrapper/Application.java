package com.cloudzcp.scrapper;

import java.util.List;

import io.fabric8.kubernetes.api.model.apps.Deployment;

public class Application {
    public static void main(String[] args) {

//        if (isDeployment()){
        Scrapper<Deployment> scrapper = new DeployScrapper<Deployment>();
        List<Deployment> resources = scrapper.getResources();

//      }
    }
}
