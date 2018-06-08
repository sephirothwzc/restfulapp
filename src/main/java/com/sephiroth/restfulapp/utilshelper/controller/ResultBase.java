package com.sephiroth.restfulapp.utilshelper.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author: 吴占超
 * @Description:
 * @Date: Create in 13:44 2018/6/8
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBase {

    private ResultState state = ResultState.SUCCESS;

    private Object data;

    private String message;

    public ResultBase(Object data) {
        this.data = data;
    }

}

/**
 * 返回值状态
 */
enum ResultState {
    SUCCESS("Success",1),FAIL("Fail",0),ERROR("Error",-1);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    private Integer index;

    private ResultState(String name,Integer index) {
        this.name = name;
        this.index = index;
    }

    /**
     * 根据下标获取名称
     * @param index
     * @return
     */
    public static String getName(Integer index) {
        return Arrays.stream(ResultState.values()).filter(p-> index.equals(p.getIndex())).findFirst().get().getName();
    }

}
