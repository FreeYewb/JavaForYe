package com.bo.wen.ye.initialize;

import java.util.Date;

/**
 * 
 * @ClassName: SimpleGeometricObject
 * @Description: TODO(写继承知识相关的类)
 * @author yewenbo
 * @date 2018年10月26日 下午3:16:03
 *
 */
public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // Construct a default geometric object构造一个默认的几何对象
    public SimpleGeometricObject() {
        dateCreated = new Date();
    }

    // Construct a geometric object with the specified color and filled value
    // 用指定的颜色和填充值构造一个几何对象
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Return filled. Since filled is boolean, its getter method is named isFilled
    // 返回填满。因为填充是布尔,它的getter方法被命名为isfilled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "SimpleGeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
    }

}
