package com.cloudzcp.scrapper;

import java.util.List;

import io.fabric8.kubernetes.api.model.HasMetadata;

public interface Scrapper<T extends HasMetadata> {

    /**
     * 특정 namespace 의 resource 조회
     *
     * @param namespace
     * @return
     */
    public List<T> getResources(String namespace);

    /**
     * 모든 namespace의 resource 조회
     *
     * @return
     */
    public List<T> getResources();

}
