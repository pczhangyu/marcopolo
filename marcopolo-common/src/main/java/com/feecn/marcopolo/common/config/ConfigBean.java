package com.feecn.marcopolo.common.config;

/**
 * @author pczhangyu
 * 配置类
 */
public class ConfigBean implements ConfigAction,Runnable{

    private static ConfigBean config;

    static {
         config = new ConfigBean();
    }

    private Boolean isChanged;

    public ConfigBean() {

    }

    public Boolean getChanged() {
        return isChanged;
    }

    public void setChanged(Boolean changed) {
        isChanged = changed;
    }

    public ConfigBean(Boolean isChanged) {
        this.isChanged = isChanged;
    }

    public void loadConfig() {

    }

    public void reloadConfig() {

    }

    public Boolean checkStatus() {
        return null;
    }

    public Boolean initConfigBean() {
        return null;
    }

    public void run() {
        if (this.checkStatus()){
            this.reloadConfig();
        }
    }
}
