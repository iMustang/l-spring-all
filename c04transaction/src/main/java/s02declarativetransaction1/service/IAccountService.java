package s02declarativetransaction1.service;

/**
 * description:转账案例的业务接口
 */
public interface IAccountService {
    void transfer(String out, String in, Double money);
}
