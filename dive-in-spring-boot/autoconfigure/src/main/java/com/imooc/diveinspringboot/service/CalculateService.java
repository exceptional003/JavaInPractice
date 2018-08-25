package com.imooc.diveinspringboot.service;


/***
 * 计算服务
 */
public interface CalculateService {
    /**
     * 从多个整数 sum 求和
     * @param values
     * @return
     */
    Integer sum(Integer... values);
}
