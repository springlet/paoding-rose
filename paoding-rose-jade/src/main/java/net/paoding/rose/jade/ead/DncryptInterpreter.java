package net.paoding.rose.jade.ead;

import net.paoding.rose.jade.statement.AfterInvocationCallback;
import net.paoding.rose.jade.statement.StatementRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhaohe@xiaomi.com on 2017/11/24.
 * 因为米粉，所以小米
 * 数据加密
 * 在执行SQL之后 ，对数据 进行解密
 * 需要解密的数据，使用 {@link net.paoding.rose.jade.annotation.EAD} 标识
 */
public class DncryptInterpreter implements AfterInvocationCallback {
    private EADService eadService;

    public DncryptInterpreter(EADService eadService) {
        this.eadService = eadService;
    }

    @Override
    public Object execute(StatementRuntime runtime, Object returnValue) {


        return null;
    }
}
