/**
 * Stock.java
 * com.xingxunlei.bean
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017-7-28 		Simon
 *
 * Copyright (c) 2017, 91Bee All Rights Reserved.
 */

package com.xingxunlei.bean;

import org.apache.commons.lang.StringUtils;

/**
 * ClassName:Stock
 * 
 * @author Simon
 * @version
 * @since Ver 1.1
 * @Date 2017-7-28 下午3:26:47
 * 
 * @see
 */
public class Stock {

    /**
     * 股票代码
     */
    private String code;
    /**
     * 股票名称
     */
    private String name;

    /**
     * 今日开盘价
     */
    private String jrkpj;
    /**
     * 昨日收盘价
     */
    private String zrspj;
    /**
     * 当前价格
     */
    private String dqjg;
    /**
     * 今日最高价
     */
    private String jrzgj;
    /**
     * 今日最低价
     */
    private String jrzdj;

    /**
     * 竞买价
     */
    private String jmrj;
    /**
     * 竞卖价
     */
    private String jmcj;
    /**
     * 成交股票数（由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百）
     */
    private String cjgps;
    /**
     * 成交金额（单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万）
     */
    private String cjje;

    /**
     * “买一”申请股数
     */
    private String mr1gs;
    /**
     * “买一”报价
     */
    private String mr1bj;
    /**
     * “买二”申请股数
     */
    private String mr2gs;
    /**
     * “买二”报价
     */
    private String mr2bj;
    /**
     * “买三”申请股数
     */
    private String mr3gs;
    /**
     * “买三”报价
     */
    private String mr3bj;
    /**
     * “买四”申请股数
     */
    private String mr4gs;
    /**
     * “买四”报价
     */
    private String mr4bj;
    /**
     * “买五”申请股数
     */
    private String mr5gs;
    /**
     * “买五”报价
     */
    private String mr5bj;

    /**
     * “卖一”申请股数
     */
    private String mc1gs;
    /**
     * “卖一”报价
     */
    private String mc1bj;
    /**
     * “卖二”申请股数
     */
    private String mc2gs;
    /**
     * “卖二”报价
     */
    private String mc2bj;
    /**
     * “卖三”申请股数
     */
    private String mc3gs;
    /**
     * “卖三”报价
     */
    private String mc3bj;
    /**
     * “卖四”申请股数
     */
    private String mc4gs;
    /**
     * “卖四”报价
     */
    private String mc4bj;
    /**
     * “卖五”申请股数
     */
    private String mc5gs;
    /**
     * “卖五”报价
     */
    private String mc5bj;

    /**
     * 日期
     */
    private String date;
    /**
     * 时间
     */
    private String time;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJrkpj() {
        return jrkpj;
    }

    public void setJrkpj(String jrkpj) {
        this.jrkpj = jrkpj;
    }

    public String getZrspj() {
        return zrspj;
    }

    public void setZrspj(String zrspj) {
        this.zrspj = zrspj;
    }

    public String getDqjg() {
        return dqjg;
    }

    public void setDqjg(String dqjg) {
        this.dqjg = dqjg;
    }

    public String getJrzgj() {
        return jrzgj;
    }

    public void setJrzgj(String jrzgj) {
        this.jrzgj = jrzgj;
    }

    public String getJrzdj() {
        return jrzdj;
    }

    public void setJrzdj(String jrzdj) {
        this.jrzdj = jrzdj;
    }

    public String getJmrj() {
        return jmrj;
    }

    public void setJmrj(String jmrj) {
        this.jmrj = jmrj;
    }

    public String getJmcj() {
        return jmcj;
    }

    public void setJmcj(String jmcj) {
        this.jmcj = jmcj;
    }

    public String getCjgps() {
        return cjgps;
    }

    public void setCjgps(String cjgps) {
        this.cjgps = cjgps;
    }

    public String getCjje() {
        return cjje;
    }

    public void setCjje(String cjje) {
        this.cjje = cjje;
    }

    public String getMr1gs() {
        return mr1gs;
    }

    public void setMr1gs(String mr1gs) {
        this.mr1gs = mr1gs;
    }

    public String getMr1bj() {
        return mr1bj;
    }

    public void setMr1bj(String mr1bj) {
        this.mr1bj = mr1bj;
    }

    public String getMr2gs() {
        return mr2gs;
    }

