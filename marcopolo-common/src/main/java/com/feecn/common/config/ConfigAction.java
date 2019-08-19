package com.feecn.common.config;

/**
 * @author pczhangyu
 * 配置接口
 */
public interface ConfigAction {

    /**
     * 加载配置
     */
    void loadConfig();

    /**
     * configBean重新加载
     */
    void reloadConfig();

    /**
     * 检查状态
     * @return Boolean
     */
    Boolean checkStatus();

    /**
     * 初始化configBean
     * @return
     */
    Boolean initConfigBean();

}
