package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author Yaaprogrammer
 */
public class Hexagram {
    private String name;
    private int shiYao;
    private int yingYao;
    private FiveElement element;
    private String palace;

    public Hexagram(String name, int shiYao, int yingYao, FiveElement element, String palace) {
        this.name = name;
        this.shiYao = shiYao;
        this.yingYao = yingYao;
        this.element = element;
        this.palace = palace;
    }

    public String getName() {
        return name;
    }

    public int getShiYao() {
        return shiYao;
    }

    public int getYingYao() {
        return yingYao;
    }

    public FiveElement getElement() {
        return element;
    }

    public String getPalace() {
        return palace;
    }

    @Override
    public String toString() {
        return "Hexagram: " + name + " " + shiYao + " " + yingYao + " " + element + " " + palace;
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
        hash = 97 * hash + Objects.hashCode(this.element);
        hash = 97 * hash + Objects.hashCode(this.palace);
        return hash;
    }
}
