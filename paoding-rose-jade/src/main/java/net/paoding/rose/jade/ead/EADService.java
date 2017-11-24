package net.paoding.rose.jade.ead;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaohe on 2017/11/24.
 * 因为米粉，所以小米
 * 加解密 服务
 */
public interface EADService {

    String encrypt(String source);

    String decrypt(String source);

    Map<String,String> encrypt(List<String> sources);

    Map<String,String> decrypt(List<String> sources);
}
