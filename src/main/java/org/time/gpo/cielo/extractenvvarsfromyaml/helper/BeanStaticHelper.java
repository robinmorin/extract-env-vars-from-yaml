package org.time.gpo.cielo.extractenvvarsfromyaml.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanStaticHelper {

    private static BeanStaticHelper INSTANCE;

    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void registerInstance() {
        INSTANCE = this;
    }

    public static <T> T getBean(Class<T> tClass) {
        return INSTANCE.applicationContext.getBean(tClass);
    }

}

