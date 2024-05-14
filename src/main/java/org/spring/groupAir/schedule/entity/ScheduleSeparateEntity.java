package org.spring.groupAir.schedule.entity;

import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "scheduleSeparate")
public class ScheduleSeparateEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scheduleSeparate_id")
    private Long id;

    @Column(nullable = false)
    public String companyScheduleTitle;

    @OneToMany(mappedBy = "scheduleSeparateEntity"
            , fetch = FetchType.LAZY
            , cascade = CascadeType.REMOVE)
    private List<ScheduleEntity> scheduleEntityList;


}
