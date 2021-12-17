//package com.macro.mall.tiny.modules.demo.search;
//
//import com.ejlchina.searcher.SqlExecutor;
//import com.ejlchina.searcher.implement.DefaultSqlExecutor;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SearchBeanConfig {
//    // 默认数据源配置信息
//    @Bean(name = "primaryDsProps")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSourceProperties primaryDsProps() {
//        return new DataSourceProperties();
//    }
//
//    // 默认数据源
//    @Bean @Primary
//    public DataSource primaryDs(@Qualifier("primaryDsProps") DataSourceProperties dataSourceProperties) {
//        return dataSourceProperties.initializeDataSourceBuilder().build();
//    }
//
//    @Bean
//    public SqlExecutor sqlExecutor(DataSource dataSource) {
//        DefaultSqlExecutor executor = new DefaultSqlExecutor(dataSource);   // 默认数据源
//        return executor;
//    }
//}
