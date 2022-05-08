package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author Yaaprogrammer
 */
public class Trigram {
    private String name;
    private FiveElement element;
    private int flag;

    public Trigram(String name, FiveElement element, int flag) {
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
        return "Trigram{" + "name=" + name + ", element=" + element + ", flag=" + flag + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trigram other = (Trigram) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.element, other.element)) {
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
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.element);
        hash = 97 * hash + this.flag;
        return hash;
    }
}
