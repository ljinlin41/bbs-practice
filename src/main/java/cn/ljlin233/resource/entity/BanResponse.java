package cn.ljlin233.resource.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * BanResponse
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BanResponse {

    private Integer totalCount;

    private List<Ban> bans;
}