package com.github.yaaprogrammer.util;

import com.github.yaaprogrammer.model.FiveElement;

/**
 * @author Yaaprogrammer
 */
public class FiveElementUtil {

    private FiveElementUtil() {}

    public static boolean isBiHe(FiveElement element, FiveElement otherElement) {
        return element.getFlag() == otherElement.getFlag();
    }

    public static boolean isKe(FiveElement element, FiveElement otherElement) {
        int difference = element.getFlag() - otherElement.getFlag();
        if (difference > 0) {
            return element.getFlag() - otherElement.getFlag() == 3;
        } else {
            return element.getFlag() - otherElement.getFlag() == -2;
        }
    }

    public static boolean isSheng(FiveElement element, FiveElement otherElement) {
        int difference = element.getFlag() - otherElement.getFlag();
        if (difference > 0) {
            return element.getFlag() - otherElement.getFlag() == 4;
        }
        else{
            return element.getFlag() - otherElement.getFlag() == -1;
        }
    }

    public static  boolean isBeiKe(FiveElement element, FiveElement otherElement) {
        int difference = element.getFlag() - otherElement.getFlag();
        if (difference > 0) {
            return element.getFlag() - otherElement.getFlag() == 2;
        }
        else{
            return element.getFlag() - otherElement.getFlag() == -3;
        }
    }

    public static  boolean isBeiSheng(FiveElement element, FiveElement otherElement) {
        int difference = element.getFlag() - otherElement.getFlag();
        if (difference > 0) {
            return element.getFlag() - otherElement.getFlag() == 1;
        }
        else{
            return element.getFlag() - otherElement.getFlag() == -4;
        }
    }
}
