package com.ly.weixin.fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 12758 on 2016/5/19.
 */
public class FragmentFactory {

    private static Map<Integer, BaseFragment> mFragmentMap = new HashMap<>();

    public static BaseFragment createFragment(int pos) {
        BaseFragment fragment = mFragmentMap.get(pos);
        if (fragment == null) {
            switch (pos) {
                case 0:
                    fragment = new HomeFragment();
                    break;
                case 1:
                    fragment = new WeiTaoFragment();
                    break;
                case 2:
                    fragment = new FaXianFragment();
                    break;
                case 3:
                    fragment = new ShoppingFragment();
                    break;
                case 4:
                    fragment = new MeFragment();
                    break;
            }
        }
        mFragmentMap.put(pos, fragment);
        return fragment;
    }
}
