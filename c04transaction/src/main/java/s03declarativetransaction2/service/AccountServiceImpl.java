package s03declarativetransaction2.service;

import s03declarativetransaction2.dao.IAccountDao;

/**
 * 基于XML配置声明的方式
 * 基于tx/aop
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