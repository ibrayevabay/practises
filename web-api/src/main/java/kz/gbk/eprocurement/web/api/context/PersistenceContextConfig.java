package kz.gbk.eprocurement.web.api.context;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "kz.gbk.eprocurement.purchase.repository")
@EntityScan("kz.gbk.eprocurement.purchase.model")
@Import({ DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class PersistenceContextConfig {
}