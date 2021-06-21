package com.linstudy.ttsx.controller;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import net.sf.jsqlparser.schema.Table;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //逆向生成

        AutoGenerator autoGenerator = new AutoGenerator();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        //MySQL    // 数据库连接
        dataSourceConfig.setDbType(DbType.MYSQL);
        // 8.0
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        //设置时区
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/ttsx?serverTimezone=GMT%2B8");
        autoGenerator.setDataSource(dataSourceConfig);

        //mybatis 全局
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOpen(true);
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("lin.twilight");
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);

        //包名
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.linstudy.ttsx");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("Mapper");
        packageConfig.setController("controller");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        autoGenerator.setPackageInfo(packageConfig);

        //
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);

        List<TableFill> list = new ArrayList<>();
        TableFill tableFill1 = new TableFill("create_time", FieldFill.INSERT);
        TableFill tableFill2 = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        list.add(tableFill1);
        list.add(tableFill2);

        strategyConfig.setTableFillList(list);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}
