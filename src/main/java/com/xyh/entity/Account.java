package com.xyh.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author xyh
 * @version 1.0
 */
@Data
public class Account {
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @Size(min = 6, max = 20, message = "密码长度为6-20位")
    private String password;
    @Email(regexp = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$",message = "请输入正确的邮箱")
    private String email;
    @Pattern(regexp = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$",message = "请输入正确的电话格式")
    private String phone;
}
