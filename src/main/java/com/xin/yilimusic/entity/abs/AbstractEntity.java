package com.xin.yilimusic.entity.abs;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class AbstractEntity {

    @Id
    @GenericGenerator(name = "ksuid", strategy = "com.xin.yilimusic.utils.KsuidIdentifierGenerator")
    @GeneratedValue(generator = "ksuid")
    private String id;

    @CreationTimestamp
    private Date createdTime;

    @UpdateTimestamp
    private Date updatedTime;
}
