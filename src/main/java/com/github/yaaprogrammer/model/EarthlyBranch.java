package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author Yaaprogrammer
 * @description 地支模型类
 */
public class EarthlyBranch {
    private String name;
    private FiveElement element;
    private int flag;

    public EarthlyBranch(String name, FiveElement element, int flag) {
        this.name = name;
        this.element = element;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FiveElement getElement() {
        return element;
    }

    public void setElement(FiveElement element) {
        this.element = element;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "EarthlyBranch{" + "name=" + name + ", element=" + element + ", flag=" + flag + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EarthlyBranch other = (EarthlyBranch) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        if(!Objects.equals(this.element, other.element)) {
            return false;
        }

        if (this.flag != other.flag) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 17 * hash + this.flag;
        hash = 17 * hash + (this.element != null ? this.element.hashCode() : 0);
        return hash;
    }
}
