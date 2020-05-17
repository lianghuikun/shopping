package com.shopping.service.impl;

import org.springframework.stereotype.Service;
import com.shopping.dao.StorageDao;
import com.shopping.service.StorageService;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }

}
