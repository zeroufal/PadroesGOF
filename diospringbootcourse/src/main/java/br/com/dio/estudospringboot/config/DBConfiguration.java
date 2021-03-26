package br.com.dio.estudospringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    private String appMensagem;
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String getDevConfiguration() {
        System.out.println("Configurando Dev");
        System.out.println(appMensagem);
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        return "DB connection on DEV";
    }

    @Profile("prod")
    @Bean
    public String getProdConfiguration() {
        System.out.println("Configurando Production");
        System.out.println(appMensagem);
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

        return "DB connection on PRODUCTION";
    }

    public String getAppMensagem() {
        return appMensagem;
    }

    public void setAppMensagem(String mensagem) {
        this.appMensagem = mensagem;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
