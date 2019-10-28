package com.wenhao.blog.domain;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Bill {

    private String name;

    private BigDecimal amount;
}
