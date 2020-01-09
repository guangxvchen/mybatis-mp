package com.mmp.mp.url.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author chenguangxu
 * @since 2020-01-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("short_url")
public class ShortUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 加这个注解 用于处理长整形的数据
     * 数据库id为 1202410476343410689
     * 返回页面为 1202410476343410700
     * 数据不对应
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * md5
     */
    private String md5;

    /**
     * 短连接映射
     */
    private String urlKey;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 源地址
     */
    private String urlValue;


}
