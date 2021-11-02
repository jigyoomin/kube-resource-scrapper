package com.cloudzcp.scrapper;

import java.util.List;

import io.fabric8.kubernetes.api.model.HasMetadata;

public class DeployScrapper<Deployment> implements Scrapper {


    @Override
    public List<Deployment> getResources(String namespace) {
        return null;
    }

    @Override
    public List<Deployment> getResources() {
        return null;
    }
}
