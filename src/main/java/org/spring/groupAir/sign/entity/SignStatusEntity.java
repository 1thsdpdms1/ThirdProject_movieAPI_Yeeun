package org.spring.groupAir.sign.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.spring.groupAir.contraint.BaseTimeEntity;
import org.spring.groupAir.schedule.entity.ScheduleSeparateEntity;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "signStatus")
public class SignStatusEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "signStatus_id")
    private Long id;

    @Column(nullable = false)
    public String signOkTime;



    @OneToMany(mappedBy = "signStatusEntity"
        , fetch = FetchType.LAZY
        , cascade = CascadeType.REMOVE)
    private List<SignEntity> signEntityList;

}
