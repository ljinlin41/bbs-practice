package cn.ljlin233.resource.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ResourceResponse
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResourceResponse {

    private int totalCount;

    private List<Resource> resources;
    
}