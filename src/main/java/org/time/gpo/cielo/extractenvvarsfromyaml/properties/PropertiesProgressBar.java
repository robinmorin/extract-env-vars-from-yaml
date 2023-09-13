package org.time.gpo.cielo.extractenvvarsfromyaml.properties;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
@ConfigurationProperties("app.progress-bar")
public class PropertiesProgressBar {
    private Integer min;
    private Integer max;
    private Integer step;
    private Listener listener;

    @Getter
    @Setter
    public static class Listener {
        private Integer duration;
        private Integer socketPort;
    }

}
