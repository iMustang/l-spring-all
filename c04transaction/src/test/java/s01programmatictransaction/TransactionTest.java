package s01programmatictransaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s01programmatictransaction.service.IAccountService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:s01programmatictransaction/applicationContext.xml")
public class TransactionTest {
    @Resource(name = "accountService")
    private IAccountService accountService;

    @Test
    public void testTransfer() {
        accountService.transfer("horse", "xmustang", 200d);
    }
}
