package s02declarativetransaction1.service;

import s02declarativetransaction1.dao.IAccountDao;

/**
 * 基于TransactionProxyFactoryBean的方式
 */
public class AccountServiceImpl implements IAccountService {
    // 注入转账的DAO
    private IAccountDao accountDao;

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        // int i = 1/0;
        accountDao.inMoney(in, money);
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
