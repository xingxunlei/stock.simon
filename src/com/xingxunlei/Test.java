/**
 * Test.java
 * com.xingxunlei
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017-8-2 		Simon
 *
 * Copyright (c) 2017, 91Bee All Rights Reserved.
 */

package com.xingxunlei;

import com.xingxunlei.connector.sina.SinaConnector;
import com.xingxunlei.util.StockUtils;

/**
 * ClassName:Test
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2017-8-2 下午2:45:37
 * 
 * @see
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(StockUtils.search("sh601006"));
        System.out.println(StockUtils.search("sh601006", new SinaConnector()));
        System.out.println(StockUtils.batchSearch("SH601006,sz300071"));
        System.out.println(StockUtils.batchSearch("SH601006,sz300071", new SinaConnector()));
    }

}
