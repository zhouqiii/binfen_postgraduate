package com.hcen.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Ret 用于返回值封装
 * <p>
 * 一、应用场景：
 * 1：
 * return Ret.ok();
 * return Ret.ok().toJsonStr();
 * 响应 json 数据给客户端
 * <p>
 * 二、举例说明
 * 1：服务端
 * 查询成功时：
 * List resultList = new ArrayList();
 * return Ret.ok(resultList);
 * 或
 * List resultList = new ArrayList();
 * return Ret.ok(resultList, "查询成功！");
 * ...
 * <p>
 * 2：javascript 客户端 ajax 回调函数通常这样用：
 * success: function(Ret) {
 * if(ret.status == 0) {//操作成功
 * ...
 * }else{//操作失败
 * if (ret.status == 1001) {//操作失败，通常如果项目对错误状态码没特别定义的话失败时state都为1
 * //，即不为0都为失败，但
 * //如果对错误状态码特别定义了的话，就根据实际情况分辨失败类型
 * ...
 * }
 * }
 *
 * @author mayunju
 * @date 2017年10月10日 下午5:15:15
 */
@SuppressWarnings({"serial", "rawtypes", "unchecked"})
public class Ret extends HashMap {

    private static final String DATA = "data";
    private static final String EXCEPTION = "exception";

    /**
     * 返回的状态码为0标识正常，如果不为0都为异常，具体状态码是多少根据项目不同来确定
     * 泛义上的异常用1来标识，本类是这么实现的
     * 如果用户对状态码没太多需求的话，不用关注即可，默认正常返回1，失败返回0
     */
    private static final String STATUS = "status";

    private static final int STATUS_OK = 1;
    private static final int STATUS_FAIL = 0;
    private static final int STATUS_ERROR = -1;

    private static final int LOGIN_FAIL = 10;
    private static final int KAPTCHA_FAIL = 11;


    public static final String MSG = "msg";
    public static final String ERROR = "error";

    public static final String MSG_OK = "request success";
    public static final String MSG_FAIL = "request fail";

    public Ret() {
    }

    public static Ret ok() {
        return new Ret().set(STATUS, STATUS_OK).set(MSG, MSG_OK).set(DATA, null);
    }

    public static Ret ok(Object data) {
        return new Ret().set(STATUS, STATUS_OK).set(MSG, MSG_OK).set(DATA, data);
    }

    public static Ret ok(Object data, String msg) {
        return new Ret().set(STATUS, STATUS_OK).set(MSG, msg).set(DATA, data);
    }

    public static Ret ok(String msg) {
        return new Ret().set(STATUS, STATUS_OK).set(MSG, msg).set(DATA, null);
    }


    public static Ret fail() {
        return new Ret().set(STATUS, STATUS_FAIL).set(MSG, MSG_FAIL);
    }

    public static Ret fail(String msg) {
        return new Ret().set(STATUS, STATUS_FAIL).set(MSG, msg);
    }

    public static Ret fail(int status, String msg) {
        return new Ret().set(STATUS, status).set(MSG, msg);
    }

    public static Ret loginFail(String msg) {
        return new Ret().set(STATUS, LOGIN_FAIL).set(MSG, msg);
    }

    public static Ret kaptchaFail(String msg) {
        return new Ret().set(STATUS, KAPTCHA_FAIL).set(MSG, msg);
    }

    public static Ret error(String msg) {
        return new Ret().set(STATUS, STATUS_ERROR).set(MSG, MSG_FAIL).set(ERROR, msg);
    }

    public static Ret error(String msg, Throwable e) {
        return new Ret().set(STATUS, STATUS_ERROR).set(MSG, MSG_FAIL).set(ERROR, msg).set(EXCEPTION, e);
    }

    public static Ret error(String msg, String e) {
        return new Ret().set(STATUS, STATUS_ERROR).set(MSG, MSG_FAIL).set(ERROR, msg).set(EXCEPTION, e);
    }

    public static Ret page(IPage iPage) {
        Map result = new HashMap(2);
        result.put("rows", iPage.getRecords());
        result.put("total", iPage.getTotal());
        return ok(result);
    }

    public boolean isOk() {
        Object status = get(STATUS);
        if (Integer.valueOf(STATUS_OK).toString().equals(status.toString())) {
            return true;
        }
        if (Integer.valueOf(STATUS_FAIL).toString().equals(status.toString())) {
            return false;
        }
        throw new IllegalStateException("调用 isOk() 之前，必须先调用 ok()、fail() 方法");
    }

    public boolean isFail() {
        Object status = get(STATUS);
        if (Integer.valueOf(STATUS_FAIL).toString().equals(status.toString())) {
            return true;
        }
        if (Integer.valueOf(STATUS_OK).toString().equals(status.toString())) {
            return false;
        }
        throw new IllegalStateException("调用 isFail() 之前，必须先调用 ok()、fail() 方法");
    }

    /**
     * 方便链式调用map的put方法
     */
    public Ret set(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
