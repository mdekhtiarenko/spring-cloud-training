package com.mdekhtiarenko.sentenceservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/sentence")
    public String getSentence() {
        return
                getWord("SUBJECT-SERVICE") + " "
                        + getWord("VERB-SERVICE") + " "
                        + getWord("article-service") + " "
                        + getWord("adjective-service                                                                    ") + " "
                        + getWord("noun-service") + "."
                ;
    }

    public String getWord(String service) {
        List<ServiceInstance> list = discoveryClient.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
