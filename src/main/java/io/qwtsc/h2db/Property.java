package io.qwtsc.h2db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qwtsc
 */
@Entity
@Table(name = "PHYSICAL_PROPERTY")
public class Property {

    @Id
    @Column(name = "cas")
    private String cas;

    @Column(name = "chinese_name")
    private String chname;

    @Column(name = "english_name")
    private String engname;

    @Column(name = "tb")
    private Double tb;

    @Column(name = "Tc")
    private Double tc;

    @Column(name = "pc")
    private Double pc;

    @Column(name = "Vc")
    private Double vc;

    @Column(name = "Zc")
    private Double zc;

    @Column(name = "w")
    Double w;

    @Column(name = "MW")
    Double mw;

    public Double getMw() {
        return mw;
    }

    public void setMw(Double mw) {
        this.mw = mw;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public Double getTb() {
        return tb;
    }

    public void setTb(Double tb) {
        this.tb = tb;
    }

    public Double getTc() {
        return tc;
    }

    public void setTc(Double tc) {
        this.tc = tc;
    }

    public Double getPc() {
        return pc;
    }

    public void setPc(Double pc) {
        this.pc = pc;
    }

    public Double getVc() {
        return vc;
    }

    public void setVc(Double vc) {
        this.vc = vc;
    }

    public Double getZc() {
        return zc;
    }

    public void setZc(Double zc) {
        this.zc = zc;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }
}
