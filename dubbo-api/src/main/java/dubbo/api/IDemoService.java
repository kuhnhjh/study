package dubbo.api;

/**
 * Created by huangjh on 2019/1/17.
 */
public interface IDemoService {
    /**
     * 获取用户信息
     * @param name
     * @return
     */
    public User getUerInfo(String name,int age,String addr);
}
