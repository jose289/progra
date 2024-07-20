
package com.tienda.Tienda;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotacion.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionlocaleResolver;

@Configuration
public class ProyectConfig implements WebMvcConfigurer{
    
    @Bean
    public LocaleResolver localResolver(){
    var slr = new SessionLocalResolver();
    slr.setDefaultLocale(Locale.getDefault());
    slr.setLocaleAttributeName("session.current.locale");
    slr.setTimeZoneAttributeName("session.current.timezone");
    return slr;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
    var lcl = new LocaleChangeInterceptor();
lci.setParamName("lang")
return lci;
}
    
    }
      @Override
    public void addInterceptor(InterceptorRegistry registro){
    registro.addInterceptor(localeChangeInterceptor());
}

@Bean("messangeSource")
public MessangeSurce messangeSource () {
RosourceBundleMenssageSource messangeSource = new RosourceBundleMenssageSource();
messangeSource.setBasename("menssages");
menssageSurce.setDefaultEnconding("UTF-8");
return menssageSource;
}

