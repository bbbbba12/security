package test.security.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.security.domain.entity.Role;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourcesDto{

    private String id;
    private String resourceName;
    private String httpMethod;
    private int orderNum;
    private String resourceType;
    private String roleName;
    private Set<Role> roleSet;

}