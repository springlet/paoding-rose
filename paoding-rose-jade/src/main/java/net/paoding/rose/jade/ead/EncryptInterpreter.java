package net.paoding.rose.jade.ead;

import net.paoding.rose.jade.statement.Interpreter;
import net.paoding.rose.jade.statement.StatementMetaData;
import net.paoding.rose.jade.statement.StatementRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by xiaozhaohe@xiaomi.com on 2017/11/24.
 * 因为米粉，所以小米
 * 数据加密
 * 在执行SQL之前 ，对数据 进行加密
 * 需要加密的数据，使用 {@link net.paoding.rose.jade.annotation.EAD} 标识
 */
@Order(99999)
@Service
public class EncryptInterpreter implements Interpreter {

    @Autowired
    private EADService eadService;

    public EncryptInterpreter() {

    }

    @Override
    public void interpret(StatementRuntime runtime) {
        StatementMetaData metaData = runtime.getMetaData();


    }
}
