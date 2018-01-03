/**
 * StockConnector.java
 * com.xingxunlei.connector
 *
 * Function： 股票行情数据接口
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017-8-2 		Simon
 *
 * Copyright (c) 2017, 91Bee All Rights Reserved.
 */

package com.xingxunlei.connector;

/**
 * ClassName:StockConnector
 * 
 * Function: 股票行情数据接口
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2017-8-2 下午2:13:16
 * 
 * @see
 */
public interface StockConnector {

    /**
     * 根据代码查询股票行情数据
     * @param stockCode
     * @return
     */
    public String search(String stockCode);
}
