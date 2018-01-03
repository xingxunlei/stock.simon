/**
 * SinaConnector.java
 * com.xingxunlei.connector.sina
 *
 * Function：新浪财经股票行情数据接口
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017-8-2 		Simon
 *
 * Copyright (c) 2017, 91Bee All Rights Reserved.
 */

package com.xingxunlei.connector.sina;

import com.xingxunlei.connector.StockConnector;
import com.xingxunlei.util.HttpUtils;
import java.io.UnsupportedEncodingException;
import org.apache.commons.lang.StringUtils;

/**
 * ClassName:SinaConnector
 * 
 * Function: 新浪财经股票行情数据接口实现类
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2017-8-2 下午2:30:38
 * 
 * @see
 */
public class SinaConnector implements StockConnector {

    private final static String PROXY = "http://hq.sinajs.cn";
    private final static String SEARCH_PROXY_URL = PROXY + "/list=";

    public String search(String stockCode) {
        String result = null;

        if (StringUtils.isEmpty(stockCode)) {
            return result;
        }

        byte[] b = HttpUtils.doGet(SEARCH_PROXY_URL + stockCode);
        try {
            result = new String(b, "GB2312");
        } catch (UnsupportedEncodingException e) {
            result = new String(b);
        }
        return result;
    }

}
