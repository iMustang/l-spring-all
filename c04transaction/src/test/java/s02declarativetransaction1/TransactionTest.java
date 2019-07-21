package s02declarativetransaction1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s02declarativetransaction1.service.IAccountService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:s02declarativetransaction1/applicationContext.xml")
public class TransactionTest {

    /**
     * 一定要注入代理类:因为代理类进行增强的操作
     */
    // @Resource(name="accountService")
    @Resource(name = "accountServiceProxy")
    private IAccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("horse", "xmustang", 200d);
    }
}
