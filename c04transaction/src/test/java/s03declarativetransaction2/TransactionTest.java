package s03declarativetransaction2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s03declarativetransaction2.service.IAccountService;

import javax.annotation.Resource;

/**
 * @Description:Spring的声明式事务管理的方式二：基于AspectJ的XML方式的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:s03declarativetransaction2/applicationContext.xml")
public class TransactionTest {

    /**
     * 一定要注入代理类:因为代理类进行增强的操作
     */
    @Resource(name = "accountService")
    private IAccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("horse", "xmustang", 200d);
    }
}
