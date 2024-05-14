package org.spring.groupAir.department.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;
import org.spring.groupAir.schedule.entity.ScheduleEntity;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "department")
public class DepartmentEntity extends BaseTimeEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long id;

    @Column(nullable = false)
    public String departmentName;

    @OneToMany(mappedBy = "departmentEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<MemberEntity> memberEntityList;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topDepartment_id")
    private TopDepartmentEntity topDepartmentEntity;

}
