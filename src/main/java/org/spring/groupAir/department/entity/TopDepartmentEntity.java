package org.spring.groupAir.department.entity;

import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "topDepartment")
public class TopDepartmentEntity  extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topDepartment_id")
    private Long id;

    @Column(nullable = false)
    public String topDepartmentName;

    @OneToMany(mappedBy = "topDepartmentEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<DepartmentEntity> departmentEntityList;

}
