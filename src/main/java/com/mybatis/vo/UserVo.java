package com.mybatis.vo;

import com.mybatis.po.spread.UserCustom;

import java.util.List;

/**
 * <p></p>
 *
 * @author Andy
 * @date 2017/7/28
 */
public class UserVo {

    private UserCustom userCustom;

    private List<Integer> ids;

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
