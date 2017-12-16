package com.nyh.seoulgodstore.store.model;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@SpringBootTest
public class StoreTypeTest {

    @Test
    public void getStoreTypeTest() {
        List<Map> stArr = StoreType.toArrayList();

        assertEquals(StoreType.ALL.getCode(), stArr.get(0).get("value"));
    }
}