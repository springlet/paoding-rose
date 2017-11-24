package net.paoding.rose.jade.annotation;

import java.lang.annotation.*;

/**
 * 用{@link EAD} 注解标注DAO方法的参数，指定参数是否需要加密,
 * 注解标注到DAO 方法上，指定参数是否需要 解密
 * 标注在 Object 上的字段，指定是否需要加密|解密。
 * <p>
 *
 * <span style='margin-left:50px;'>
 * <code>@SQL("SELECT id, account, name FROM user WHERE id=:userId")<span>
 * <br>
 * <span style='margin-left:50px;'> public User getUser(@SQLParam @EAD("userId") String id);</code><span>
 * <p>
 *
 * @author 肖昭河 [xiaozhaohe@xioami.com]
 */
@Target( { ElementType.PARAMETER , ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EAD {
    /**
     * 指出当前参数或者字段是否需要解密，默认是 自动解密
     */
    boolean decrypt() default true;
}
