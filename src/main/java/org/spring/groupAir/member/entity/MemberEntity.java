package org.spring.groupAir.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.board.entity.BoardEntity;
import org.spring.groupAir.commute.entity.CommuteEntity;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.department.entity.DepartmentEntity;
import org.spring.groupAir.role.Role;
import org.spring.groupAir.salery.entity.SalaryEntity;
import org.spring.groupAir.schedule.entity.ScheduleEntity;
import org.spring.groupAir.sign.entity.SignEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "employee")
public class MemberEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String userEmail;

    @Column(nullable = false)
    private String userPw;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = false)
    private String employeeDate;

    @Column(nullable = true)
    private String resignationDate;

    @Column(nullable = false)
    private int memberAttachFile;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<MemberFileEntity> memberFileEntityList;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<BoardEntity> boardEntityList;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<CommuteEntity> commuteEntityList;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<SalaryEntity> salaryEntityList;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<ScheduleEntity> scheduleEntityList;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private PositionEntity positionEntity;

    @OneToMany(mappedBy = "memberEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<SignEntity> signEntityList;

}
