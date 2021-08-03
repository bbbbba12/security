package test.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.security.domain.entity.Resources;

import java.util.List;

public interface ResourcesRepository extends JpaRepository<Resources, Long> {

    Resources findByResourceNameAndHttpMethod(String resourceName, String httpMethod);

    @Query("select r from Resources r join fetch r.roleSet where r.resourceType = 'url' order by r.orderNum desc")
    List<Resources> findAllResources();

    @Query("select r from Resources r join fetch r.roleSet where r.resourceType = 'method' order by r.orderNum desc")
    List<Resources> findAllMethodResources();

    @Query("select r from Resources r join fetch r.roleSet where r.resourceType = 'pointcut' order by r.orderNum desc")
    List<Resources> findAllPointcutResources();
}