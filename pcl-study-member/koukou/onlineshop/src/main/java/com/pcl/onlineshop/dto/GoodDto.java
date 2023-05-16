package com.pcl.onlineshop.dto;

import com.pcl.onlineshop.dto.entity.GoodEntity;
import lombok.Data;

import java.util.List;

@Data
public class GoodDto extends GoodEntity {

    private List<GoodImage> goodImageList;
}
