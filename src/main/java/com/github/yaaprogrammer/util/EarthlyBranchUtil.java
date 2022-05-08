package com.github.yaaprogrammer.util;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.github.yaaprogrammer.model.EarthlyBranch;

import java.util.Objects;
import java.util.Set;

/**
 * @author Yaaprogrammer
 */
public class EarthlyBranchUtil {

    private EarthlyBranchUtil() {}

    public static boolean isHe(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return branch.getFlag() + otherBranch.getFlag() == 1 || branch.getFlag() + otherBranch.getFlag() == 13;
    }

    public static boolean isChong(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return (branch.getFlag() + 6) % 12 == otherBranch.getFlag();
    }

    public static boolean isKe(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return FiveElementUtil.isKe(branch.getElement(), otherBranch.getElement());
    }

    public static boolean isBeiKe(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return FiveElementUtil.isBeiKe(branch.getElement(), otherBranch.getElement());
    }

    public static boolean isSheng(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return FiveElementUtil.isSheng(branch.getElement(), otherBranch.getElement());
    }

    public static boolean isBeiSheng(EarthlyBranch branch, EarthlyBranch otherBranch) {
        return FiveElementUtil.isBeiSheng(branch.getElement(), otherBranch.getElement());
    }

    public static boolean isZiXing(EarthlyBranch branch) {
        return Objects.equals(branch.getName(), "亥") || Objects.equals(branch.getName(), "酉")
                || Objects.equals(branch.getName(), "辰") || Objects.equals(branch.getName(), "午");
    }

    public static boolean isZiXing(EarthlyBranch branch, EarthlyBranch otherBranch) {
        if (!Objects.equals(branch, otherBranch)) {
            return false;
        }
        return Objects.equals(branch.getName(), "亥") || Objects.equals(branch.getName(), "酉")
                || Objects.equals(branch.getName(), "辰") || Objects.equals(branch.getName(), "午");
    }
}
