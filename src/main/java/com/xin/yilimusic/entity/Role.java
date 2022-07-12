package com.xin.yilimusic.entity;

import com.xin.yilimusic.entity.abs.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Role extends AbstractEntity {
    private String name;

    private String title;
}