    public void setMr2gs(String mr2gs) {
        this.mr2gs = mr2gs;
    }

    public String getMr2bj() {
        return mr2bj;
    }

    public void setMr2bj(String mr2bj) {
        this.mr2bj = mr2bj;
    }

    public String getMr3gs() {
        return mr3gs;
    }

    public void setMr3gs(String mr3gs) {
        this.mr3gs = mr3gs;
    }

    public String getMr3bj() {
        return mr3bj;
    }

    public void setMr3bj(String mr3bj) {
        this.mr3bj = mr3bj;
    }

    public String getMr4gs() {
        return mr4gs;
    }

    public void setMr4gs(String mr4gs) {
        this.mr4gs = mr4gs;
    }

    public String getMr4bj() {
        return mr4bj;
    }

    public void setMr4bj(String mr4bj) {
        this.mr4bj = mr4bj;
    }

    public String getMr5gs() {
        return mr5gs;
    }

    public void setMr5gs(String mr5gs) {
        this.mr5gs = mr5gs;
    }

    public String getMr5bj() {
        return mr5bj;
    }

    public void setMr5bj(String mr5bj) {
        this.mr5bj = mr5bj;
    }

    public String getMc1gs() {
        return mc1gs;
    }

    public void setMc1gs(String mc1gs) {
        this.mc1gs = mc1gs;
    }

    public String getMc1bj() {
        return mc1bj;
    }

    public void setMc1bj(String mc1bj) {
        this.mc1bj = mc1bj;
    }

    public String getMc2gs() {
        return mc2gs;
    }

    public void setMc2gs(String mc2gs) {
        this.mc2gs = mc2gs;
    }

    public String getMc2bj() {
        return mc2bj;
    }

    public void setMc2bj(String mc2bj) {
        this.mc2bj = mc2bj;
    }

    public String getMc3gs() {
        return mc3gs;
    }

    public void setMc3gs(String mc3gs) {
        this.mc3gs = mc3gs;
    }

    public String getMc3bj() {
        return mc3bj;
    }

    public void setMc3bj(String mc3bj) {
        this.mc3bj = mc3bj;
    }

    public String getMc4gs() {
        return mc4gs;
    }

    public void setMc4gs(String mc4gs) {
        this.mc4gs = mc4gs;
    }

    public String getMc4bj() {
        return mc4bj;
    }

    public void setMc4bj(String mc4bj) {
        this.mc4bj = mc4bj;
    }

    public String getMc5gs() {
        return mc5gs;
    }

    public void setMc5gs(String mc5gs) {
        this.mc5gs = mc5gs;
    }

    public String getMc5bj() {
        return mc5bj;
    }

    public void setMc5bj(String mc5bj) {
        this.mc5bj = mc5bj;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Stock [code=" + code + ", name=" + name + ", jrkpj=" + jrkpj + ", zrspj=" + zrspj + ", dqjg=" + dqjg + ", jrzgj=" + jrzgj + ", jrzdj=" + jrzdj
                + ", jmrj=" + jmrj + ", jmcj=" + jmcj + ", cjgps=" + cjgps + ", cjje=" + cjje + ", mr1gs=" + mr1gs + ", mr1bj=" + mr1bj + ", mr2gs=" + mr2gs
                + ", mr2bj=" + mr2bj + ", mr3gs=" + mr3gs + ", mr3bj=" + mr3bj + ", mr4gs=" + mr4gs + ", mr4bj=" + mr4bj + ", mr5gs=" + mr5gs + ", mr5bj="
                + mr5bj + ", mc1gs=" + mc1gs + ", mc1bj=" + mc1bj + ", mc2gs=" + mc2gs + ", mc2bj=" + mc2bj + ", mc3gs=" + mc3gs + ", mc3bj=" + mc3bj
                + ", mc4gs=" + mc4gs + ", mc4bj=" + mc4bj + ", mc5gs=" + mc5gs + ", mc5bj=" + mc5bj + ", date=" + date + ", time=" + time + "]";
    }

    public boolean isEmpty() {
        if (StringUtils.isEmpty(getCode())) {
            return true;
        }
        
        if (StringUtils.isEmpty(getName())) {
            return true;
        }
        
        if (StringUtils.isEmpty(getZrspj())) {
            return true;
        }
        
        return false;
    }

}
