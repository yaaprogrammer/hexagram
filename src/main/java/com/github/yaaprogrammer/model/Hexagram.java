package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author Yaaprogrammer
 * @description 六重卦模型类
 */
public class Hexagram {
    private String name;
    private int shiYao;
    private int yingYao;
    private boolean hasFuShen;
    private boolean hasBianGua;
    private FiveElement element;
    private String palace;

    public Hexagram(String name, int shiYao, int yingYao, boolean hasFuShen, boolean hasBianGua, FiveElement element, String palace) {
        this.name = name;
        this.shiYao = shiYao;
        this.yingYao = yingYao;
        this.element = element;
        this.palace = palace;
        this.hasFuShen = hasFuShen;
        this.hasBianGua = hasBianGua;
    }

    public Hexagram() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShiYao() {
        return shiYao;
    }

    public void setShiYao(int shiYao) {
        this.shiYao = shiYao;
    }

    public int getYingYao() {
        return yingYao;
    }

    public void setYingYao(int yingYao) {
        this.yingYao = yingYao;
    }

    public FiveElement getElement() {
        return element;
    }

    public void setElement(FiveElement element) {
        this.element = element;
    }

    public String getPalace() {
        return palace;
    }

    public void setPalace(String palace) {
        this.palace = palace;
    }

    public boolean getHasFuShen() {
        return hasFuShen;
    }

    public void setHasFuShen(boolean hasFuShen) {
        this.hasFuShen = hasFuShen;
    }

    public boolean getHasBianGua() {
        return hasBianGua;
    }

    public void setHasBianGua(boolean hasBianGua) {
        this.hasBianGua = hasBianGua;
    }

    @Override
    public String toString() {
        return "Hexagram{" + "name=" + name + ", shiYao=" + shiYao + ", yingYao=" + yingYao + ", hasFuShen="+ hasFuShen + ", hasBianGua="+ hasBianGua + ", element=" + element + ", palace=" + palace;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hexagram other = (Hexagram) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.shiYao != other.shiYao) {
            return false;
        }
        if (this.yingYao != other.yingYao) {
            return false;
        }
        if (this.hasBianGua != other.hasBianGua) {
            return false;
        }
        if (this.hasFuShen != other.hasFuShen) {
            return false;
        }
        if (!Objects.equals(this.element, other.element)) {
            return false;
        }
        if (!Objects.equals(this.palace, other.palace)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.shiYao;
        hash = 97 * hash + this.yingYao;
        hash = 97 * hash + (this.hasFuShen? 1231 : 1237);
        hash = 97 * hash + (this.hasBianGua? 1231 : 1237);
        hash = 97 * hash + Objects.hashCode(this.element);
        hash = 97 * hash + Objects.hashCode(this.palace);
        return hash;
    }
}
