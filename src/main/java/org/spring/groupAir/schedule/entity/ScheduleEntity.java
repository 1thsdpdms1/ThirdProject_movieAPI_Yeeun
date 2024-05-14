package org.spring.groupAir.schedule.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "schedule")
public class ScheduleEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long id;

    @Column(nullable = false)
    public String title;

    @Column(nullable = false)
    public String content;

    @Column(nullable = false)
    public String startDate;

    @Column(nullable = false)
    public String endDate;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private MemberEntity memberEntity;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scheduleSeparate_id")
    private ScheduleSeparateEntity scheduleSeparateEntity;

}
