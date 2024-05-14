package org.spring.groupAir.commute.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.member.entity.MemberEntity;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "commute")
public class CommuteEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commute_id")
    private Long id;

    @Column(nullable = true)
    public int vacation;

    @Column(nullable = true)
    public String inTime;

    @Column(nullable = true)
    private String outTime;

    @Column(nullable = true)
    private String cause;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private MemberEntity memberEntity;


}
