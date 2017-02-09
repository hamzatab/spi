package fr.univbrest.dosi.spi;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDataSourceConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "fr.univbrest.dosi.spi.dao")
@EntityScan(basePackages = "fr.univbrest.dosi.spi.entites")
@Import({ EmbeddedDataSourceConfiguration.class, HibernateJpaAutoConfiguration.class })
public class AppTestConfig {

}
