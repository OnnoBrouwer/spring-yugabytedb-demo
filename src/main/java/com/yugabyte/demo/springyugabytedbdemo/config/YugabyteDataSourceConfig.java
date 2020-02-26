package com.yugabyte.demo.springyugabytedbdemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yugabyte.ysql.YBClusterAwareDataSource;

@Configuration
public class YugabyteDataSourceConfig {
	
	@Value("${yugabyte.sql.datasource.url}")
	String jdbcUrl;

	@Bean
	public DataSource dataSource() {
		return new YBClusterAwareDataSource(jdbcUrl);
	}
}
