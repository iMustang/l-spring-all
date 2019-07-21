package s01programmatictransaction.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import s01programmatictransaction.dao.IAccountDao;

/**
 * description:转账案例的业务层实现类
 * <p>
 * 通过transactionTemplate.execute()编程
 */
public class AccountServiceImpl implements IAccountService {

    // 注入转账的DAO
    private IAccountDao accountDao;

    // 注入事务管理的模板
    private TransactionTemplate transactionTemplate;

    public void transfer(final String out, final String in,
                         final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(
                    TransactionStatus transactionStatus) {
                accountDao.outMoney(out, money);
//                int i = 1 / 0;//事务控制，即出现异常，该段内代码都执行失效
                accountDao.inMoney(in, money);
            }
        });
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(
            TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}