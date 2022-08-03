package com.github.yaaprogrammer.model;

import java.util.Objects;

/**
 * @author Yaaprogrammer
 * @description 六亲模型类
 */
public class SixRelative {

    private String name;
    private int flag;

    public SixRelative( String name, int flag ) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag( int flag ) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "SixRelative{" + "name=" + name + ", flag=" + flag + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SixRelative other = (SixRelative) obj;
        if (!Objects.equals(this.name, other.name)) {
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
        return hash;
    }
}
