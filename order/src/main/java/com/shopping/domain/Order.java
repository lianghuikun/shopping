package com.shopping.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private long productId;
    private Integer count;
    private BigDecimal money;
    // 0 创建中，1 已完成
    private Integer status;
}
