package com.votesapp.votesapp.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${votes-api.url}", name = "candidatoClient")
public interface CandidatoClient {

}
