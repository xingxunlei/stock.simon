/**
 * StockUtils.java
 * com.xingxunlei.util
 *
 * Function： 股票行情数据工具类
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017-7-28 		Simon
 *
 * Copyright (c) 2017, 91Bee All Rights Reserved.
 */

package com.xingxunlei.util;

import com.xingxunlei.bean.Stock;
import com.xingxunlei.connector.StockConnector;
import com.xingxunlei.connector.sina.SinaConnector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

/**
 * ClassName:StockUtils
 * 
 * Function: 股票行情数据工具类
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2017-7-28 下午3:24:17
 * 
 * @see
 */
public class StockUtils {

    /**
     * batchSearch:批量查询股票行情数据
     * 
     * @param codes
     *            股票代码（用逗号“,”分割）
     * @return Map<String, Stock> (key: 股票代码 ; value:股票行情数据)
     * @since CodingExample　Ver 1.1
     */
    public static Map<String, Stock> batchSearch(String codes) {
        return batchSearch(codes, null);
    }

    /**
     * batchSearch:批量查询股票行情数据
     * 
     * @param codes
     *            股票代码（用逗号“,”分割）
     * @param connector
     *            查询股票行情数据connector
     * @return Map<String, Stock> (key: 股票代码 ; value:股票行情数据)
     * @since CodingExample　Ver 1.1
     */
    public static Map<String, Stock> batchSearch(String codes, StockConnector connector) {
        if (null == connector) {
            connector = getStockConnector();
        }

        Map<String, Stock> stockMap = new HashMap<String, Stock>();
        String result = connector.search(codes.toLowerCase());
        stockMap = handlerStocks(result);
        return stockMap;

    }

    /**
     * batchSearchList:批量查询股票行情数据
     * 
     * @param codes
     *            股票代码（用逗号“,”分割）
     * @return List<Stock>
     * @since CodingExample　Ver 1.1
     */
    public static List<Stock> batchSearchList(String codes) {
        return batchSearchList(codes, null);
    }

    /**
     * batchSearchList:批量查询股票行情数据
     * 
     * @param codes
     *            股票代码（用逗号“,”分割）
     * @param connector
     *            查询股票行情数据connector
     * @return List<Stock>
     * @since CodingExample　Ver 1.1
     */
    public static List<Stock> batchSearchList(String codes, StockConnector connector) {
        if (null == connector) {
            connector = getStockConnector();
        }

        List<Stock> stockList = new ArrayList<Stock>();
        String result = connector.search(codes.toLowerCase());
        stockList = handlerStocksList(result);
        return stockList;
    }

    /**
     * search:查询股票行情数据
     * 
     * @param code
     *            股票代码
     * @return
     * @since CodingExample　Ver 1.1
     */
    public static Stock search(String code) {
        return search(code, null);
    }

    /**
     * search:查询股票行情数据
     * 
     * @param code
     *            股票代码
     * @param connector
     *            查询股票行情数据connector
     * @return
     * @throws
     * @since CodingExample　Ver 1.1
     */
    public static Stock search(String code, StockConnector connector) {
        if (null == connector) {
            connector = getStockConnector();
        }

        Stock stock = new Stock();
        String result = connector.search(code.toLowerCase());
        stock = handlerStock(result);
        return stock;
    }

    private static StockConnector getStockConnector() {
        return new SinaConnector();
    }

    private static Map<String, Stock> handlerStocks(String result) {
        if (StringUtils.isEmpty(result)) {
            return null;
        }

        String[] resultArray = result.split(";");
        if (resultArray.length < 1) {
            return null;
        }

        Map<String, Stock> stockMap = new HashMap<String, Stock>();
        for (int i = 0; i < resultArray.length; i++) {
            Stock stock = handlerStock(resultArray[i]);
            if (null == stock)
                continue;
            if (stockMap.get(stock.getCode()) != null)
                continue;
            stockMap.put(stock.getCode(), stock);
        }
        return stockMap;
    }

    private static List<Stock> handlerStocksList(String result) {
        if (StringUtils.isEmpty(result)) {
            return null;
        }

        String[] resultArray = result.split(";");
        if (resultArray.length < 1) {
            return null;
        }

        List<Stock> stockList = new ArrayList<Stock>();
        for (int i = 0; i < resultArray.length - 1; i++) {
            Stock stock = handlerStock(resultArray[i]);
            if (null == stock)
                continue;
            if (stockList.contains(stock))
                continue;
            stockList.add(stock);
        }
        return stockList;
    }

    private static Stock handlerStock(String result) {
        result = result.trim();
        if (StringUtils.isEmpty(result)) {
            return null;
        }

        String[] resultArray = result.split(";");
        if (resultArray.length < 1) {
            return null;
        }

        String[] stockArray = resultArray[0].split("=");
        String codeResponse = stockArray[0].replace("var hq_str_", "").trim();
        Stock stock = new Stock();
        stock.setCode(codeResponse.toUpperCase());

        String stockResponse = stockArray[1].replace("\"", "");
        if (StringUtils.isEmpty(stockResponse)) {
            return stock;
        }
        String[] dataArray = stockResponse.split(",");
        stock.setName(dataArray[0]);
        stock.setJrkpj(dataArray[1]);
        stock.setZrspj(dataArray[2]);
        stock.setDqjg(dataArray[3]);
        stock.setJrzgj(dataArray[4]);
        stock.setJrzdj(dataArray[5]);
        stock.setJmrj(dataArray[6]);
        stock.setJmcj(dataArray[7]);
        stock.setCjgps(dataArray[8]);
        stock.setCjje(dataArray[9]);
        stock.setMr1gs(dataArray[10]);
        stock.setMr1bj(dataArray[11]);
        stock.setMr2gs(dataArray[12]);
        stock.setMr2bj(dataArray[13]);
        stock.setMr3gs(dataArray[14]);
        stock.setMr3bj(dataArray[15]);
        stock.setMr4gs(dataArray[16]);
        stock.setMr4bj(dataArray[17]);
        stock.setMr5gs(dataArray[18]);
        stock.setMr5bj(dataArray[19]);
        stock.setMc1gs(dataArray[20]);
        stock.setMc1bj(dataArray[21]);
        stock.setMc2gs(dataArray[22]);
        stock.setMc2bj(dataArray[23]);
        stock.setMc3gs(dataArray[24]);
        stock.setMc3bj(dataArray[25]);
        stock.setMc4gs(dataArray[26]);
        stock.setMc4bj(dataArray[27]);
        stock.setMc5gs(dataArray[28]);
        stock.setMc5bj(dataArray[29]);
        stock.setDate(dataArray[30]);
        stock.setTime(dataArray[31]);
        return stock;
    }

}
