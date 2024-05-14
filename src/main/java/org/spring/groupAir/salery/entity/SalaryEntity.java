package org.spring.groupAir.salery.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;
import org.spring.groupAir.role.Role;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "salary")
public class SalaryEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salary_id")
    private Long id;

    @Column(nullable = false)
    public String paymentDate;

    @Column(nullable = false)
    public String pay;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private MemberEntity memberEntity;



}
