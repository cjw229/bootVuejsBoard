package com.nyh.seoulgodstore.publicApi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nyh.seoulgodstore.publicApi.wrapper.ApiResult;
import com.nyh.seoulgodstore.publicApi.wrapper.ApiType;
import com.nyh.seoulgodstore.publicApi.wrapper.ApiWrapper;
import com.nyh.seoulgodstore.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
public class PublicApiController {

    @Autowired
    StoreRepository storeRepository;

    @RequestMapping(value = "/publicGoodStoreApi", method = RequestMethod.GET)
    public void getGoodStoreList() throws IOException {
        String apiKey = "674f6353706e61793130304771676171";
        String apiDefaultUrl = "http://openapi.seoul.go.kr:8088/" + apiKey + "/json/ListPriceModelStoreService";

        ApiType[] apiTypes = ApiType.values();
        int apiCount = ApiType.values().length;

        for (int i = 0; i < apiCount; i++) {

            String apiFirst = "/1";
            String apiLast = "/1";
            String apiType = "/" + apiTypes[i].getCode();
            String apiUrl = apiDefaultUrl + apiFirst + apiLast + apiType;

            ObjectMapper objectMapper = new ObjectMapper();

            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(apiUrl, String.class);

            if (result.contains("INFO-000")) {

                ApiResult apiResult = objectMapper.readValue(result, ApiWrapper.class).getApiResult();

                apiLast = "/" + apiResult.getTotCount();
                apiUrl = apiDefaultUrl + apiFirst + apiLast;
                result = restTemplate.getForObject(apiUrl, String.class);
                ApiResult allApiData = objectMapper.readValue(result, ApiWrapper.class).getApiResult();

                storeRepository.saveAll(allApiData.getStoreList());
            }
        }

    }
}
