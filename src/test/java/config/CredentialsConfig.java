package config;

import com.codeborne.selenide.Config;
import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/credentials.properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
