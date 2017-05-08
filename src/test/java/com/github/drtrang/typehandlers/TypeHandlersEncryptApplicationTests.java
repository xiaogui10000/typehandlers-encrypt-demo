package com.github.drtrang.typehandlers;

import com.github.drtrang.typehandlers.domain.BaseCode;
import com.github.drtrang.typehandlers.mapper.BaseCodeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TypeHandlersEncryptApplication.class)
@Slf4j
public class TypeHandlersEncryptApplicationTests {

    @Autowired
    private BaseCodeMapper mapper;

    @Test
    public void all() {
        List<BaseCode> baseCodes = mapper.selectByExample(null);
        baseCodes.stream().map(BaseCode::getCodeValue).forEach(log::info);
    }

    @Test
    public void once() {
        long start = System.currentTimeMillis();
        List<BaseCode> baseCodes = mapper.selectByExample(null);
        log.info("size: {}", baseCodes.size());
        long end = System.currentTimeMillis();
        log.info("time: {}", end - start);
    }

    @Test
    public void ten_times() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            List<BaseCode> baseCodes = mapper.selectByExample(null);
            log.info("times:{}, size: {}", i, baseCodes.size());
        }
        long end = System.currentTimeMillis();
        log.info("time: {}", end - start);
    }

    @Test
    public void hundred_times() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            List<BaseCode> baseCodes = mapper.selectByExample(null);
            log.info("times:{}, size: {}", i, baseCodes.size());
        }
        long end = System.currentTimeMillis();
        log.info("time: {}", end - start);
    }

}