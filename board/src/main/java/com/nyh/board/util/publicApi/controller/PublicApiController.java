package com.nyh.board.util.publicApi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyh.board.util.publicApi.model.ApiResult;
import com.nyh.board.util.publicApi.model.ApiWrapper;
import com.nyh.board.util.publicApi.repository.GoodStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class PublicApiController {

    @Autowired
    GoodStoreRepository goodStoreRepository;

    @RequestMapping(value = "/publicGoodStoreApi", method = RequestMethod.GET)
    public void getGoodStoreList() throws IOException {
        String apiKey = "674f6353706e61793130304771676171";
        String apiDefaultUrl = "http://openapi.seoul.go.kr:8088/" + apiKey + "/json/ListPriceModelStoreService";
        String apiFirst = "/1";
        String apiLast = "/1";
        String apiType = "/001";
        String apiUrl = apiDefaultUrl + apiFirst + apiLast + apiType;

        ObjectMapper objectMapper = new ObjectMapper();

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(apiUrl, String.class);
        System.out.println(result);

        ApiResult apiResult = objectMapper.readValue(result, ApiWrapper.class).getApiResult();

        if ("INFO-000".equals(apiResult.getResult().get("CODE"))) {
            apiLast = "/" + apiResult.getTotCount();
            apiUrl = apiDefaultUrl + apiFirst + apiLast + apiType;
            result = restTemplate.getForObject(apiUrl, String.class);
            ApiResult allApiData = objectMapper.readValue(result, ApiWrapper.class).getApiResult();

            goodStoreRepository.saveAll(allApiData.getStoreList());
            goodStoreRepository.flush();

        }
    }
}
