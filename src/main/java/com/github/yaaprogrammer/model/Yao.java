package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author yaaprogrammer
 * @description 卦爻模型类
 */
public class Yao {
    private int yinYang;
    private EarthlyBranch earthyBranch;
    private SixRelative sixRelative;

    public Yao(int yinYang, EarthlyBranch earthyBranch, SixRelative sixRelative) {
        this.yinYang = yinYang;
        this.earthyBranch = earthyBranch;
        this.sixRelative = sixRelative;
    }

    public Yao(int yinYang) {
        this.yinYang = yinYang;
    }

    public int getYinYang() {
        return yinYang;
    }

    public void setYinYang(int yinYang) {
        this.yinYang = yinYang;
    }

    public EarthlyBranch getEarthyBranch() {
        return earthyBranch;
    }

    public void setEarthyBranch(EarthlyBranch earthyBranch) {
        this.earthyBranch = earthyBranch;
    }

    public SixRelative getSixRelative() {
        return sixRelative;
    }

    public void setSixRelative(SixRelative sixRelative) {
        this.sixRelative = sixRelative;
    }

    @Override
    public String toString() {
        return "Yao{" +
                "yinYang=" + yinYang +
                ", earthyBranch=" + earthyBranch +
                ", sixRelative=" + sixRelative +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Yao yao)) {
            return false;
        }
        return yinYang == yao.yinYang && earthyBranch.equals(yao.earthyBranch) && sixRelative.equals(yao.sixRelative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yinYang, earthyBranch, sixRelative);
    }
}
