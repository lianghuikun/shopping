package com.shopping.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.shopping.dao.StorageDao;
import com.shopping.service.StorageService;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----------->开始扣减库存productId={}】,count={}】", productId, count);
        storageDao.decrease(productId, count);
        log.info("----------->结束扣减库存productId={}】,count={}】", productId, count);


    }

}
