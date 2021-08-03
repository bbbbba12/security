package test.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.security.repository.AccessIpRepository;
import test.security.repository.ResourcesRepository;
import test.security.sercive.SecurityResourcesService;

@Configuration
public class AppConfig {
//
//    @Bean
//    public SecurityResourcesService securityResourcesService(ResourcesRepository resourcesRepository, AccessIpRepository accessIpRepository) {
//        SecurityResourcesService securityResourcesService = new SecurityResourcesService(resourcesRepository, accessIpRepository);
//        return securityResourcesService;
//    }
}
