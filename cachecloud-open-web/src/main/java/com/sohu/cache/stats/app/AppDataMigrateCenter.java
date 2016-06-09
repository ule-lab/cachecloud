package com.sohu.cache.stats.app;

import java.util.List;

import com.sohu.cache.constant.AppDataMigrateEnum;
import com.sohu.cache.constant.AppDataMigrateResult;
import com.sohu.cache.entity.AppDataMigrateStatus;

/**
 * 数据迁移
 * 
 * @author leifu
 * @Date 2016-6-8
 * @Time 下午2:54:33
 */
public interface AppDataMigrateCenter {
    
    /**
     * 检查配置
     * @param migrateMachineIp
     * @param sourceRedisMigrateEnum
     * @param sourceServers
     * @param targetAppId
     * @return
     */
    AppDataMigrateResult check(String migrateMachineIp, AppDataMigrateEnum sourceRedisMigrateEnum, String sourceServers, long targetAppId);
    

    /**
     * 检查配置
     * 
     * @param migrateMachineIp
     * @param sourceRedisMigrateEnum
     * @param sourceServers
     * @param targetRedisMigrateEnum
     * @param targetServers
     * @return
     */
    AppDataMigrateResult check(String migrateMachineIp, AppDataMigrateEnum sourceRedisMigrateEnum, String sourceServers,
            AppDataMigrateEnum targetRedisMigrateEnum, String targetServers);

    /**
     * 开始迁移
     * 
     * @param migrateMachineIp
     * @param sourceRedisMigrateEnum
     * @param sourceServers
     * @param targetRedisMigrateEnum
     * @param targetServers
     * @return
     */
    boolean migrate(String migrateMachineIp, AppDataMigrateEnum sourceRedisMigrateEnum, String sourceServers,
            AppDataMigrateEnum targetRedisMigrateEnum, String targetServers, long sourceAppId, long targetAppId, long userId);


    /**
     * 列表
     * @return
     */
    List<AppDataMigrateStatus> search();


    /**
     * 查看日志
     * @param id
     * @param pageSize
     * @return
     */
    String showDataMigrateLog(long id, int pageSize);
    
    /**
     * 查看配置
     * @param id
     * @return
     */
    String showDataMigrateConf(long id);
    
}