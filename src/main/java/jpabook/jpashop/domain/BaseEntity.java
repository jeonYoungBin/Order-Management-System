package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {
    @Column(name = "INSERT_MEMBER")
    private String createBy;
    private LocalDateTime createDate;

    @Column(name = "UPDATE_MEMBER")
    private String modifyBy;
    private LocalDateTime modifyDate;
}
